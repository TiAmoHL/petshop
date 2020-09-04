package com.hello.petshop.entity;

import java.io.Serializable;

public class Goods implements Serializable {
    int good_id;
    String good_name;
    Double good_price;
    int good_type1;
    int good_type2;
    String good_info;
    int good_count;
    String good_origin;
    int good_threshold;
    String good_brand;
    String good_conditions;
    int good_volume;
    int hits;
    String good_time;

    public int getGood_id() {
        return good_id;
    }

    public void setGood_id(int good_id) {
        this.good_id = good_id;
    }

    public String getGood_name() {
        return good_name;
    }

    public void setGood_name(String good_name) {
        this.good_name = good_name;
    }

    public Double getGood_price() {
        return good_price;
    }

    public void setGood_price(Double good_price) {
        this.good_price = good_price;
    }

    public int getGood_type1() {
        return good_type1;
    }

    public void setGood_type1(int good_type1) {
        this.good_type1 = good_type1;
    }

    public int getGood_type2() {
        return good_type2;
    }

    public void setGood_type2(int good_type2) {
        this.good_type2 = good_type2;
    }

    public String getGood_info() {
        return good_info;
    }

    public void setGood_info(String good_info) {
        this.good_info = good_info;
    }

    public int getGood_count() {
        return good_count;
    }

    public void setGood_count(int good_count) {
        this.good_count = good_count;
    }

    public String getGood_origin() {
        return good_origin;
    }

    public void setGood_origin(String good_origin) {
        this.good_origin = good_origin;
    }

    public int getGood_threshold() {
        return good_threshold;
    }

    public void setGood_threshold(int good_threshold) {
        this.good_threshold = good_threshold;
    }

    public String getGood_brand() {
        return good_brand;
    }

    public void setGood_brand(String good_brand) {
        this.good_brand = good_brand;
    }

    public String getGood_conditions() {
        return good_conditions;
    }

    public void setGood_conditions(String good_conditions) {
        this.good_conditions = good_conditions;
    }

    public int getGood_volume() {
        return good_volume;
    }

    public void setGood_volume(int good_volume) {
        this.good_volume = good_volume;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public String getGood_time() {
        return good_time;
    }

    public void setGood_time(String good_time) {
        this.good_time = good_time;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "good_id=" + good_id +
                ", good_name='" + good_name + '\'' +
                ", good_price=" + good_price +
                ", good_type1=" + good_type1 +
                ", good_type2=" + good_type2 +
                ", good_info='" + good_info + '\'' +
                ", good_count=" + good_count +
                ", good_origin='" + good_origin + '\'' +
                ", good_threshold=" + good_threshold +
                ", good_brand='" + good_brand + '\'' +
                ", good_conditions='" + good_conditions + '\'' +
                ", good_volume=" + good_volume +
                ", hits=" + hits +
                ", good_time='" + good_time + '\'' +
                '}';
    }
}
