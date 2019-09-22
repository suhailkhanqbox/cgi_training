package com.stackroute;


import java.util.Arrays;

public class sortedWords {
    public String sor(String s1)
    {
        s1=s1.toLowerCase();
     String [] s2=s1.split(" ",0);
     String s="";
     String s4="";
             for(int i=0;i<s2.length;i++)
             {
                 char []c=s2[i].toCharArray();
                 Arrays.sort(c);
                 s2[i]= new String(c);
                 System.out.println(s2[i]);
                 s4= s4 + s2[i] + " ";
             }


s4=s4.trim();
return  s4;
    }
}
