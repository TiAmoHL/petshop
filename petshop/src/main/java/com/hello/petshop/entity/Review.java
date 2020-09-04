package com.hello.petshop.entity;

import java.io.Serializable;

public class Review implements Serializable {
    int review_id;
    int order_id;
    int revert_id;
    int goods_id;
    String review_name;
    String revert_name;
    String review_info;
    String review_time;

    public int getReview_id() {
        return review_id;
    }

    public void setReview_id(int review_id) {
        this.review_id = review_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getRevert_id() {
        return revert_id;
    }

    public void setRevert_id(int revert_id) {
        this.revert_id = revert_id;
    }

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public String getReview_name() {
        return review_name;
    }

    public void setReview_name(String review_name) {
        this.review_name = review_name;
    }

    public String getRevert_name() {
        return revert_name;
    }

    public void setRevert_name(String revert_name) {
        this.revert_name = revert_name;
    }

    public String getReview_info() {
        return review_info;
    }

    public void setReview_info(String review_info) {
        this.review_info = review_info;
    }

    public String getReview_time() {
        return review_time;
    }

    public void setReview_time(String review_time) {
        this.review_time = review_time;
    }

    @Override
    public String toString() {
        return "Review{" +
                "review_id=" + review_id +
                ", order_id=" + order_id +
                ", revert_id=" + revert_id +
                ", goods_id=" + goods_id +
                ", review_name='" + review_name + '\'' +
                ", revert_name='" + revert_name + '\'' +
                ", review_info='" + review_info + '\'' +
                ", review_time='" + review_time + '\'' +
                '}';
    }
}
