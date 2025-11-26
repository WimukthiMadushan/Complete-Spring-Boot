package com.wimukthi.store;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service
public class OrderService {
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("Order service Created");
    }
    @PostConstruct
    public void init(){
        System.out.println("Inside PostConstruct");
    }
    @PreDestroy
    public void cleanUp(){
        System.out.println("Inside cleanUp");
    }
    public void placeorder(){
        paymentService.processPayment(10);
    }
}
