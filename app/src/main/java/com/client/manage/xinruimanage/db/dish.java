package com.client.manage.xinruimanage.db;

import org.litepal.crud.DataSupport;

/**
 * Created by DS on 2018/3/18.
 */

public class dish extends DataSupport {
    private int id;
    private String dishName;
    private String taste;//口味
    private float everPrice;//原价
    private float nowPrice;//现价
    private int dishState;//菜品状态0：销售中；1：已售罄
    private String detail;//详情
    private int cateId;//外码，种类id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public float getEverPrice() {
        return everPrice;
    }

    public void setEverPrice(float everPrice) {
        this.everPrice = everPrice;
    }

    public float getNowPrice() {
        return nowPrice;
    }

    public void setNowPrice(float nowPrice) {
        this.nowPrice = nowPrice;
    }

    public int getDishState() {
        return dishState;
    }

    public void setDishState(int dishState) {
        this.dishState = dishState;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getCateId() {
        return cateId;
    }

    public void setCateId(int cateId) {
        this.cateId = cateId;
    }
}
