package com.stackroute;

import java.io.*;
import java.util.Scanner;

public class freqOfWords {
    public String[] words(String s1, String s2) throws IOException {

        FileWriter f = new FileWriter(s1);
        f.write(s2);
        f.close();

        File file = new File(s1);

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st = "";
        String[] c = {};
        Scanner sc = new Scanner(file);
String s="";
        while (sc.hasNextLine()) {
            st = sc.nextLine();
            System.out.println(st);
            String[] words = st.split(",| ", 0);
            int wrc = 1;                            //Variable for getting Repeated word count

            for (int i = 0; i < words.length; i++)        //Outer loop for Comparison
            {
                for (int j = i + 1; j < words.length; j++)    //Inner loop for Comparison
                {

                    if (words[i].equals(words[j]))    //Checking for both strings are equal
                    {
                        wrc = wrc + 1;                //if equal increment the count
                        words[j] = "0";            //Replace repeated words by zero
                    }
                }
                if (words[i] != "0")
                {System.out.println(words[i] + "-" + wrc);
                s=s+ words[i]+"-"+wrc+",";
                    System.out.println(s);
                }   //Printing the word along with count
                wrc = 1;
            }

        }
        String rs[]=s.split(",",0);
        return rs;

    }
}

