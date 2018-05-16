package com.study.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by liushaofei on 2018/5/16.
 *
 * @ConfigurationProperties :告诉springboot把该类的属性与配置文件进行绑定
 */

@Component
@ConfigurationProperties(prefix = "person")
public class Person {
  private String lastName;
  private Integer age;
  private Boolean boss;
  private Date birthday;
  private Map<String,Object> maps;
  private List<Object> lists;
  private Dog dogs;

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Boolean getBoss() {
    return boss;
  }

  public void setBoss(Boolean boss) {
    this.boss = boss;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public Map<String, Object> getMaps() {
    return maps;
  }

  public void setMaps(Map<String, Object> maps) {
    this.maps = maps;
  }

  public List<Object> getLists() {
    return lists;
  }

  public void setLists(List<Object> lists) {
    this.lists = lists;
  }

  public Dog getDogs() {
    return dogs;
  }

  public void setDogs(Dog dogs) {
    this.dogs = dogs;
  }

  @Override
  public String toString() {
    return "Person{" +
        "lastName='" + lastName + '\'' +
        ", age=" + age +
        ", boss=" + boss +
        ", birthday=" + birthday +
        ", maps=" + maps +
        ", lists=" + lists +
        ", dogs=" + dogs +
        '}';
  }
}
