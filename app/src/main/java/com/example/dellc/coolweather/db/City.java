package com.example.dellc.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 城市
 * Created by dellc on 2017/6/7.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;//市的名字
    private int ityCode;//市的代号
    private int provinceId;//当前市所属省的id值

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getItyCode() {
        return ityCode;
    }

    public void setItyCode(int ityCode) {
        this.ityCode = ityCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
