package pl.lr.apps.fstats.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PEOPLE")
public class People {

    @Id
    int p_id;

    @Column(name = "FNAME")
    private String fname;

    @Column(name = "LNAME")
    private String lname;

    @Column(name = "NATIONALITY")
    private String nationality;

    @Column(name = "BIRTH")
    private String birthdate;

    @Column(name = "ROLE")
    private String role;

    @Column(name = "SUBROLE")
    private String subrole;

    @Column(name = "T_ID")
    private int t_id;

    @Column(name = "T_NAME")
    private String t_name;

    @Column(name = "BBC")
    private String bbc;

    @Column(name = "N1")
    private String n1;

    @Column(name = "N2")
    private String n2;

    @Column(name = "N3")
    private String n3;

    @Column(name = "N4")
    private String n4;

    @Column(name = "N5")
    private String n5;

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSubrole() {
        return subrole;
    }

    public void setSubrole(String subrole) {
        this.subrole = subrole;
    }

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
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
