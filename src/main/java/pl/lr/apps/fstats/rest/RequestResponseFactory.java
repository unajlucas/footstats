package pl.lr.apps.fstats.rest;

public interface RequestResponseFactory {

    CompetitionsRequestResponse makeCompetitionsRequestResponse(Integer season);

    CompetitionRequestResponse makeCompetitionRequestResponse(String competition, Integer sid);

    TeamsRequestResponse makeTeamsRequestResponse(Integer season);

    TeamRequestResponse makeTeamRequestResponse(String team, int s_id);

//    ImportsRequestResponse makeImportsRequestResponseGetView();
//
//    ImportsRequestResponse makeImportsRequestResponseImportMatches(String competition);
}
