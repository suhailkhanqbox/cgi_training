import java.lang.*;
import java.util.*;

import javax.lang.model.util.ElementScanner6;

class q5
{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");  
        String n = input.nextLine();

      char c[]= n.toCharArray();

    int l= c.length;
    int b=0;
    int a=0;
    int k=0,j=0;
    for(int i=0;i<l;i++)
    {
       if(c[i] == ' ')
        { 
            j=0;
        b=0;} 
       else
       {a = Character.getNumericValue(c[i]); 
       b=(b)*(j*10)+a;
       j++;}
       if(c[i+1]== ' ' && i < (l-3) || i==l-1)
       k=k+b;
       
    }
   System.out.println(k);  
    }
    
}