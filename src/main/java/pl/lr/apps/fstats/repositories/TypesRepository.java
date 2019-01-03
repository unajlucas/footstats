package pl.lr.apps.fstats.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.lr.apps.fstats.entities.TypesTab;
import org.springframework.data.jpa.repository.Query;


public interface TypesRepository extends JpaRepository<TypesTab, Integer> {

    @Override
    List<TypesTab> findAll();

    @Query("SELECT max(t.id_bet) + 1 FROM TypesTab t")
    int getNextBetId();

    @Query("SELECT max(t.id_type) + 1 FROM TypesTab t")
    int getNextTypeId();
}
