package com.stackroute;

import java.math.BigDecimal;
import java.util.Date;

public class Policy {
    private int PolicyId;
    private String type;
    private Date start_date;
    private Date mature_date;
    private BigDecimal amount;

    public Policy(){
        System.out.println("policy constructor");
    }
}
