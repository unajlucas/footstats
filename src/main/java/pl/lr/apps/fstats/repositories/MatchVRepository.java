package pl.lr.apps.fstats.repositories;

import java.util.List;

import pl.lr.apps.fstats.entities.MatchV;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface MatchVRepository extends CrudRepository<MatchV, Integer> {

    @Query("SELECT m FROM MatchV m WHERE m.s_id=:s_id")
    List<MatchV> findAllbySeasonId(@Param("s_id") Integer s_id);

}
