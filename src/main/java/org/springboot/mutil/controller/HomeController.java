package org.springboot.mutil.controller;

import org.springboot.mutil.entiry.User;
import org.springboot.mutil.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: mutil-dataSource
 * @description: SpringMVC入口
 * @author: Zhangxike
 * @create: 2018-11-28 15:02
 **/

@Controller
public class HomeController {

    @Autowired
    HomeService homeService;

    @ResponseBody
    @RequestMapping(value = "/user" ,method = RequestMethod.GET)
    public User findByName(@RequestParam(value = "name",required = true) String name){
        return homeService.findUser(name);
    }
}
