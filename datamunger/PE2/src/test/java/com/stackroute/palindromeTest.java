package com.stackroute;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class palindromeTest extends palindrome {
 private  palindrome palindrome1;
    @Before
    public void setUp() throws Exception {
        palindrome1= new palindrome();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testcase1()
    {
      boolean expected= true;
      boolean actual;
      actual=palindrome1.getPalindrome("123");

        Assert.assertEquals(actual,expected);
           }


}