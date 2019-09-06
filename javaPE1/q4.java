import java.lang.*;
import java.util.*;


class q4
{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");  
        int number = input.nextInt();

        for(int i=1;i<=number;i++)
        {
           for(int j=0;j<i;j++)
           {
            System.out.println(i); 
           }
        }

        
    }
    
    }