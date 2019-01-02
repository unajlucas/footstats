package pl.lr.apps.fstats.repositories;

import java.util.List;

import pl.lr.apps.fstats.entities.PeopleTab;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PeopleTabRepository extends CrudRepository<PeopleTab, Integer> {

    @Query("SELECT p FROM PeopleTab p WHERE p.role=:role")
    List<PeopleTab> getAllPeopleByRole(@Param("role") String role);

}
