package com.stackroute;

public class StudentMarks {
    private int noOfStudents;

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }
    public boolean isValidMarksList(int[] arr){

        for(int i=0;i<noOfStudents;i++)
        {
            if(arr[i]<0 || arr[i]>100)
                return false;
        }
        return true;
    }



}
