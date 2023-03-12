package com.powernode.service;

//import com.buba.springcloud.pojo.CommonResult;

import com.powernode.config.AjaxResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@ComponentScan
@FeignClient(value ="eureka-client")//使用Feign
public interface PaymentService {

    @GetMapping("/payment/get/{id}")
    public Object queryById(@PathVariable("id") Long id);

}