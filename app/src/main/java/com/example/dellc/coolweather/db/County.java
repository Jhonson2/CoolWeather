package com.example.dellc.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 县区
 * Created by dellc on 2017/6/7.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;//县的名字
    private String weaterId;//县的代号
    private int cityId;//当前县区所属的市的id值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeaterId() {
        return weaterId;
    }

    public void setWeaterId(String weaterId) {
        this.weaterId = weaterId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
