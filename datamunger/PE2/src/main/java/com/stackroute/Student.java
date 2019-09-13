package com.stackroute;

public class Student {

    public float average(float arr[],int num)
    {
        float p=0,avg=0;
        for(float a: arr)
        {
            p=p+a;
        }
        avg=p/num;
        return avg;
    }

    public float max(float arr[],int num)
    {
        int l= arr.length;
        float max=arr[0];
        for(int i=1;i<l;i++)
        {

            if (arr[i]>max)
                max=arr[i];
        }
        return max;
    }

    public float min(float arr[],int num)
    {
        int l= arr.length;
        float min=arr[0];
        for(int i=1;i<l;i++)
        {

            if (arr[i]<min)
                min=arr[i];
        }
        return min;
    }


}
