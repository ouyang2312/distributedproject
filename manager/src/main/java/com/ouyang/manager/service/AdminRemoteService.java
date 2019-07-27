package com.ouyang.manager.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ouyang.admin.CustomerService;
import com.ouyang.entity.admin.Customer;
import org.springframework.stereotype.Service;

/**
 * @author oy
 * @description
 * @date 2019/7/27
 */
@Service
public class AdminRemoteService {

    @Reference
    CustomerService customerService;

    public Customer getCustomerByRemote(Long id){
        Customer one = customerService.getOne(id);
        return one;
    }

}
