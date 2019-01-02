package pl.lr.apps.fstats.entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bets")
public class BetsTab {

    @Id
    private int id_bet;

    @Column(name = "date")
    private Timestamp date;

    @Column(name = "type")
    private String type;

    @Column(name = "stake")
    private double stake;

    @Column(name = "stakepertype")
    private double stakepertype;

    @Column(name = "won")
    private double won;

    @Column(name = "cash")
    private double cash;

    public int getId_bet() {
        return id_bet;
    }

    public void setId_bet(int id_bet) {
        this.id_bet = id_bet;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getStake() {
        return stake;
    }

    public void setStake(double stake) {
        this.stake = stake;
    }

    public double getStakepertype() {
        return stakepertype;
    }

    public void setStakepertype(double stakepertype) {
        this.stakepertype = stakepertype;
    }

    public double getWon() {
        return won;
    }

    public void setWon(double won) {
        this.won = won;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }
}
