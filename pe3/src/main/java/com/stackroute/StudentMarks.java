package com.stackroute;

public class StudentMarks {

    public String marks(int arr[],int num)
    {

        for(int x: arr)

        if(x<0 || x>100)
                return "error";

        return "no error";
    }
}
