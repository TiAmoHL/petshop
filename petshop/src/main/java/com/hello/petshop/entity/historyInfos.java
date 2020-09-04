package com.hello.petshop.entity;

import java.io.Serializable;


public class historyInfos implements Serializable {
    int history_id;
    int user_id;
    String history_info;
    String histroy_time;

    public int getHistory_id() {
        return history_id;
    }

    public void setHistory_id(int history_id) {
        this.history_id = history_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getHistory_info() {
        return history_info;
    }

    public void setHistory_info(String history_info) {
        this.history_info = history_info;
    }

    public String getHistroy_time() {
        return histroy_time;
    }

    public void setHistroy_time(String histroy_time) {
        this.histroy_time = histroy_time;
    }

    @Override
    public String toString() {
        return "historyInfos{" +
                "history_id=" + history_id +
                ", user_id=" + user_id +
                ", history_info='" + history_info + '\'' +
                ", histroy_time='" + histroy_time + '\'' +
                '}';
    }
}
