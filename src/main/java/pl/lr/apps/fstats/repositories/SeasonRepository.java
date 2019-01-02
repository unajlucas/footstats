package pl.lr.apps.fstats.repositories;

import pl.lr.apps.fstats.entities.SeasonTab;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface SeasonRepository extends CrudRepository<SeasonTab, Integer> {

    @Query("SELECT st.sId FROM SeasonTab st WHERE st.season LIKE :year||'/%'")
    Integer findSeasonIdByYear(@Param("year") String year);
}
