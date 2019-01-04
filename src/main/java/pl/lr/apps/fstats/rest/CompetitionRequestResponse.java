package pl.lr.apps.fstats.rest;

import pl.lr.apps.fstats.entities.CompetitionSummaryV;
import pl.lr.apps.fstats.entities.MatchV;
import pl.lr.apps.fstats.enums.Views;
import pl.lr.apps.fstats.model.CompetitionVM;
import pl.lr.apps.fstats.services.CompetitionService;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.lr.apps.fstats.services.MatchService;
import pl.lr.apps.fstats.utils.GoalDiffComparator;
import pl.lr.apps.fstats.utils.MoreGoalsForComparator;
import pl.lr.apps.fstats.utils.PointComparator;
import pl.lr.apps.fstats.utils.Serie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
public class CompetitionRequestResponse extends RequestResponseComponents implements Request, Response {

    private static final Logger logger = LoggerFactory.getLogger(CompetitionRequestResponse.class);

    private static final String CLASS_NAME = " [CompetitionRequestResponse] ";

    private CompetitionService competitionService;
    private MatchService matchService;
    private String competition;
    private List<CompetitionVM> competitionVMList;

    public CompetitionRequestResponse(String competition, Integer sid){
        super(Views.competition.name());
        setSid(sid);
        this.competition = competition;
        this.competitionVMList = new ArrayList<>();
    }

    @Override
    public void processRequest() {
        logger.info("{} processRequest() started.", CLASS_NAME);
        List<CompetitionSummaryV> competitionSummaryVS = competitionService.getCompetitionTableDetails(competition, sid);
        Collections.sort(competitionSummaryVS, new MoreGoalsForComparator());
        Collections.sort(competitionSummaryVS, new GoalDiffComparator());
        Collections.sort(competitionSummaryVS, new PointComparator());
        for (CompetitionSummaryV competitionSummaryV : competitionSummaryVS){
            competitionVMList.add(CompetitionVM.convertToV(competitionSummaryV));
        }
        List<MatchV> matches = matchService.findAllMatchesByCompetitionNameAndSid(competition, sid);
        for (MatchV match : matches){
            if (match.getHg() > match.getAg()){
                addSerie(match.getHome_team(), Serie.Win);
                addSerie(match.getAway_team(), Serie.Lose);
            } else if (match.getHg() < match.getAg()){
                addSerie(match.getHome_team(), Serie.Lose);
                addSerie(match.getAway_team(), Serie.Win);
            } else {
                addSerie(match.getHome_team(), Serie.Draw);
                addSerie(match.getAway_team(), Serie.Draw);
            }
        }
        logger.info("{} processRequest() finished.", CLASS_NAME);
    }

    @Override
    public void processResponse() {
        logger.info("{} processResponse() started.", CLASS_NAME);
        modelAndViewResponse.addObject("competition", competitionVMList);
        logger.info("{} processResponse() finished.", CLASS_NAME);
    }

    private void addSerie(String team, String serie){
        int i = findTeamIndex(team);
        //logger.info("i " + i + " size " + competitionVMList.size() + ", t: " + team);
        competitionVMList.get(i).addSerie(serie);
    }

    private int findTeamIndex(String team){
        for (int ix=0; ix<competitionVMList.size(); ++ix){
            if(competitionVMList.get(ix).getTeam().equals(team)){
                return ix;
            }
        }
        return -1;
    }
}
