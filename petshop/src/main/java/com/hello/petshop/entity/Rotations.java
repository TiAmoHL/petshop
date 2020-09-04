package com.hello.petshop.entity;

import java.io.Serializable;

/*
CREATE TABLE  rotations(
rotation_id INT NOT NULL ,
good_id	INT NOT NULL,
rotation_path	VARCHAR(50) NOT NULL,#轮播图路径
PRIMARY KEY(rotation_id)
);
 */
public class Rotations implements Serializable {
    int rotation_id;
    int good_id;
    String rotation_path;

    public int getRotation_id() {
        return rotation_id;
    }

    public void setRotation_id(int rotation_id) {
        this.rotation_id = rotation_id;
    }

    public int getGood_id() {
        return good_id;
    }

    public void setGood_id(int good_id) {
        this.good_id = good_id;
    }

    public String getRotation_path() {
        return rotation_path;
    }

    public void setRotation_path(String rotation_path) {
        this.rotation_path = rotation_path;
    }

    @Override
    public String toString() {
        return "Rotations{" +
                "rotation_id=" + rotation_id +
                ", good_id=" + good_id +
                ", rotation_path='" + rotation_path + '\'' +
                '}';
    }
}
