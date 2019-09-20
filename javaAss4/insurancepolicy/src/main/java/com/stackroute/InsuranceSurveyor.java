package com.stackroute;

import java.util.ArrayList;
import java.util.List;

public class InsuranceSurveyor extends Employee{
    private List<Claim> claimValidate;
    public InsuranceSurveyor(){
        System.out.println("Insurance Surveyor created");
    }
public void validateClaim(Claim e){
        this.claimValidate=new ArrayList<Claim>();
        claimValidate.add(e);
    System.out.println("claim validated");
    Manager manager=new Manager();
    manager.ApproveClaim(e);
}

}
