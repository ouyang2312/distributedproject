package com.ouyang.adminservice.cache;

import com.ouyang.adminservice.dao.CustomerMapper;
import com.ouyang.entity.admin.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * @author oy
 * @description
 * @date 2019/7/27
 */
@Component
@CacheConfig(cacheNames = "customer" )
public class CustomerCache {

    @Autowired
    CustomerMapper customerMapper;

    @Cacheable(value = "customer",key = "'list_'+#id")
    public Customer getOne(Long id){
        return customerMapper.selectById(id);
    }
}
