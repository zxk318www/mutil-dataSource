package org.springboot.mutil.service.impl;

import org.springboot.mutil.dao.cluster.CityDao;
import org.springboot.mutil.dao.master.UserDao;
import org.springboot.mutil.entiry.City;
import org.springboot.mutil.entiry.User;
import org.springboot.mutil.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: mutil-dataSource
 * @description: 首页Service实现层
 * @author: Zhangxike
 * @create: 2018-11-28 15:32
 **/
@Service
public class HomeServiceImpl implements HomeService {
    @Autowired
    UserDao userDao;

    @Autowired
    CityDao cityDao;

    @Override
    public User findUser(String name) {
        User user = userDao.findByName(name);
        if (user==null){
            user = new User();
        }
        City city = cityDao.findByName("sz");
        user.setCity(city);
        System.out.println(user);
        return user;
    }
}
