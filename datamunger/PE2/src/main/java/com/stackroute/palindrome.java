package com.stackroute;
public class palindrome {

    public boolean getPalindrome(String queryString) {

        char []c=queryString.toCharArray();
        int l= c.length;
        for (int i=0;i<l;i++)
        {
            if(c[i]!=c[(l-1)-i])
                return false;
        }

        return true;
    }



}
