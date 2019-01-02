package pl.lr.apps.fstats.repositories;

import pl.lr.apps.fstats.entities.MatchTab;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface MatchTabRepository extends CrudRepository<MatchTab, Integer> {

    @Query("SELECT t FROM MatchTab t WHERE t.s_id=:sId AND t.ht_id=:ht_id AND t.at_id=:at_id")
    MatchTab findMatchBySeasonIdAndHomeTeamIdAndAwayTeamId(@Param("sId") int sId, @Param("ht_id") int ht_id,
            @Param("at_id") int at_id);
}
