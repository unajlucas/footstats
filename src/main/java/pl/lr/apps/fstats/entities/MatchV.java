package pl.lr.apps.fstats.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "matches")
@Getter
@Setter
public class MatchV {

    @Id
    private int m_id;

    private String div;

    //@Column(name = "FDATE")
    //private Timestamp date;

    private String date;

    @Column(name = "s_id")
    private int s_id;

    @Column(name = "name")
    private String competition;

    @Column(name = "home_t")
    private String home_team;

    @Column(name = "away_t")
    private String away_team;

    @Column(name = "hg")
    private int hg;

    @Column(name = "ag")
    private int ag;

//    public int getM_id() {
//        return m_id;
//    }
//
//    public void setM_id(int m_id) {
//        this.m_id = m_id;
//    }
//
//    public Timestamp getDate() {
//        return date;
//    }
//
//    public void setDate(Timestamp date) {
//        this.date = date;
//    }
//
//    public int getS_id() {
//        return s_id;
//    }
//
//    public void setS_id(int s_id) {
//        this.s_id = s_id;
//    }
//
//    public String getCompetition() {
//        return competition;
//    }
//
//    public void setCompetition(String competition) {
//        this.competition = competition;
//    }
//
//    public String getHome_team() {
//        return home_team;
//    }
//
//    public void setHome_team(String home_team) {
//        this.home_team = home_team;
//    }
//
//    public String getAway_team() {
//        return away_team;
//    }
//
//    public void setAway_team(String away_team) {
//        this.away_team = away_team;
//    }
//
//    public int getHg() {
//        return hg;
//    }
//
//    public void setHg(int hg) {
//        this.hg = hg;
//    }
//
//    public int getAg() {
//        return ag;
//    }
//
//    public void setAg(int ag) {
//        this.ag = ag;
//    }

    @Override
    public String toString() {
        return "MatchV [m_id=" + m_id + ", date=" + date + ", s_id=" + s_id + ", competition=" + competition
                + ", home_team=" + home_team + ", away_team=" + away_team + ", hg=" + hg + ", ag=" + ag + "]";
    }

//    public void setDate(Date readDate) {
//        this.date = Utils.formatDateToTimestamp(readDate);
//    }

}
