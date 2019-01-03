package pl.lr.apps.fstats.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.lr.apps.fstats.entities.SeasonTab;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SeasonRepository extends JpaRepository<SeasonTab, Integer> {

    @Query("SELECT st.sId FROM SeasonTab st WHERE st.season LIKE :year||'/%'")
    Integer findSeasonIdByYear(@Param("year") String year);
}
