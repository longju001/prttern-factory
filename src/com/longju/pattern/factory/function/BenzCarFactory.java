package com.longju.pattern.factory.function;

import com.longju.pattern.factory.BenzCar;
import com.longju.pattern.factory.Icar;

/**
 * @author changyl
 * @create 2019-03-17 22:12
 */
public class BenzCarFactory implements ICarFunctionFactory{
    @Override
    public Icar create() {
        return new BenzCar();
    }
}
