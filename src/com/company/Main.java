package com.company;
import java.util.Scanner
public class Main {

    public static void main(String[] args) {
        int x;
        Scanner x=new Scanner(System.in);
        if(x==1)
        {
            Car porsche=CarFactory.getCar(Car.PorschePanamera4s);
            porsche.speed();
            porsche.acceleration();
            porsche.engine();
            porsche.power();
            porsche.weight();
        }
        else if(x==2){
            Car car=CarFactory.getCar(Car.PorschePanamera4s);
            car.speed();
            car.acceleration();
            car.engine();
            car.power();
            car.weight();

        }





        Car car=CarFactory.getCar(Car.PorschePanamera4s);
        car.speed();
        car.acceleration();
        car.engine();
        car.power();
        car.weight();


        Car car=CarFactory.getCar(Car.PorschePanamera4s);
        car.speed();
        car.acceleration();
        car.engine();
        car.power();
        car.weight();


        Car car=CarFactory.getCar(Car.PorschePanamera4s);
        car.speed();
        car.acceleration();
        car.engine();
        car.power();
        car.weight()

    }
}
