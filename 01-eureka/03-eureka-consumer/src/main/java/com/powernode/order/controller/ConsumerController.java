package com.powernode.order.controller;

import com.powernode.order.config.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    //调用支付订单服务端的ip+端口号
    public static final  String PAYMENT_URL = "http://EUREKA-CLIENT";

    //获取id获取支付订单
    @GetMapping("/consumer/payment/get/{id}")
    public Object getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id, AjaxResult.class);
    }
}
