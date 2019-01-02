package pl.lr.apps.fstats.services;

import pl.lr.apps.fstats.entities.CompetitionSummaryV;
import pl.lr.apps.fstats.entities.CompetitionTab;

import java.util.List;

public interface CompetitionService {

    List<CompetitionTab> getAllCompetitions();

    List<CompetitionSummaryV> getCompetitionTableDetails(String competition, Integer sid);

}
