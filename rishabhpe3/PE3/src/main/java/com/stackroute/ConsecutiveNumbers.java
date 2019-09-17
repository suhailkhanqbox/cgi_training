package com.stackroute;

public class ConsecutiveNumbers {
    public String checkConsecutive(String s){
        int l=s.length();
        String []q=s.split(",",0);
        int [] result= new int[l];
        int i=0;
        for (String x: q)
        {
            result[i] = Integer.parseInt(x);
            System.out.println(result[i]);
            i++;

        }

        for (int k=0;k<result.length;k++)
        {

            if(result[k] != result[k+1]-1)

             return "false";
        }
        return "true";






    }
}
