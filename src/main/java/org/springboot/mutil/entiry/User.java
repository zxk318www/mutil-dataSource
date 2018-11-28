package org.springboot.mutil.entiry;

/**
 * @program: mutil-dataSource
 * @description: 用户实体
 * @author: Zhangxike
 * @create: 2018-11-28 15:28
 **/

public class User {

    private String id;

    private String name;

    private String password;

    private City city;


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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", city=" + city +
                '}';
    }
}
