package com.metaframe.cooma.ext2;

import com.metaframe.cooma.Config;


/**
 * @author Jerry Lee(oldratlee<at>gmail<dot>com)
 */
public class ConfigHolder {
    private Double Num;

    private Config config;

    private String name;

    private int age;

    public Double getNum() {
        return Num;
    }

    public void setNum(Double num) {
        Num = num;
    }

    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}