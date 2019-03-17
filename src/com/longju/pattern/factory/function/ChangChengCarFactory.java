package com.longju.pattern.factory.function;

import com.longju.pattern.factory.ChangChengCar;
import com.longju.pattern.factory.Icar;

/**
 * @author changyl
 * @create 2019-03-17 22:13
 */
public class ChangChengCarFactory implements ICarFunctionFactory {
    @Override
    public Icar create() {
        return new ChangChengCar();
    }
}
