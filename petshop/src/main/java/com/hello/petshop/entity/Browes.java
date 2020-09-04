package com.hello.petshop.entity;

import java.io.Serializable;

/*
CREATE TABLE browses(
browse_id INT NOT NULL ,#浏览id
good_id	INT NOT NULL,
user_id	INT NOT NULL,
Browse_time	DATETIME NOT NULL,
PRIMARY  KEY(browse_id)
);
 */
public class Browes implements Serializable {
    int brows_id;
    int good_id;
    int user_id;
    String browse_time;

    public int getBrows_id() {
        return brows_id;
    }

    public void setBrows_id(int brows_id) {
        this.brows_id = brows_id;
    }

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

    public String getBrowse_time() {
        return browse_time;
    }

    public void setBrowse_time(String browse_time) {
        this.browse_time = browse_time;
    }

    @Override
    public String toString() {
        return "Browes{" +
                "brows_id=" + brows_id +
                ", good_id=" + good_id +
                ", user_id=" + user_id +
                ", browse_time='" + browse_time + '\'' +
                '}';
    }
}
