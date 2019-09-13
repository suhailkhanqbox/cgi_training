package com.stackroute;

public class User {

        private String firstName,LastName;
        private int age,salary;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean setAge(int age) {

        if(age<0 || age>100)
        return false;
    else { this.age = age;
            return true;}
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }
    public boolean isValidAge(int age){
        if(age>18 && age<60)
            return true;
        else return false;

    }

    public String getFirstName() {
        return firstName;
    }
    public String getFullName(){

        String FullName= firstName + " "+ LastName;
        return FullName;


    }
}
