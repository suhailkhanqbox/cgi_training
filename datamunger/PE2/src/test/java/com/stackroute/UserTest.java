package com.stackroute;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest extends User {
     User u1=new User();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void testcase1()
    {
        boolean expected= false;
        boolean actual;
        actual=u1.setAge(124);

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testcase2()
    {
        boolean expected= false;
        boolean actual;
        actual=u1.isValidAge(134);

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testcase3()
    {
        String expected= "Suhail Khan";
        String actual;
        u1.setFirstName("Suhail");
        u1.setLastName("Khan");
        actual=u1.getFullName();

        Assert.assertEquals(actual,expected);
    }



}