package com.stackroute;

import java.io.*;
import java.util.Scanner;


public class FileHandling {
    public String printFileUpper(String s) throws IOException {

        FileWriter f = new FileWriter("abc.txt");
        f.write("this is file handling");
        f.close();



        File file = new File("abc.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st="";
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
        {
        st=sc.nextLine();
            System.out.println(st);
        st=st.toUpperCase();
            }
            return st;

    }



}
