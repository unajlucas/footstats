package pl.lr.apps.fstats.services;

import pl.lr.apps.fstats.entities.CompetitionSummaryV;
import pl.lr.apps.fstats.entities.CompetitionTab;
import pl.lr.apps.fstats.repositories.CompetitionSummaryVRepository;
import pl.lr.apps.fstats.repositories.CompetitionTabRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;

import java.util.List;

@Service("competitionService")
public class CompetitionServiceImpl implements CompetitionService {

    private static final Logger logger = LoggerFactory.getLogger(CompetitionServiceImpl.class);

    private final CompetitionTabRepository competitionRepository;

    private final CompetitionSummaryVRepository competitionSummaryVRepository;

    public CompetitionServiceImpl(CompetitionTabRepository competitionTabRepository, CompetitionSummaryVRepository competitionSummaryVRepository) {
        this.competitionRepository = competitionTabRepository;
        this.competitionSummaryVRepository = competitionSummaryVRepository;
    }

    @Override
    public List<CompetitionTab> getAllCompetitions() {
        return competitionRepository.findAll();
    }

    @Override
    public List<CompetitionSummaryV> getCompetitionTableDetails(String competition, Integer sid) {
        logger.info("competition " + competition);
        Integer cid = competitionRepository.findCompetitionIdByName(competition);
        logger.info("sid... " + sid);
        logger.info("cid... " + cid);
        return competitionSummaryVRepository.findAllBySidAndCid(sid, cid);
    }

}
