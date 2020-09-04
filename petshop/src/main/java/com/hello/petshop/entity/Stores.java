package com.hello.petshop.entity;

import java.io.Serializable;

public class Stores implements Serializable {
    int store_id;
    String store_name;
    String store_pwd;
    String store_number;
    String store_account;
    String store_time;
    String store_head;
    String store_email;
    String store_consignee;

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    public String getStore_pwd() {
        return store_pwd;
    }

    public void setStore_pwd(String store_pwd) {
        this.store_pwd = store_pwd;
    }

    public String getStore_number() {
        return store_number;
    }

    public void setStore_number(String store_number) {
        this.store_number = store_number;
    }

    public String getStore_account() {
        return store_account;
    }

    public void setStore_account(String store_account) {
        this.store_account = store_account;
    }

    public String getStore_time() {
        return store_time;
    }

    public void setStore_time(String store_time) {
        this.store_time = store_time;
    }

    public String getStore_head() {
        return store_head;
    }

    public void setStore_head(String store_head) {
        this.store_head = store_head;
    }

    public String getStore_email() {
        return store_email;
    }

    public void setStore_email(String store_email) {
        this.store_email = store_email;
    }

    public String getStore_consignee() {
        return store_consignee;
    }

    public void setStore_consignee(String store_consignee) {
        this.store_consignee = store_consignee;
    }

    @Override
    public String toString() {
        return "Stores{" +
                "store_id=" + store_id +
                ", store_name='" + store_name + '\'' +
                ", store_pwd='" + store_pwd + '\'' +
                ", store_number='" + store_number + '\'' +
                ", store_account='" + store_account + '\'' +
                ", store_time='" + store_time + '\'' +
                ", store_head='" + store_head + '\'' +
                ", store_email='" + store_email + '\'' +
                ", store_consignee='" + store_consignee + '\'' +
                '}';
    }
}
