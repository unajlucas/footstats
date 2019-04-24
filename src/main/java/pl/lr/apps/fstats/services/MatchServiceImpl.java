package pl.lr.apps.fstats.services;

import pl.lr.apps.fstats.entities.MatchTab;
import pl.lr.apps.fstats.entities.MatchV;
import pl.lr.apps.fstats.repositories.MatchTabRepository;
import pl.lr.apps.fstats.repositories.MatchVRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("matchService")
public class MatchServiceImpl implements MatchService {

    private static final Logger logger = LoggerFactory.getLogger(MatchServiceImpl.class);

    private final MatchVRepository matchRepository;
    private final MatchTabRepository matchTabRepository;

    public MatchServiceImpl(MatchVRepository matchVRepository, MatchTabRepository matchTabRepository){
        this.matchRepository = matchVRepository;
        this.matchTabRepository = matchTabRepository;
    }

    @Override
    public List<MatchV> getAllMatchesBySeasonId(int s_id) {
        logger.info("getting all matches by season {}", s_id);
        return matchRepository.findAllbySeasonId(s_id);
    }

    @Override
    public MatchTab findMatchBySeasonIdAndHomeTeamIdAndAwayTeamId(int sId, int ht_id, int at_id) {
        return matchTabRepository.findMatchBySeasonIdAndHomeTeamIdAndAwayTeamId(sId, ht_id, at_id);
    }

    @Override
    public List<MatchV> findAllMatchesByCompetitionNameAndSid(String competition, Integer sid) {
        return matchRepository.findAllbyCompetitionNameAndSeasonId(competition, sid);
    }

}
