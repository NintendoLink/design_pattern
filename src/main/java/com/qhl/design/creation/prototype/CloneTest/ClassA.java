/**
 * @Author: LinK
 * @Date: 2019/1/16 17:29
 */

package com.qhl.design.creation.prototype.CloneTest;

public class ClassA  {
    private String Name;
    private Integer age;

    public ClassA() {
    }

    public ClassA(String name, Integer age) {
        Name = name;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
