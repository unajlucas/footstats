package pl.lr.apps.fstats.utils;

import pl.lr.apps.fstats.entities.CompetitionSummaryV;

import java.util.Comparator;

public class MoreGoalsForComparator implements Comparator<CompetitionSummaryV> {

    @Override
    public int compare(CompetitionSummaryV o1, CompetitionSummaryV o2) {
        Integer i1 = o1.getF();
        Integer i2 = o2.getF();
        return i2.compareTo(i1);
    }
}
