package pl.lr.apps.fstats.rest;

public interface RequestResponseFactory {

    MatchRequestResponse makeMatchRequestResponse(int s_id);

    CompetitionsRequestResponse makeCompetitionsRequestResponse();

    CompetitionRequestResponse makeCompetitionRequestResponse(String competition, Integer sid);

    TeamsRequestResponse makeTeamsRequestResponse(int s_id);

    TeamRequestResponse makeTeamRequestResponse(String team, int s_id);

    ImportsRequestResponse makeImportsRequestResponseGetView();

    ImportsRequestResponse makeImportsRequestResponseImportMatches(String competition);
}
