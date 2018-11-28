package org.springboot.mutil.entiry;

/**
 * @program: mutil-dataSource
 * @description: 城市实体
 * @author: Zhangxike
 * @create: 2018-11-28 15:27
 **/

public class City {

    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
