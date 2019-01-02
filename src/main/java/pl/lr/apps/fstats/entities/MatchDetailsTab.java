package pl.lr.apps.fstats.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MATCH_DETAILS_TAB")
public class MatchDetailsTab {

    @Id
    private int d_id;

    @Column(name = "M_ID")
    private int m_id;

    @Column(name = "T_ID")
    private int t_id;

    @Column(name = "P_ID")
    private int p_id;

    @Column(name = "TIME")
    private int time;

    @Column(name = "DETAIL")
    private String detail;

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

}
