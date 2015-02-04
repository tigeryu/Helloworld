package org.waspec.class001;

public class Main {

    public static void main(String[] args) {
        int a=-1;
        String str1 = String.format("%32s", Integer.toBinaryString(a)).replace(" ", "0");
        System.out.println(str1);
        System.out.println(5.0/3.0);// type accuracy increase

        Human human1=new Human();// 实例化；将
        human1.age=35;
        System.out.println(human1.age);

        Televesion TV=new Televesion();  //方法的调用
        TV.play(14);   //调用方法的时候直接给一个值就可以了， int x=12 错误

        Calculation calculator= new Calculation();
        double total=calculator.add(12.0,13.1);
        System.out.println(total);
        int timeshutoff=TV.shutTv(12);
        System.out.println("TV will close at the time of "+timeshutoff);
        System.out.println("the TV will turn off at "+TV.shutTv(14));
        System.out.printf("the tv will turn off at %s\n", TV.shutTv(14));

        Human daisy=new Human();//
        daisy.work(20);   //

        int x= Short.MAX_VALUE;
        System.out.println(x);
        System.out.println(Short.MIN_VALUE);

        int x1=3;
        int [] array1= new int[x1];
        x1=++x1;
        array1[2]=12;
        array1[1]=1;
        System.out.println(x1);
        System.out.println(array1[2]);




    }
}

