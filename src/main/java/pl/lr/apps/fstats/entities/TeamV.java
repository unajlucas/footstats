package pl.lr.apps.fstats.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "team")
public class TeamV {

    @Id
    private Integer det_id;

    @Column(name = "s_id")
    private Integer s_id;

    @Column(name = "season")
    private String season;

    @Column(name = "competition")
    private String competition;

    @Column(name = "t_id")
    private Integer t_id;

    @Column(name = "name")
    private String name;

    @Column(name = "city")
    private String city;

    @Column(name = "n1")
    private String n1;

    @Column(name = "n2")
    private String n2;

    @Column(name = "n3")
    private String n3;

    @Column(name = "n4")
    private String n4;

    public Integer getDet_id() {
        return det_id;
    }

    public void setDet_id(Integer det_id) {
        this.det_id = det_id;
    }

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getCompetition() {
        return competition;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
}
