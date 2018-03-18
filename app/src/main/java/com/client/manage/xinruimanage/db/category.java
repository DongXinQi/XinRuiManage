package com.client.manage.xinruimanage.db;

import org.litepal.crud.DataSupport;

/**
 * Created by DS on 2018/3/18.
 */

public class category extends DataSupport {
    private int id;
    private String catename;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCatename() {
        return catename;
    }

    public void setCatename(String catename) {
        this.catename = catename;
    }
}
