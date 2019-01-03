package pl.lr.apps.fstats.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "competition_summary")
@Data
public class CompetitionSummaryV {

    @EmbeddedId
    private CompetitionSummaryVPK competitionSummaryVPK;

//    @Column(name = "team")
//    private String team;

    @Column(name = "p")
    private Integer p;

    @Column(name = "w")
    private Integer w;

    @Column(name = "d")
    private Integer d;

    @Column(name = "l")
    private Integer l;

    @Column(name = "f")
    private Integer f;

    @Column(name = "a")
    private Integer a;

    @Column(name = "gd")
    private Integer gd;

    @Column(name = "pts")
    private Integer pts;
}
