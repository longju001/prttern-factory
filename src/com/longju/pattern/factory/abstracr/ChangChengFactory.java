package com.longju.pattern.factory.abstracr;

import com.longju.pattern.factory.*;

/**
 * @author changyl
 * @create 2019-03-17 22:52
 */
public class ChangChengFactory implements IAbstractFactory{
    @Override
    public Icar createCar() {
        return new ChangChengCar();
    }

    @Override
    public Ibus createBus() {
        return new ChangChengbus();
    }

    @Override
    public IPlane createPlane() {
        return new ChangChengPlane();
    }
}
