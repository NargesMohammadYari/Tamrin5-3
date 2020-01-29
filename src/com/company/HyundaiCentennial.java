package com.company;

/**
 * Created by narges nastran on 10/31/2019.
 */
public class HyundaiCentennial implements Car{
    @Override
    public void speed()
    {
        System.out.println("250 kilometr dar saat");
    }
    @Override
    public void engine()
    {
        System.out.println("8silandr 32 sopape");
    }
    @Override
    public void power()
    {
        System.out.println("366 asbe bokhar dar 6500 dor dar daghoghe");
    }
    @Override
    public void weight()
    {
        System.out.println("-kilogeram");
    }
    @Override
    public void acceleration()
    {
        System.out.println("6.7sanie");
    }

}
