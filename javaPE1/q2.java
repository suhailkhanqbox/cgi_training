import java.lang.*;
import java.util.*;

class q2
{

            public static void main(String args[])
            {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter the number:");  
                int number = input.nextInt(); 

                if(number >= 20 && number <=30)
                {
                    if(number %2 ==0)
                    System.out.println("Jerry"); 
                    else
                    System.out.println("Tom"); 
                }
            }
}