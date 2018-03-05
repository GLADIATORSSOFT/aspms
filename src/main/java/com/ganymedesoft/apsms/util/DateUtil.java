/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ganymedesoft.apsms.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author UmAir
 */
public class DateUtil {

    public static Date stringToDate(String date, String format) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        Date retDate = simpleDateFormat.parse(date);
        return retDate;
    }

    public static Date formatDate(Date date, String format) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        Date retDate = simpleDateFormat.parse(simpleDateFormat.format(date));
        return retDate;
    }

    public static String dateToString(Date date, String format) throws Exception {
        String convertedDateString = null;
        DateFormat dateFormat = new SimpleDateFormat(format);
        if (date != null) {
            convertedDateString = dateFormat.format(date);
        }
        return convertedDateString;
    }
}
