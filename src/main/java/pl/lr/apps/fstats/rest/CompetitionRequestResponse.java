package pl.lr.apps.fstats.rest;

import pl.lr.apps.fstats.entities.CompetitionSummaryV;
import pl.lr.apps.fstats.enums.Views;
import pl.lr.apps.fstats.services.CompetitionService;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Getter
@Setter
public class CompetitionRequestResponse extends ViewResponse implements RequestResponse {

    private static final Logger logger = LoggerFactory.getLogger(CompetitionRequestResponse.class);

    private static final String CLASS_NAME = " [CompetitionRequestResponse] ";

    private CompetitionService competitionService;
    private String competition;

    public CompetitionRequestResponse(String competition, Integer sid){
        super(Views.competition.name());
        setSid(sid);
        this.competition = competition;
    }

    @Override
    public void processRequest() {
        logger.info("{} processRequest() started.", CLASS_NAME);
        List<CompetitionSummaryV> competitionSummaryVS = competitionService.getCompetitionTableDetails(competition, sid);
        for (CompetitionSummaryV competitionSummaryV : competitionSummaryVS){
            logger.info(competitionSummaryV.getCompetitionSummaryVPK().getTeam());
        }
        modelAndViewResponse.addObject("competition", competitionSummaryVS);
        logger.info("{} processRequest() finished.", CLASS_NAME);
    }
}
