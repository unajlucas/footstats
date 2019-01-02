package pl.lr.apps.fstats.utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Utils {

    public static String formatStringDateToTimestamp(String stringdate) {
        String old_format = "dd.MM.yyyy";
        String new_format = "yyyy-MM-dd";
        Date d = null;
        stringdate = stringdate.replaceAll(" ", ".");

        SimpleDateFormat sdf = new SimpleDateFormat(old_format, Locale.ENGLISH);
        try {
            d = sdf.parse(stringdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        sdf.applyPattern(new_format);

        return sdf.format(d);
    }

    public static Timestamp formatDateToTimestamp(Date date) {
        long time = date.getTime();
        return new Timestamp(time);
    }

}
