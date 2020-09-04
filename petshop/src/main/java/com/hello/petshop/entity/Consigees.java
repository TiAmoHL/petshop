package com.hello.petshop.entity;

import java.io.Serializable;

public class Consigees implements Serializable {
    int consignees_id;
    int user_id;
    String consignees_name;
    String consignees_number;
    String consignees_address;
    String is_default;
    String consignees_tel;

    public int getConsignees_id() {
        return consignees_id;
    }

    public void setConsignees_id(int consignees_id) {
        this.consignees_id = consignees_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getConsignees_name() {
        return consignees_name;
    }

    public void setConsignees_name(String consignees_name) {
        this.consignees_name = consignees_name;
    }

    public String getConsignees_number() {
        return consignees_number;
    }

    public void setConsignees_number(String consignees_number) {
        this.consignees_number = consignees_number;
    }

    public String getConsignees_address() {
        return consignees_address;
    }

    public void setConsignees_address(String consignees_address) {
        this.consignees_address = consignees_address;
    }

    public String getIs_default() {
        return is_default;
    }

    public void setIs_default(String is_default) {
        this.is_default = is_default;
    }

    public String getConsignees_tel() {
        return consignees_tel;
    }

    public void setConsignees_tel(String consignees_tel) {
        this.consignees_tel = consignees_tel;
    }

    @Override
    public String toString() {
        return "Consigees{" +
                "consignees_id=" + consignees_id +
                ", user_id=" + user_id +
                ", consignees_name='" + consignees_name + '\'' +
                ", consignees_number='" + consignees_number + '\'' +
                ", consignees_address='" + consignees_address + '\'' +
                ", is_default='" + is_default + '\'' +
                ", consignees_tel='" + consignees_tel + '\'' +
                '}';
    }
}
