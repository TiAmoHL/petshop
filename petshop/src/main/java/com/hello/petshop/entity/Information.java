package com.hello.petshop.entity;

import java.io.Serializable;

public class Information implements Serializable {
    int information_id;
    int information_type;
    int it_td;
    String information_name;
    String itarget_name;
    String information_info;
    String information_time;

    public int getInformation_id() {
        return information_id;
    }

    public void setInformation_id(int information_id) {
        this.information_id = information_id;
    }

    public int getInformation_type() {
        return information_type;
    }

    public void setInformation_type(int information_type) {
        this.information_type = information_type;
    }

    public int getIt_td() {
        return it_td;
    }

    public void setIt_td(int it_td) {
        this.it_td = it_td;
    }

    public String getInformation_name() {
        return information_name;
    }

    public void setInformation_name(String information_name) {
        this.information_name = information_name;
    }

    public String getItarget_name() {
        return itarget_name;
    }

    public void setItarget_name(String itarget_name) {
        this.itarget_name = itarget_name;
    }

    public String getInformation_info() {
        return information_info;
    }

    public void setInformation_info(String information_info) {
        this.information_info = information_info;
    }

    public String getInformation_time() {
        return information_time;
    }

    public void setInformation_time(String information_time) {
        this.information_time = information_time;
    }

    @Override
    public String toString() {
        return "Information{" +
                "information_id=" + information_id +
                ", information_type=" + information_type +
                ", it_td=" + it_td +
                ", information_name='" + information_name + '\'' +
                ", itarget_name='" + itarget_name + '\'' +
                ", information_info='" + information_info + '\'' +
                ", information_time='" + information_time + '\'' +
                '}';
    }
}
