package com.xmu.software.util;

import org.apache.logging.log4j.util.Strings;

import java.time.LocalDateTime;
import java.util.Date;

public class DateChange {
    public  static String change(LocalDateTime dateTime){
        String s=dateTime.toString();
        String[] strings=s.split("T");
        String[] strings1=strings[0].split("-");
        return strings1[1]+"-"+strings1[2];
    }
}
