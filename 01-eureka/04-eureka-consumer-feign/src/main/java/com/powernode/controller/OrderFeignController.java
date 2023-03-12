package com.powernode.controller;


import com.powernode.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class OrderFeignController {

    @Autowired(required = false)
    private PaymentService paymentService;

    @GetMapping("/consumer/payment/get/{id}")
    public Object getPaymentById(@PathVariable("id") Long id){
        Object result = paymentService.queryById(id);
        return result;
    }

}