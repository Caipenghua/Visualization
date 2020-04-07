package com.xmu.software.controller;

import com.xmu.software.pojo.DeadCureTrend;
import com.xmu.software.pojo.InfoCard;
import com.xmu.software.pojo.MapChart;
import com.xmu.software.pojo.Trend;
import com.xmu.software.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;
    /**
     * 现有确证、现有疑似、累计确证、累计治愈等信息
     * @return
     */
    @GetMapping("/infoCardInChina")
    public InfoCard getInfoCardInChina(){
        return countryService.getInfoCardInChina();
    }

    /**
     * 地图现有确诊
     * @return
     */
    @GetMapping("/mapChartInChinaNow")
    public List<MapChart> getMapChartInChinaNow(){
        return  null;
    }

    /**
     * 地图累计确诊
     * @return
     */
    @GetMapping("/mapChartInChinaAll")
    public List<MapChart> getMapChartInChinaAll(){
        return  null;
    }

    /**
     * 全国疫情新增趋势
     * @return
     */
    @GetMapping("/increaseTrendInChina")
    public Trend getIncreaseTrendInChina(){
        return countryService.getIncreaseTrendInChina();
    }

    /**
     * 全国疫情确诊趋势
     * @return
     */
    @GetMapping("/confirmTrendInChina")
    public Trend getConfirmTrendInChina(){
        return countryService.getConfirmTrendInChina();
    }

    /**
     * 全国疫情死亡治愈趋势
     * @return
     */
    @GetMapping("/deadCureTrendInChina")
    public DeadCureTrend getDeadCureTrendInChina(){

        return countryService.getDeadCureTrendInChina();
    }


}
