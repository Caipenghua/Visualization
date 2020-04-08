package com.xmu.software.service;

import com.xmu.software.domain.Country;
import com.xmu.software.domain.MapChart;
import com.xmu.software.mapper.CountryMapper;
import com.xmu.software.pojo.DeadCureTrend;
import com.xmu.software.pojo.InfoCard;
import com.xmu.software.pojo.Trend;
import com.xmu.software.util.DateChange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {
    @Autowired
    private CountryMapper countryMapper;

    public InfoCard getInfoCardInChina(){
        Country country=countryMapper.getNewest();
        InfoCard infoCard=new InfoCard();
        infoCard.setConfirmedCount(country.getConfirm());
        infoCard.setCuredCount(country.getCure());
        infoCard.setCurrentConfirmedCount(country.getConfirmCur());
        infoCard.setSuspectedCount(country.getSuspect());
        return infoCard;
    }

    public Trend getIncreaseTrendInChina(){
        List<Country> countryList=countryMapper.getAll();
        Trend trend=new Trend();
        List<String> date=new ArrayList<>();
        List<Integer> num=new ArrayList<>();
        for (int i=0;i<countryList.size();i++){
            LocalDateTime localDateTime=countryList.get(i).getDate();
            String s=DateChange.change(localDateTime);
            date.add(s);
            num.add(countryList.get(i).getConfirmAdd());
        }
        trend.setDateList(date);
        trend.setNum(num);
        return trend;
    }

    public Trend getConfirmTrendInChina(){
        Trend trend=new Trend();
        List<Country> countryList=countryMapper.getAll();
        List<String> date=new ArrayList<>();
        List<Integer> num=new ArrayList<>();
        for (int i=0;i<countryList.size();i++){
            LocalDateTime localDateTime=countryList.get(i).getDate();
            String s=DateChange.change(localDateTime);
            date.add(s);
            num.add(countryList.get(i).getConfirm());
        }
        trend.setDateList(date);
        trend.setNum(num);
        return trend;
    }

    public DeadCureTrend getDeadCureTrendInChina(){
        DeadCureTrend deadCureTrend=new DeadCureTrend();
        List<Country> countryList=countryMapper.getAll();
        List<String> date=new ArrayList<>();
        List<Integer> deadNum=new ArrayList<>();
        List<Integer> cureNum=new ArrayList<>();
        for (int i=0;i<countryList.size();i++){
            LocalDateTime localDateTime=countryList.get(i).getDate();
            String s=DateChange.change(localDateTime);
            date.add(s);
            deadNum.add(countryList.get(i).getDead());
            cureNum.add(countryList.get(i).getCure());
        }
        deadCureTrend.setDateList(date);
        deadCureTrend.setDeadNum(deadNum);
        deadCureTrend.setCureNum(cureNum);
        return deadCureTrend;
    }

    public List<MapChart> getMapChartInChinaAll(){
        List<MapChart> list=countryMapper.getMap();
        return list;
    }
}
