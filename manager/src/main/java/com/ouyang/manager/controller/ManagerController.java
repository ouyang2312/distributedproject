package com.ouyang.manager.controller;

import com.ouyang.entity.admin.Customer;
import com.ouyang.manager.service.AdminRemoteService;
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
@RequestMapping(value = "/manager")
public class ManagerController {

    @Autowired
    AdminRemoteService adminRemoteService;

    @GetMapping(value = "/{id}")
    public Customer get(@PathVariable(value = "id") Long id){
        Customer customerByRemote = adminRemoteService.getCustomerByRemote(id);
        return customerByRemote;
    }

}
