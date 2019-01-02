package pl.lr.apps.fstats.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "types")
public class TypesTab {

    @Id
    private int id_type;

    @Column(name = "id_bet")
    private int id_bet;

    @Column(name = "h_team")
    private String h_team;

    @Column(name = "a_team")
    private String a_team;

    @Column(name = "hg")
    private int hg;

    @Column(name = "ag")
    private int ag;

    @Column(name = "course")
    private double course;

    @Column(name = "type")
    private String type;

    @Column(name = "scored")
    private int scored;

    public int getId_type() {
        return id_type;
    }

    public void setId_type(int id_type) {
        this.id_type = id_type;
    }

    public int getId_bet() {
        return id_bet;
    }

    public void setId_bet(int id_bet) {
        this.id_bet = id_bet;
    }

    public String getH_team() {
        return h_team;
    }

    public void setH_team(String h_team) {
        this.h_team = h_team;
    }

    public String getA_team() {
        return a_team;
    }

    public void setA_team(String a_team) {
        this.a_team = a_team;
    }

    public int getHg() {
        return hg;
    }

    public void setHg(int hg) {
        this.hg = hg;
    }

    public int getAg() {
        return ag;
    }

    public void setAg(int ag) {
        this.ag = ag;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getScored() {
        return scored;
    }

    public void setScored(int scored) {
        this.scored = scored;
    }
}
