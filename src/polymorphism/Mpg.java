package polymorphism;

// Created by v-daisyq on 2/1/2015.

public class Mpg {


    private Car[] theList=new Car[10];
    private int i=0;

    public void add(Car a) {

        if (i<theList.length){
            theList[i]=a;
            System.out.println("Car added at index "+i);
            i++;
        }

    }
}
