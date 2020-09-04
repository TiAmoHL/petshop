package com.hello.petshop.entity;

import java.io.Serializable;

public class Pettss implements Serializable {
    int pettss_id;
    int user_id;
    String pettss_name;
    String pettss_type;
    String pettss_sex;
    int pettss_age;
    String pettss_info;



    public int getPettss_id() {
        return pettss_id;
    }

    public void setPettss_id(int pettss_id) {
        this.pettss_id = pettss_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getPettss_name() {
        return pettss_name;
    }

    public void setPettss_name(String pettss_name) {
        this.pettss_name = pettss_name;
    }

    public String getPettss_type() {
        return pettss_type;
    }

    public void setPettss_type(String pettss_type) {
        this.pettss_type = pettss_type;
    }

    public String getPettss_sex() {
        return pettss_sex;
    }

    public void setPettss_sex(String pettss_sex) {
        this.pettss_sex = pettss_sex;
    }

    public int getPettss_age() {
        return pettss_age;
    }

    public void setPettss_age(int pettss_age) {
        this.pettss_age = pettss_age;
    }

    public String getPettss_info() {
        return pettss_info;
    }

    public void setPettss_info(String pettss_info) {
        this.pettss_info = pettss_info;
    }

    @Override
    public String toString() {
        return "Pettss{" +
                "pettss_id=" + pettss_id +
                ", user_id=" + user_id +
                ", pettss_name='" + pettss_name + '\'' +
                ", pettss_type='" + pettss_type + '\'' +
                ", pettss_sex='" + pettss_sex + '\'' +
                ", pettss_age=" + pettss_age +
                ", pettss_info='" + pettss_info + '\'' +
                '}';
    }
}
