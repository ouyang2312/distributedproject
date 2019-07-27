package com.ouyang.adminservice.controller;

import com.ouyang.admin.CustomerService;
import com.ouyang.entity.admin.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author oy
 * @description
 * @date 2019/7/27
 */
@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping(value = "/get/{id}")
    public Customer get(@PathVariable("id") Long id){
        Customer one = customerService.getOne(id);
        return one;
    }

}
