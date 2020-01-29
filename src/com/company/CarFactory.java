package com.company;

/**
 * Created by narges nastran on 11/02/2019.
 */
public class CarFactory {
    public static Car getCar(int x)
    {
        switch(x)
        {
            case 1 :
                return new PorschePanamera4s();

            case 2 :
                return new HyundaiCentennial();
            case 3 :
                return new AudiQ5();
            case 4 :
                return new BMWX6();
            case 5 :
                return new KiaSorento();
        }
    }
}
