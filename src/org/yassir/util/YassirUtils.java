package org.yassir.util;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class YassirUtils
{

    /**
     * Create a {@link LocalDate} object
     * @param day
     * @param mon
     * @param yea
     * @return
     */
    public static LocalDate createDate(int day, int mon, int yea)
    {
        LocalDate localDate = LocalDate.of(yea, mon, day);
        return localDate;
    }

    /**
     * Convert {@link LocalDate} to {@link Date}
     * @param localDate
     * @return
     */
    public static Date localDateToDateUtil(LocalDate localDate)
    {
        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        return date;
    }

    /**
     * Convert {@link LocalDate} to {@link java.sql.Date}
     * @param localDate
     * @return
     */
    public static java.sql.Date localDateToDateSql(LocalDate localDate)
    {
        java.sql.Date date = java.sql.Date.valueOf(localDate);
        return date;
    }

    /**
     * Convert {@link Date} to {@link LocalDate}
     * @param date
     * @return
     */
    public static LocalDate dateUtilToLocalDate(Date date)
    {
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return localDate;
    }

    /**
     * Convert {@link java.sql.Date} to {@link LocalDate}
     * @param date
     * @return
     */
    public static LocalDate dateSqlToLocalDate (java.sql.Date date)
    {
        LocalDate localDate = date.toLocalDate();
        return  localDate;
    }



}
