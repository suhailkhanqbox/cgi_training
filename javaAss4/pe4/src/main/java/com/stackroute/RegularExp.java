package com.stackroute;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegularExp {
    public boolean reg(String s){
        String input1 =s;
        // regular expression for an integer number
        String regex = ".*\\bHarry\\b.*";
        // compiling regex
        Pattern p = Pattern.compile(regex);
        // Creates a matcher that will match input1 against regex
        Matcher m = p.matcher(input1);
        // If match found and equal to input1
        if(m.find())
        {System.out.println(input1 + " Found");
            return true;}
        else{
            System.out.println(input1 + " Not Found");
            return false;}
    }
}




