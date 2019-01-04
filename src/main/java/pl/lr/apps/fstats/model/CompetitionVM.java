package pl.lr.apps.fstats.model;

import lombok.Getter;
import pl.lr.apps.fstats.entities.CompetitionSummaryV;

@Getter
public class CompetitionVM {

    private String team;
    private Integer pts;
    private Integer p;
    private Integer w;
    private Integer d;
    private Integer l;
    private Integer gd;
    private Integer f;
    private Integer a;
    private String serie;

    public static CompetitionVM convertToV(CompetitionSummaryV competitionSummaryV/*, String serie*/){
        CompetitionVM competitionVM = new CompetitionVM();
        competitionVM.team = competitionSummaryV.getCompetitionSummaryVPK().getTeam();
        competitionVM.pts = competitionSummaryV.getPts();
        competitionVM.p = competitionSummaryV.getP();
        competitionVM.w = competitionSummaryV.getW();
        competitionVM.d = competitionSummaryV.getD();
        competitionVM.l = competitionSummaryV.getL();
        competitionVM.gd = competitionSummaryV.getGd();
        competitionVM.f = competitionSummaryV.getF();
        competitionVM.a = competitionSummaryV.getA();
        competitionVM.serie = "";
        return competitionVM;
    }

    public void setSerie(String serie){
        this.serie = serie;
    }

    public void addSerie(String serie){
        this.serie += serie;
    }
}
