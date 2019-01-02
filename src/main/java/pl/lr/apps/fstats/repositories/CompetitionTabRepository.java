package pl.lr.apps.fstats.repositories;

import java.util.List;

import pl.lr.apps.fstats.entities.CompetitionTab;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CompetitionTabRepository extends CrudRepository<CompetitionTab, Integer> {

    @Override
    List<CompetitionTab> findAll();

    @Query("SELECT ct.c_id FROM CompetitionTab ct WHERE ct.name=:competition")
    Integer findCompetitionIdByName(@Param("competition") String competition);
}
