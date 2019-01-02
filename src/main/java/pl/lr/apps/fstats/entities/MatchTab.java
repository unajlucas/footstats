package pl.lr.apps.fstats.entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MATCH_TAB")
public class MatchTab {
    @Id
    private int m_id;

    @Column(name = "S_ID")
    private int s_id;

    @Column(name = "FDATE")
    private Timestamp date;

    @Column(name = "C_ID")
    private int c_id;

    @Column(name = "HT_ID")
    private int ht_id;

    @Column(name = "AT_ID")
    private int at_id;

    @Column(name = "HG", nullable = true)
    private Integer hg;

    @Column(name = "AG", nullable = true)
    private Integer ag;

    @Column(name = "OT")
    private int ot;

    @Column(name = "OT_HG", nullable = true)
    private Integer ot_hg;

    @Column(name = "OT_AG", nullable = true)
    private Integer ot_ag;

    @Column(name = "PEN")
    private int pen;

    @Column(name = "P_HG", nullable = true)
    private Integer p_hg;

    @Column(name = "P_AG", nullable = true)
    private Integer p_ag;

    @Column(name = "R_ID", nullable = true)
    private Integer r_id;

    @Column(name = "FT", nullable = true)
    private Integer ft;

    @Column(name = "ATTENDANCE", nullable = true)
    private Integer attendance;

    public void setValues(int s_id, int c_id, Timestamp date, int ht_id, int at_id, int hg, int ag) {
        this.s_id = s_id;
        this.c_id = c_id;
        this.date = date;
        this.ht_id = ht_id;
        this.at_id = at_id;
        this.hg = hg;
        this.ag = ag;
    }

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public int getHt_id() {
        return ht_id;
    }

    public void setHt_id(int ht_id) {
        this.ht_id = ht_id;
    }

    public int getAt_id() {
        return at_id;
    }

    public void setAt_id(int at_id) {
        this.at_id = at_id;
    }

    public Integer getHg() {
        return hg;
    }

    public void setHg(Integer hg) {
        this.hg = hg;
    }

    public Integer getAg() {
        return ag;
    }

    public void setAg(Integer ag) {
        this.ag = ag;
    }

    public int getOt() {
        return ot;
    }

    public void setOt(int ot) {
        this.ot = ot;
    }

    public Integer getOt_hg() {
        return ot_hg;
    }

    public void setOt_hg(Integer ot_hg) {
        this.ot_hg = ot_hg;
    }

    public Integer getOt_ag() {
        return ot_ag;
    }

    public void setOt_ag(Integer ot_ag) {
        this.ot_ag = ot_ag;
    }

    public int getPen() {
        return pen;
    }

    public void setPen(int pen) {
        this.pen = pen;
    }

    public Integer getP_hg() {
        return p_hg;
    }

    public void setP_hg(Integer p_hg) {
        this.p_hg = p_hg;
    }

    public Integer getP_ag() {
        return p_ag;
    }

    public void setP_ag(Integer p_ag) {
        this.p_ag = p_ag;
    }

    public int getFt() {
        return ft;
    }

    public void setFt(int ft) {
        this.ft = ft;
    }

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public void setR_id(Integer r_id) {
        this.r_id = r_id;
    }

    public void setFt(Integer ft) {
        this.ft = ft;
    }

    @Override
    public String toString() {
        return "MatchTab [m_id=" + m_id + ", s_id=" + s_id + ", date=" + date + ", c_id=" + c_id + ", ht_id=" + ht_id
                + ", at_id=" + at_id + ", hg=" + hg + ", ag=" + ag + ", ot=" + ot + ", ot_hg=" + ot_hg + ", ot_ag="
                + ot_ag + ", pen=" + pen + ", p_hg=" + p_hg + ", p_ag=" + p_ag + ", r_id=" + r_id + ", ft=" + ft
                + ", attendance=" + attendance + "]";
    }

}
