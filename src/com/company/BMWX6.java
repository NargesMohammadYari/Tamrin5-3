package com.company;

/**
 * Created by narges nastran on 10/31/2019.
 */
public class BMWX6 implements Car{
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
        System.out.println("408 asbe bokhar dar 6400 dor dar daghoghe");
    }
    @Override
    public void weight()
    {
        System.out.println("2265kilogeram");
    }
    @Override
    public void acceleration()
    {
        System.out.println("5.4 sanie");
    }

}
