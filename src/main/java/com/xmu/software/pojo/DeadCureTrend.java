package com.xmu.software.pojo;

import java.util.List;

public class DeadCureTrend {
    private List<String> dateList;
    private List<Integer> deadNum;
    private List<Integer> cureNum;

    public List<String> getDateList() {
        return dateList;
    }

    public void setDateList(List<String> dateList) {
        this.dateList = dateList;
    }

    public List<Integer> getDeadNum() {
        return deadNum;
    }

    public void setDeadNum(List<Integer> deadNum) {
        this.deadNum = deadNum;
    }

    public List<Integer> getCureNum() {
        return cureNum;
    }

    public void setCureNum(List<Integer> cureNum) {
        this.cureNum = cureNum;
    }
}
