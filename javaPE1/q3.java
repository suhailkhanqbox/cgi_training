import java.util.Scanner;

import java.util.*;

class q3
{
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word:");
        String word= input.nextLine();
        
        char c []= word.toCharArray();
        int len = c.length;
        for(int i=0;i<len;i++)
        {
         
            int a= c[i];
            if(a<65 && a>90 || a<97 && a>122)
            System.out.println("Error");

            if(c[i] == 'a' ||c[i] ==  'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u')
         System.out.println(c[i] + " is vowel");
         
          else
         System.out.println(c[i] + " is consonant");
        }
    }
}