package com.hello.petshop.entity;

import java.io.Serializable;


public class Orders implements Serializable {
    int order_id;
    int usr_id;
    int good_id;
    String order_time;
    int order_amount;
    String consignee_id;
    int order_state;
    int payment_method;

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getUsr_id() {
        return usr_id;
    }

    public void setUsr_id(int usr_id) {
        this.usr_id = usr_id;
    }

    public int getGood_id() {
        return good_id;
    }

    public void setGood_id(int good_id) {
        this.good_id = good_id;
    }

    public String getOrder_time() {
        return order_time;
    }

    public void setOrder_time(String order_time) {
        this.order_time = order_time;
    }

    public int getOrder_amount() {
        return order_amount;
    }

    public void setOrder_amount(int order_amount) {
        this.order_amount = order_amount;
    }

    public String getConsignee_id() {
        return consignee_id;
    }

    public void setConsignee_id(String consignee_id) {
        this.consignee_id = consignee_id;
    }

    public int getOrder_state() {
        return order_state;
    }

    public void setOrder_state(int order_state) {
        this.order_state = order_state;
    }

    public int getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(int payment_method) {
        this.payment_method = payment_method;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "order_id=" + order_id +
                ", usr_id=" + usr_id +
                ", good_id=" + good_id +
                ", order_time='" + order_time + '\'' +
                ", order_amount=" + order_amount +
                ", consignee_id='" + consignee_id + '\'' +
                ", order_state=" + order_state +
                ", payment_method=" + payment_method +
                '}';
    }
}
