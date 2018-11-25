package com.fh.area.api;

import java.io.Serializable;

public class Area implements Serializable {

    private static final long serialVersionUID = -3764761836620091028L;

    private Integer aid;

    private Integer areaFatherId;

    private String areaName;


    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getAreaFatherId() {
        return areaFatherId;
    }

    public void setAreaFatherId(Integer areaFatherId) {
        this.areaFatherId = areaFatherId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }
}
