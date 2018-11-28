package org.springboot.mutil.service;

import org.springboot.mutil.entiry.User;

/**
 * @program: mutil-dataSource
 * @description: 首页Service
 * @author: Zhangxike
 * @create: 2018-11-28 15:31
 **/

public interface HomeService {

    /**
     * 根据用户名查询用户信息
     * @param name
     * @return
     */
    User findUser(String name);
}
