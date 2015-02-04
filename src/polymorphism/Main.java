package polymorphism;

// Created by v-daisyq on 2/1/2015.

public class Main {

    public static void main(String[]args) {

       Mpg mpg= new Mpg();
        Car car=new Bmw();
        Car car2=new Vw();
        Car car3=new QiRui();
        Car car4=new Car();
        mpg.add(car);
        car.run();
        mpg.add(car2);
        car2.run();
        mpg.add(car3);
        car3.run();
        mpg.add(car4);
        car4.run();

    }
}
