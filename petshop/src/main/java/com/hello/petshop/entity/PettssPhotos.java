package com.hello.petshop.entity;

import java.io.Serializable;

public class PettssPhotos implements Serializable {
    int pettss_photos_id;
    int pettss_id;
    String pettss_photos_path;

    public int getPettss_photos_id() {
        return pettss_photos_id;
    }

    public void setPettss_photos_id(int pettss_photos_id) {
        this.pettss_photos_id = pettss_photos_id;
    }

    public int getPettss_id() {
        return pettss_id;
    }

    public void setPettss_id(int pettss_id) {
        this.pettss_id = pettss_id;
    }

    public String getPettss_photos_path() {
        return pettss_photos_path;
    }

    public void setPettss_photos_path(String pettss_photos_path) {
        this.pettss_photos_path = pettss_photos_path;
    }

    @Override
    public String toString() {
        return "PettssPhotos{" +
                "pettss_photos_id=" + pettss_photos_id +
                ", pettss_id=" + pettss_id +
                ", pettss_photos_path='" + pettss_photos_path + '\'' +
                '}';
    }
}
