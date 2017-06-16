package com.alan.dubbo.service;

import com.alan.dubbo.api.admin.service.IAdminService;
import com.alan.dubbo.api.admin.entity.Admin;
import com.alan.dubbo.dao.AdminDao;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hkw on 2017/6/15.
 */
@Service(version = "0.1",protocol = "dubbo")
public class AdminServiceImpl implements IAdminService {

    @Autowired
    private AdminDao adminDao;

    public Admin queryAdmin(String name) {
        Admin admin1 = new Admin();
        com.alan.dubbo.entity.Admin admin = adminDao.queryAdmin(name);
        if (null != admin) {
            BeanUtils.copyProperties(admin,admin1);
            return admin1;
        }
        return null;
    }

}
