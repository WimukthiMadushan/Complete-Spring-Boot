package com.wimukthi.store;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service("stripe")
//@Primary
public class StripePaymentService implements PaymentService {

    @Value("${stripe.apiUrl}")
    private String apiUrl;

    @Value("${stripe.enable}")
    private boolean enable;

    @Value("${stripe.timeout:3000}")
    private int timeout;

    @Value("${stripe.supported-currencies}")
    private List<String> currencies;


    @Override
    public void processPayment(double amount){
        System.out.println("STRIPE");
        System.out.println("Api Url: " + apiUrl);
        System.out.println("Enables: " + enable);
        System.out.println("Timeout: " + timeout);
        System.out.println("Currencies: " + currencies);
        System.out.println("Amount: " + amount);

    }
}
