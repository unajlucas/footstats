package pl.lr.apps.fstats.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.lr.apps.fstats.entities.PeopleTmpTab;

public interface PeopleTmpTabRepository extends JpaRepository<PeopleTmpTab, Integer> {
}
