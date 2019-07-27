package com.ouyang.adminservice.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ouyang.admin.CustomerService;
import com.ouyang.adminservice.cache.CustomerCache;
import com.ouyang.adminservice.dao.CustomerMapper;
import com.ouyang.entity.admin.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author oy
 * @description
 * @date 2019/7/27
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {

    @Autowired
    CustomerCache cache;

    @Override
    public Customer getOne(Long id){
        Customer one = cache.getOne(id);
        return one;
    }

}
