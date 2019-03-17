package com.longju.pattern.factory.abstracr;

import com.longju.pattern.factory.*;

/**
 * @author changyl
 * @create 2019-03-17 22:53
 */
public class BenzFactory implements IAbstractFactory {
    @Override
    public Icar createCar() {
        return new BenzCar();
    }

    @Override
    public Ibus createBus() {
        return new BenzBus();
    }

    @Override
    public IPlane createPlane() {
        return new BenzPlane();
    }
}
