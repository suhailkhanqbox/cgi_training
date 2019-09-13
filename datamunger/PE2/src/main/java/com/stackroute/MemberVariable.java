package com.stackroute;

class Member {


   private String Name="";
   private int Age;
   private int Salary;

   public int getAge() {
      return this.Age;
   }

   public int getSalary() {
      return this.Salary;
   }

   public String getName() {
      return this.Name;
   }

   public void setAge(int age) {
      this.Age = age;
   }

   public void setName(String name) {
      this.Name = name;
   }

   public void setSalary(int salary) {
      this.Salary = salary;
   }

}
public class MemberVariable {



   public boolean setparameter(String name, int age, int salary){
      Member m = new Member();
      m.setAge(age);
      m.setName(name);
      m.setSalary(salary);

      System.out.println(m.getAge());
      System.out.println(m.getName());
      System.out.println(m.getSalary());

      return true;
   }


}