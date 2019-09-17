package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.util.*;
import java.text.*;

import static org.junit.Assert.*;

public class DaysOfWeekTest {
    private static DaysOfWeek d;
    Calendar c= Calendar.getInstance();

    @Before
    public void setUp() throws Exception {
        d=new DaysOfWeek();
    }

    @After
    public void tearDown() throws Exception {
        d=null;
    }

    @Test
    public void testDaysOfWeek(){
        c.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
        DateFormat df=new SimpleDateFormat("EEE dd/MM/yyyy");
        String[] date=new String[2];
               date[0] =df.format(c.getTime());
               c.add(Calendar.DATE,6);
               date[1]=df.format(c.getTime());
               assertArrayEquals(date,d.getDaysOfWeek());
    }
}

