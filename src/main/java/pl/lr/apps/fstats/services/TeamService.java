package pl.lr.apps.fstats.services;

import pl.lr.apps.fstats.entities.TeamV;

import java.util.List;

public interface TeamService {

    List<TeamV> getAllTeamsBySeason(int s_id);

    TeamV getTeam(String name, int s_id);

    Integer findTeamIdByName(String name);
}
