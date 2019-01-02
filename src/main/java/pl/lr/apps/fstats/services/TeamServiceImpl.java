package pl.lr.apps.fstats.services;

import pl.lr.apps.fstats.entities.TeamV;
import pl.lr.apps.fstats.repositories.TeamNamesTabRepository;
import pl.lr.apps.fstats.repositories.TeamVRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("teamService")
public class TeamServiceImpl implements TeamService {

    private static final Logger logger = LoggerFactory.getLogger(TeamServiceImpl.class);

    @Autowired
    private TeamVRepository teamVRepository;

    @Autowired
    private TeamNamesTabRepository teamNamesTabRepository;

    @Override
    public List<TeamV> getAllTeamsBySeason(int s_id) {
        logger.info("getting allTeamsBySeason");
        return teamVRepository.findBySeasonId(s_id);
    }

    @Override
    public TeamV getTeam(String name, int s_id) {
        logger.info("getting team by name, {}", name);
        return teamVRepository.findTeamByName(name, s_id);
    }

    @Override
    public Integer findTeamIdByName(String name) {
        return teamNamesTabRepository.findTeamIdByName(name);
    }
}
