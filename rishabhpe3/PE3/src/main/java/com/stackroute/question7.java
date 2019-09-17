package com.stackroute;

public class question7 {

    public boolean main() throws Exception {

        try {throw new Exception("error"); }

        catch (Exception e){
            System.out.println(e);}

        finally  { System.out.println("I was there"); }
        throw new Exception();

    }
}
