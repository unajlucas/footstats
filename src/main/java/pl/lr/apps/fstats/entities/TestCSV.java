package pl.lr.apps.fstats.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestCSV {
    private String homeTeam;
    private String awayTeam;
    private int fthg;
    private int ftag;

    public TestCSV(){
        this.homeTeam = "";
        this.awayTeam = "";
        this.fthg = 0;
        this.ftag = 0;
    }
}
