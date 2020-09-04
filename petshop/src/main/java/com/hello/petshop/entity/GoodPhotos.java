package com.hello.petshop.entity;

import java.io.Serializable;

public class GoodPhotos implements Serializable {
    int good_photo_id;
    int good_id;
    String good_photo_path;

    public int getGood_photo_id() {
        return good_photo_id;
    }

    public void setGood_photo_id(int good_photo_id) {
        this.good_photo_id = good_photo_id;
    }

    public int getGood_id() {
        return good_id;
    }

    public void setGood_id(int good_id) {
        this.good_id = good_id;
    }

    public String getGood_photo_path() {
        return good_photo_path;
    }

    public void setGood_photo_path(String good_photo_path) {
        this.good_photo_path = good_photo_path;
    }

    @Override
    public String toString() {
        return "GoodPhotos{" +
                "good_photo_id=" + good_photo_id +
                ", good_id=" + good_id +
                ", good_photo_path='" + good_photo_path + '\'' +
                '}';
    }
}
