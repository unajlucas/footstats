package pl.lr.apps.fstats.repositories;

import java.util.List;

import pl.lr.apps.fstats.entities.TeamV;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface TeamVRepository extends CrudRepository<TeamV, Integer> {

    @Query("SELECT t FROM TeamV t WHERE t.s_id=:s_id")
    List<TeamV> findBySeasonId(@Param("s_id") Integer s_id);

    @Query("SELECT t FROM TeamV t WHERE t.name=:team AND t.s_id=:s_id")
    TeamV findTeamByName(@Param("team") String team, @Param("s_id") int s_id);

}
