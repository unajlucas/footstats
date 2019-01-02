package pl.lr.apps.fstats.repositories;

import java.util.List;

import pl.lr.apps.fstats.entities.BetsTab;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface BetsRepository extends CrudRepository<BetsTab, Integer> {

    @Override
    List<BetsTab> findAll();

    @Query("SELECT b.cash FROM BetsTab b WHERE b.id_bet = (SELECT MAX(bt.id_bet) FROM BetsTab bt)")
    double getCashByLastId();

}
