package pl.lr.apps.fstats.services;

import pl.lr.apps.fstats.entities.MatchTab;
import pl.lr.apps.fstats.entities.MatchV;

import java.util.List;

public interface MatchService {

    List<MatchV> getAllMatchesBySeasonId(int s_id);

    MatchTab findMatchBySeasonIdAndHomeTeamIdAndAwayTeamId(int sId, int ht_id, int at_id);
}
