package com.alan.dubbo.dao;

import com.alan.dubbo.entity.Admin;
import com.alan.dubbo.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by hkw on 2017/6/15.
 */
@Service
public class AdminDao {

    @Autowired
    @Qualifier("adminMapper")
//    @Qualifier
//    @Autowired
    private AdminMapper adminMapper;

    public Admin queryAdmin(String name){
        return adminMapper.queryAdmin(name);
    }

}
