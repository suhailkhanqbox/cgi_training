package com.stackroute;

public class power4 {


        public boolean checkpower(int number)
        {
            int p=2;
            int i=1;
            while (p>1)
            {
                int a= (int)Math.pow(4,i);
                i++;
                p= number/a;
                if(p==1)
                    return true;
            }
            return false;
        }


}
