package com.stackroute;

public class transposeString {

public String trans(String s)
{
    String s1[]= s.split(" ",0);
    String s2="";
    for(int i=0;i<s1.length;i++)
    {
        char []c= s1[i].toCharArray();

        int l=c.length;
        char []c1= new char[l];
        s2="";
        for(int j=0;j<l;j++)
        {

            c1[j]=c[(l-j)-1];
            s2=s2+c1[j];

        }

        s1[i]=s2;

    }
    int l2=s1.length;
    String s3="";
        for(int i=0;i<l2;i++)
        {
            s3=s3+s1[i]+" ";

        }
        s3=s3.trim();
    return s3;
}

}
