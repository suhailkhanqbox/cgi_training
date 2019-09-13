package com.stackroute;

public class Factorial {

  public boolean factorialint(){
      int num = Integer.MAX_VALUE;

      int k=1;
      double fact=1;
      int n=1;
      while(true )
      {
          fact=1;
          for(int i=1;i<=n;i++)
          {
              fact=fact*i;
          }
          n++;
          if(fact > num)
              break;
          System.out.println(fact);
      }
return true;
  }

  public boolean factorialdouble(){
      Long num = Long.MAX_VALUE;

      int k=1;
      double fact=1;
      int n=1;
      while(true )
      {
          fact=1;
          for(int i=1;i<=n;i++)
          {
              fact=fact*i;
          }
          n++;
          if(fact > num)
              break;
          System.out.println(fact);
      }
      return true;


  }

}
