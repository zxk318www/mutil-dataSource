package org.springboot.mutil.dao.cluster;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springboot.mutil.entiry.City;

/**
 * @program: mutil-dataSource
 * @description: 城市Dao
 * @author: Zhangxike
 * @create: 2018-11-28 15:30
 **/

@Mapper
public interface CityDao {

    /**
     * 根据城市名称查询城市
     * @param name
     * @return
     */
    City findByName(@Param("name") String name);
}
