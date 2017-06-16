package com.alan.dubbo.api.admin.service;

import com.alan.dubbo.api.admin.entity.Admin;

/**
 * Created by hkw on 2017/6/14.
 */
public interface IAdminService {

    Admin queryAdmin(String name);

}
