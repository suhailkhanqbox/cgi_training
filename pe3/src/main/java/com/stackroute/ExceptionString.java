package com.stackroute;

public class ExceptionString {



        public void main(String args[]) throws Exception {
            try {throw new Exception("error"); }

            catch (Exception e){
            System.out.println(e);}

            finally  { System.out.println("I was there"); }
        }




}
