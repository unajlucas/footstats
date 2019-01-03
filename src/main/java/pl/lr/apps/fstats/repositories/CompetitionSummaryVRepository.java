package pl.lr.apps.fstats.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.lr.apps.fstats.entities.CompetitionSummaryV;
import pl.lr.apps.fstats.entities.CompetitionSummaryVPK;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CompetitionSummaryVRepository extends JpaRepository<CompetitionSummaryV, CompetitionSummaryVPK> {

    @Query("SELECT cs FROM CompetitionSummaryV as cs WHERE cs.competitionSummaryVPK.sId=:sId"
            + " AND cs.competitionSummaryVPK.cId=:cId")
    List<CompetitionSummaryV> findAllBySidAndCid(@Param("sId") Integer sId, @Param("cId") Integer cId);
}
