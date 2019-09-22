package com.stackroute;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class multiStringOccurences {


  public String mso(String s, String s1){
      String s3="";
      String text=s;


      String patternString = s1;

      Pattern pattern = Pattern.compile(patternString);
      Matcher matcher = pattern.matcher(text);

      int count = 0;
      while(matcher.find()) {
          count++;
          System.out.println("Found " + "at" + ": "
                  + matcher.start() + " - " + matcher.end()+", ");
            s3=s3+("Found " + "at" + ": "
          + matcher.start() + " - " + matcher.end()+", ");
      }

        s3=s3.trim();
      return s3;
  }
}
