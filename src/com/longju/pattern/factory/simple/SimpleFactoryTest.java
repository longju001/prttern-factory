package com.longju.pattern.factory.simple;

import com.longju.pattern.factory.ChangChengCar;
import com.longju.pattern.factory.Icar;

/**
 * @author changyl
 * @create 2019-03-17 17:34
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {

        Icar car = CarSimpleFactory.createCar("benz");

        Icar car2 = CarSimpleFactory.create2(ChangChengCar.class);

        car.run();
        car2.run();

    }

}
