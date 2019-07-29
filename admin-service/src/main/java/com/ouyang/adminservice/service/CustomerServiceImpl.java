package com.ouyang.adminservice.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ouyang.admin.CustomerService;
import com.ouyang.adminservice.cache.CustomerCache;
import com.ouyang.adminservice.dao.CustomerMapper;
import com.ouyang.entity.admin.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author oy
 * @description
 * @date 2019/7/27
 */
@Service(interfaceClass = CustomerService.class)
@Component
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {

    @Autowired
    CustomerCache cache;

    @Override
    public Customer getOne(Long id){
        Customer one = cache.getOne(id);
        return one;
    }

}
