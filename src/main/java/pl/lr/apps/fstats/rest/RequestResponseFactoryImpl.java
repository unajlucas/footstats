package pl.lr.apps.fstats.rest;

import org.springframework.core.env.Environment;
import pl.lr.apps.fstats.services.CompetitionService;
import pl.lr.apps.fstats.services.ImportService;
import pl.lr.apps.fstats.services.MatchService;
import pl.lr.apps.fstats.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestResponseFactoryImpl implements RequestResponseFactory {

    @Autowired
    private MatchService matchService;

    @Autowired
    private CompetitionService competitionService;

    @Autowired
    private TeamService teamService;

//    @Autowired
//    private ImportService importService;

    @Autowired
    private Environment environment;

    @Override
    public CompetitionsRequestResponse makeCompetitionsRequestResponse(Integer season) {
        CompetitionsRequestResponse competitionsRequestResponse = new CompetitionsRequestResponse(season);
        competitionsRequestResponse.setCompetitionService(competitionService);
        return competitionsRequestResponse;
    }

    @Override
    public CompetitionRequestResponse makeCompetitionRequestResponse(String competition, Integer sid) {
        CompetitionRequestResponse competitionRequestResponse = new CompetitionRequestResponse(competition, sid);
        competitionRequestResponse.setCompetitionService(competitionService);
        competitionRequestResponse.setMatchService(matchService);
        return competitionRequestResponse;
    }

    @Override
    public TeamsRequestResponse makeTeamsRequestResponse(Integer season) {
        TeamsRequestResponse teamsRequestResponse = new TeamsRequestResponse(season);
        teamsRequestResponse.setTeamService(teamService);
        return teamsRequestResponse;
    }

    @Override
    public TeamRequestResponse makeTeamRequestResponse(String team, int s_id) {
        TeamRequestResponse teamRequestResponse = new TeamRequestResponse(team, s_id);
        teamRequestResponse.setTeamService(teamService);
        return teamRequestResponse;
    }

//    @Override
//    public MatchRequestResponse makeMatchRequestResponse(int s_id) {
//        MatchRequestResponse matchRequestResponse = new MatchRequestResponse();
//        matchRequestResponse.setMatchService(matchService);
//        matchRequestResponse.setS_id(s_id);
//        return matchRequestResponse;
//    }

//    @Override
//    public ImportsRequestResponse makeImportsRequestResponseGetView() {
//        return new ImportsRequestResponse();
//    }
//
//    @Override
//    public ImportsRequestResponse makeImportsRequestResponseImportMatches(String competition) {
//        ImportsRequestResponse importsRequestResponse = new ImportsRequestResponse(competition);
//        importsRequestResponse.setImportService(importService);
//        return importsRequestResponse;
//    }
}
