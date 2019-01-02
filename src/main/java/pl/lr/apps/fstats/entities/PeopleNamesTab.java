package pl.lr.apps.fstats.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PEOPLE_NAMES_TAB")
public class PeopleNamesTab {

    @Id
    private int p_id;

    @Column(name = "BBC", nullable = true)
    private String bbc;

    @Column(name = "N1", nullable = true)
    private String n1;

    @Column(name = "N2", nullable = true)
    private String n2;

    @Column(name = "N3", nullable = true)
    private String n3;

    @Column(name = "N4", nullable = true)
    private String n4;

    @Column(name = "N5", nullable = true)
    private String n5;

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getBbc() {
        return bbc;
    }

    public void setBbc(String bbc) {
        this.bbc = bbc;
    }

    public String getN1() {
        return n1;
    }

    public void setN1(String n1) {
        this.n1 = n1;
    }

    public String getN2() {
        return n2;
    }

    public void setN2(String n2) {
        this.n2 = n2;
    }

    public String getN3() {
        return n3;
    }

    public void setN3(String n3) {
        this.n3 = n3;
    }

    public String getN4() {
        return n4;
    }

    public void setN4(String n4) {
        this.n4 = n4;
    }

    public String getN5() {
        return n5;
    }

    public void setN5(String n5) {
        this.n5 = n5;
    }

}
