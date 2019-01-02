package pl.lr.apps.fstats.services;

import pl.lr.apps.fstats.entities.CompetitionSummaryV;
import pl.lr.apps.fstats.entities.CompetitionTab;
import pl.lr.apps.fstats.repositories.CompetitionSummaryVRepository;
import pl.lr.apps.fstats.repositories.CompetitionTabRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("competitionService")
public class CompetitionServiceImpl extends ViewAbstract implements CompetitionService {

    private static final Logger logger = LoggerFactory.getLogger(CompetitionServiceImpl.class);

    @Autowired
    private CompetitionTabRepository competitionRepository;

    @Autowired
    private CompetitionSummaryVRepository competitionSummaryVRepository;

    @Override
    public List<CompetitionTab> getAllCompetitions() {
        return competitionRepository.findAll();
    }

    @Override
    public List<CompetitionSummaryV> getCompetitionTableDetails(String competition, Integer sid) {
        Integer cid = competitionRepository.findCompetitionIdByName(competition);
        return competitionSummaryVRepository.findAllBySidAndCid(sid, cid);
    }

}
