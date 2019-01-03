package pl.lr.apps.fstats.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.lr.apps.fstats.entities.TeamNamesTab;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TeamNamesTabRepository extends JpaRepository<TeamNamesTab, Integer> {

    @Override
    List<TeamNamesTab> findAll();

    @Query("SELECT t.id FROM TeamNamesTab t WHERE t.n1=:name OR t.n2=:name OR t.n3=:name OR t.n4=:name")
    Integer findTeamIdByName(@Param("name") String name);
}
