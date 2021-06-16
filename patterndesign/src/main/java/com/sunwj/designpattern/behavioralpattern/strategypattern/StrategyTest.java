package com.sunwj.designpattern.behavioralpattern.strategypattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/16 10:49 下午
 */
public class StrategyTest {

    public static void main(String[] args) {

        Context context = new Context();
        context.setTravelStrategy(new TravelByAirStrategy());
        context.travelMode();

        context.setTravelStrategy(new TravelByCarStrategy());
        context.travelMode();
    }
}
