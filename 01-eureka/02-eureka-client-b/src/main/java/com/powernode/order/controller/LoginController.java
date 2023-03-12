package com.powernode.order.controller;

import com.powernode.order.config.AjaxResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Value("${server.port}")
    private int serverPort;

    //获取id获取支付订单
    @GetMapping("/payment/get/{id}")
    public Object getPayment(@PathVariable("id") Long id){
        return AjaxResult.success("OK",serverPort+"+"+id);
    }

}
