package pl.lr.apps.fstats.entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PEOPLE_TAB")
public class PeopleTab {

    @Id
    private int p_id;

    @Column(name = "T_ID")
    private int t_id;

    @Column(name = "SHIRT_NO")
    private int shirt_no;

    @Column(name = "FNAME")
    private String fname;

    @Column(name = "LNAME")
    private String lname;

    @Column(name = "NATIONALITY")
    private String nationality;

    @Column(name = "BIRTH", nullable = true)
    private String birthdate;

    @Column(name = "ROLE")
    private String role;

    @Column(name = "SUBROLE")
    private String subrole;

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public int getShirt_no() {
        return shirt_no;
    }

    public void setShirt_no(int shirt_no) {
        this.shirt_no = shirt_no;
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

}
