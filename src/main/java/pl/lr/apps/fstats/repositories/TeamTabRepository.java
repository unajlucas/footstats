package pl.lr.apps.fstats.repositories;

import java.util.List;

import pl.lr.apps.fstats.entities.TeamTab;
import org.springframework.data.repository.CrudRepository;

public interface TeamTabRepository extends CrudRepository<TeamTab, Integer> {

    @Override
    List<TeamTab> findAll();

}
