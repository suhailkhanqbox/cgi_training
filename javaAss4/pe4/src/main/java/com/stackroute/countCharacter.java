package com.stackroute;

public class countCharacter {

    public int counter(String s1, char c){
        int a=0;
        String s2="";
        int b=s1.length();

        s2=s1.replace("a","");
        int p=s2.length();

        a=b-p;



        return a;
    }
}
