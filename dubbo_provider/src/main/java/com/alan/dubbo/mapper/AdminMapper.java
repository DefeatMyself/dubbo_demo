package com.alan.dubbo.mapper;


import com.alan.dubbo.entity.Admin;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by hkw on 2017/5/26.
 */
@Repository("adminMapper")
//@Service
public interface AdminMapper {

    Admin queryAdmin(String name);

}
