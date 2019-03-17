package com.longju.pattern.factory.function;

import com.longju.pattern.factory.BenzCar;
import com.longju.pattern.factory.ChangChengCar;

/**
 * @author changyl
 * @create 2019-03-17 22:14
 */
public class FunctionFactoryTest {

    public static void main(String[] args) {

        ICarFunctionFactory factory = new BenzCarFactory();
        BenzCar car1 = (BenzCar) factory.create();
        car1.run();

        /*ChangChengCar car2 = (ChangChengCar) factory.create();
        car2.run();*/

    }

}
