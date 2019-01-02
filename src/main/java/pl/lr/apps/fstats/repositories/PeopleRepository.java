package pl.lr.apps.fstats.repositories;

import pl.lr.apps.fstats.entities.People;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PeopleRepository extends PagingAndSortingRepository<People, Integer> {

}
