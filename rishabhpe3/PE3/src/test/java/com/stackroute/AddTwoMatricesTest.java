package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoMatricesTest {
    private static AddTwoMatrices a;

    @Before
    public void setUp() throws Exception {
        a=new AddTwoMatrices();
    }

    @After
    public void tearDown() throws Exception {
        a=null;
    }

    @Test
    public void testAddTwoMatrices(){
        int row=3;
        int col=2;
        a.setRow(row);
        a.setCol(col);
        int[][] arr=new int[row][col];
        int[][] arr1=new int[row][col];
        int[][] result=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=i;
                arr1[i][j]=j;
                result[i][j]=arr[i][j]+arr1[i][j];
            }
        }
        assertArrayEquals("return added 2D-array",result,a.addTwoMatrices(arr,arr1));
    }

    @Test
    public void testAddTwoMatrices1(){
        int row=0;
        int col=6;
        a.setRow(row);
        a.setCol(col);
        int[][] arr=new int[row][col];
        int[][] arr1=new int[row][col];
        int[][] result=new int[row][col];
        assertNull(a.addTwoMatrices(arr,arr1));
    }
}