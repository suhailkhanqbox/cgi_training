import java.lang.*;
import java.util.*;

public class palindrome{

    public static void main(String args[]) 
            {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number:");  
            String userName = input.nextLine();
            
            char []p= userName.toCharArray();
            int len= p.length;
                     for(int i=0;i< len;i++)
                        {   
                            if(len==1)
                            {System.out.println("Number is a palindrome but sum is less than 25");
                        break;}
                            if(i>(len/2))
                            {sumeven(p);
                            break;}
                            if(p[i]==p[(len-1)-i])
                            {continue;}
                            else
                            {
                                System.out.println("Number is not a palindrome"); 
                                break;}
                            
                        }

            //System.out.println("Entered number:" + userName); 
            }
            public static void sumeven(char [] p){
                int len=p.length;
                int sum=0;
                int n=0;
             for(int i=0;i<len;i++)
             {
                int a=Character.getNumericValue(p[i]); 
                
                 if(a%2==0)
                 
                 sum=sum+a;
             }
             if(sum > 25)
             System.out.println("Number is a palindrome and sum is greater than 25"); 
             else
             System.out.println("Number is a palindrome but sum is less than 25"); 
            }
   
}