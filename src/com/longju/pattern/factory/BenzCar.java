package com.longju.pattern.factory;

/**
 * @author changyl
 * @create 2019-03-17 17:30
 */
public class BenzCar implements Icar {
    @Override
    public void run() {
        System.out.println("奔驰汽车上路");
    }
}
