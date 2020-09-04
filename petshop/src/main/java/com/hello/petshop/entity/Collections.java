package com.hello.petshop.entity;

import java.io.Serializable;


public class Collections implements Serializable {
    int good_id;
    int use_id;

    public int getGood_id() {
        return good_id;
    }

    public void setGood_id(int good_id) {
        this.good_id = good_id;
    }

    public int getUse_id() {
        return use_id;
    }

    public void setUse_id(int use_id) {
        this.use_id = use_id;
    }

    @Override
    public String toString() {
        return "Collections{" +
                "good_id=" + good_id +
                ", use_id=" + use_id +
                '}';
    }
}
