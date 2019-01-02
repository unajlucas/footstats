package pl.lr.apps.fstats.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MATCH_SQUADS_TAB")
public class MatchSquadsTab {

    @Id
    private int sq_id;

    @Column(name = "ROLE")
    private String role;

    @Column(name = "M_ID")
    private int m_id;

    @Column(name = "T_ID")
    private int t_id;

    @Column(name = "P_ID")
    private int p_id;

    @Column(name = "SUBST")
    private int subst;

    @Column(name = "SP_ID")
    private int sp_id;

    @Column(name = "M_TIME")
    private int m_time;

    public int getSq_id() {
        return sq_id;
    }

    public void setSq_id(int sq_id) {
        this.sq_id = sq_id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

    public int getSubst() {
        return subst;
    }

    public void setSubst(int subst) {
        this.subst = subst;
    }

    public int getSp_id() {
        return sp_id;
    }

    public void setSp_id(int sp_id) {
        this.sp_id = sp_id;
    }

    public int getM_time() {
        return m_time;
    }

    public void setM_time(int m_time) {
        this.m_time = m_time;
    }

}
