package com.stackroute;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String Name;
    private int CustomerId;
    private Policy policy;
    private List<Claim> claims;
    public Customer(){
        System.out.println("Customer Created");
        this.policy=new Policy();

    }
    public void CreateClaim(Claim e){
        this.claims=new ArrayList<Claim>();
        claims.add(e);
        System.out.println("created claim");
        InsuranceSurveyor insuranceSurveyor=new InsuranceSurveyor();
        insuranceSurveyor.validateClaim(e);
    }
}

class Execution{
    public static void main(String[] args){
       Customer customer=new Customer();
       Claim claim=new Claim();
       customer.CreateClaim(claim);
    }
}
