package org.springboot.mutil.dao.master;

import org.apache.ibatis.annotations.Param;
import org.springboot.mutil.entiry.User;

/**
 * @program: mutil-dataSource
 * @description: 用户Dao
 * @author: Zhangxike
 * @create: 2018-11-28 15:29
 **/

public interface UserDao {

    /**
     * 根据用户名查询用户
     * @param name 用户名
     * @return
     */
    User findByName(@Param("name") String name);
}
