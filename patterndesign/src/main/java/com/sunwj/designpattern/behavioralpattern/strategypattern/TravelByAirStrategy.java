package com.sunwj.designpattern.behavioralpattern.strategypattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/16 10:46 下午
 */
public class TravelByAirStrategy implements TravelStrategy{
    @Override
    public void travelMode() {
        System.out.println("travel by air");
    }
}
