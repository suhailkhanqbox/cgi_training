package com.stackroute;

import java.io.*;
import java.util.Scanner;

public class question10 {

    public String filesFolder(String s, String s2) throws IOException {

        String v=s2+s;
        FileWriter f = new FileWriter(v);
        f.write("hello world and kill world");
        f.close();

        File file = new File(v);
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st="";
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
        {
            st=sc.nextLine();
            System.out.println(st);

        }
        return st;


    }

}
