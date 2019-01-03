package pl.lr.apps.fstats.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.lr.apps.fstats.entities.TeamTab;

public interface TeamTabRepository extends JpaRepository<TeamTab, Integer> {

    @Override
    List<TeamTab> findAll();

}
