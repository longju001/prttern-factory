package com.longju.pattern.factory.abstracr;

import com.longju.pattern.factory.IPlane;
import com.longju.pattern.factory.Ibus;
import com.longju.pattern.factory.Icar;

/**
 * @author changyl
 * @create 2019-03-17 22:44
 */
public interface IAbstractFactory {

    Icar createCar();

    Ibus createBus();

    IPlane createPlane();

}
