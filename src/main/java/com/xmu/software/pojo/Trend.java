package com.xmu.software.pojo;

import com.xmu.software.util.DateChange;

import java.util.Date;
import java.util.List;

public class Trend {
    private List<String> dateList;
    private List<Integer> num;

    public List<String> getDateList() {
        return dateList;
    }

    public void setDateList(List<String> dateList) {
        this.dateList = dateList;
    }

    public List<Integer> getNum() {
        return num;
    }

    public void setNum(List<Integer> num) {
        this.num = num;
    }
}
