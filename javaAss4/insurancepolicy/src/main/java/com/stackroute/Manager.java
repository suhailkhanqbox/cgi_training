package com.stackroute;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    private List<Claim> claimsToApprove;
    public Manager(){
        System.out.println("Manger Created");
    }
    public void ApproveClaim(Claim e){
        this.claimsToApprove=new ArrayList<Claim>();
        claimsToApprove.add(e);
        System.out.println("claim approve");
    }
}
