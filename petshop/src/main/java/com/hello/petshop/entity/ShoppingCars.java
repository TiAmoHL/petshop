package com.hello.petshop.entity;

import java.io.Serializable;

public class ShoppingCars implements Serializable {
    int good_id;
    int user_id;
    int good_numder;

    public int getGood_id() {
        return good_id;
    }

    public void setGood_id(int good_id) {
        this.good_id = good_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getGood_numder() {
        return good_numder;
    }

    public void setGood_numder(int good_numder) {
        this.good_numder = good_numder;
    }

    @Override
    public String toString() {
        return "ShoppingCars{" +
                "good_id=" + good_id +
                ", user_id=" + user_id +
                ", good_numder=" + good_numder +
                '}';
    }
}
