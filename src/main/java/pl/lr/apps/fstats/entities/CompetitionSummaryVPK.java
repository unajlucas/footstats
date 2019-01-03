package pl.lr.apps.fstats.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter
@Setter
public class CompetitionSummaryVPK implements Serializable {

    private static final long serialVersionUID = -793010578394013111L;

    @Column(name = "team", nullable = false)
    private String team;

    @Column(name = "s_id", nullable = false)
    private Integer sId;

    @Column(name = "c_id", nullable = false)
    private Integer cId;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((team == null) ? 0 : team.hashCode());
        result = prime * result + ((sId == null) ? 0 : sId.hashCode());
        result = prime * result + ((cId == null) ? 0 : cId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CompetitionSummaryVPK other = (CompetitionSummaryVPK) obj;
        if (team == null) {
            if (other.team != null)
                return false;
        } else if (!team.equals(other.team))
            return false;
        if (sId == null) {
            if (other.sId != null)
                return false;
        } else if (!sId.equals(other.sId))
            return false;
        if (cId == null) {
            if (other.cId != null)
                return false;
        } else if (!cId.equals(other.cId))
            return false;
        return true;
    }
}
