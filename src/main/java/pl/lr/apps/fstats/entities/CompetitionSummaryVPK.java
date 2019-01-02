package pl.lr.apps.fstats.entities;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter
public class CompetitionSummaryVPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "s_id")
    private Integer sId;

    @Column(name = "c_id")
    private Integer cId;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        CompetitionSummaryVPK that = (CompetitionSummaryVPK) o;
        return Objects.equals(sId, that.sId) &&
                Objects.equals(cId, that.cId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sId, cId);
    }
}
