package com.example.dellc.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 省份
 * DataSupport继承：litepal中的每个实体类
 * Created by dellc on 2017/6/7.
 */

public class Province extends DataSupport {
    private int id;//id字段
    private String provinceName;//省的名字
    private int provinceCode;//省的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
