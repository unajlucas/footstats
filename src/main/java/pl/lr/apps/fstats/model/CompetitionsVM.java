package pl.lr.apps.fstats.model;

import lombok.Getter;
import pl.lr.apps.fstats.entities.CompetitionTab;

@Getter
public class CompetitionsVM {

    private Integer cid;
    private String name;

    public static CompetitionsVM convertToV(CompetitionTab entry){
        CompetitionsVM competitionsVM = new CompetitionsVM();
        competitionsVM.cid = entry.getC_id();
        competitionsVM.name = entry.getName();
        return competitionsVM;
    }
}
