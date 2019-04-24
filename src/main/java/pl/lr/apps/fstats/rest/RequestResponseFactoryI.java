package pl.lr.apps.fstats.rest;

import pl.lr.apps.fstats.rest.models.Competition;
import pl.lr.apps.fstats.rest.models.Competitions;
import pl.lr.apps.fstats.rest.models.Team;
import pl.lr.apps.fstats.rest.models.Teams;

public interface RequestResponseFactoryI {

    Competitions makeCompetitionsRequestResponse(Integer season);

    Competition makeCompetitionRequestResponse(String competition, Integer sid);

    Teams makeTeamsRequestResponse(Integer season);

    Team makeTeamRequestResponse(String team, int s_id);
}
