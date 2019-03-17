package com.longju.pattern.factory.simple;

import com.longju.pattern.factory.BenzCar;
import com.longju.pattern.factory.ChangChengCar;
import com.longju.pattern.factory.Icar;

/**
 * @author changyl
 * @create 2019-03-17 17:35
 */
public class CarSimpleFactory {

    public static Icar createCar(String name){
        if("changcheng".equals(name)){
            return new ChangChengCar();
        } else if("benz".equals(name)){
            return new BenzCar();
        }
        return new ChangChengCar();
    }


    /**
     * 用反射创建汽车实例
     */
    public static Icar create2(Class clazz){
        try {
            if(null!=clazz){
                return (Icar) clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ChangChengCar();
    }

}
