package pl.lr.apps.fstats.utils;

import pl.lr.apps.fstats.entities.CompetitionSummaryV;

import java.util.Comparator;

public class GoalDiffComparator implements Comparator<CompetitionSummaryV> {

    @Override
    public int compare(CompetitionSummaryV o1, CompetitionSummaryV o2) {
        Integer i1 = o1.getGd();
        Integer i2 = o2.getGd();
        return i2.compareTo(i1);
    }
}
