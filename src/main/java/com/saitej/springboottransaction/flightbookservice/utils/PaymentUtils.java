package com.saitej.springboottransaction.flightbookservice.utils;

import com.saitej.springboottransaction.flightbookservice.exception.InsufficientAmountException;


import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {

    private static Map<String , Double> paymentMap = new HashMap<>();

    static {
        paymentMap.put("acc-1", 12000.0);
        paymentMap.put("acc-2", 10000.0);
        paymentMap.put("acc-3", 5000.0);
        paymentMap.put("acc-4", 8000.0);
    }

    public static boolean validateCreditLimit(String accNo, double paidAmount){
        if(paidAmount> paymentMap.get(accNo)){
            throw new InsufficientAmountException("Insufficient funds....");

        }
        else{
            return  true;
        }
    }
}
