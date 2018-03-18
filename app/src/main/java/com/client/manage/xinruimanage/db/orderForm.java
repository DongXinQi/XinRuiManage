package com.client.manage.xinruimanage.db;

import org.litepal.crud.DataSupport;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by DS on 2018/3/18.
 */

public class orderForm extends DataSupport {
    private int id;//订单号
    private Calendar date;//下单时间
    private int orderState;//订单状态0：未付款；1：已付款
    private int dishNum;//菜品数量
    private int orderDishState;//菜品状态0：等餐中；1：已上桌
    private int dishId;//外码，订单中菜品id
    private int roomNum;//点餐房间号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public int getOrderState() {
        return orderState;
    }

    public void setOrderState(int orderState) {
        this.orderState = orderState;
    }

    public int getOrderDishState() {
        return orderDishState;
    }

    public void setOrderDishState(int orderDishState) {
        this.orderDishState = orderDishState;
    }

    public int getDishNum() {
        return dishNum;
    }

    public void setDishNum(int dishNum) {
        this.dishNum = dishNum;
    }

    public int getDishId() {
        return dishId;
    }

    public void setDishId(int dishId) {
        this.dishId = dishId;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }
}
