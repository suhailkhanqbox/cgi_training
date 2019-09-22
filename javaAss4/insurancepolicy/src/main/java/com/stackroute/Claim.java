package com.stackroute;

import java.math.BigDecimal;
import java.util.Date;

public class Claim {

    private int ClaimId;
    private Date claimDate;
    private String Description;
    private BigDecimal ClaimAmount;

    public Claim(){
        System.out.println("this is claim Constructor");
    }
}
