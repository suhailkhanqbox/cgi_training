package com.stackroute;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DaysOfWeek {
    public String[] getDaysOfWeek(){

        Calendar c= Calendar.getInstance();
        c.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
        DateFormat df=new SimpleDateFormat("EEE dd/MM/yyyy");
        String[] date=new String[2];
        date[0] =df.format(c.getTime());
        c.add(Calendar.DATE,6);
        date[1]=df.format(c.getTime());

        return date;
    }

}
