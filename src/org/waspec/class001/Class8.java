package org.waspec.class001;

/**
 * Created by v-daisyq on 2/2/2015.
 */
public class Class8 {

    public static void main(String[]args){

       double a=5;  //数据隐式类型转换
        int c=5;
        int b=4;
        float d=4;
        Double x=new Double(3);
        Double y=new Double(2);
        y=y+1;
        System.out.println(x==y);       // 比较的是是不是同一个实例   结果是faulse!
        System.out.println(a/b);
        System.out.println(c/d);
        System.out.println(c%b);     //如果是一个负数，那么得到的%的值还是负数   先绝对值取余数

        short s=3;
        s+=1;              //可以进行操作，是因为+=是一个操作符，相当于(short)s=(short)(s+1)
        System.out.println(s);
        s=(short)(s+1);  //类型提升       s=s+1会出错，因为s+1把一个short类型的s和整形1相加有类型提升，将得到一个int类型的值
        System.out.println(s);

        Vehicle vehicle=new Vehicle();
        vehicle.speed=12;

        Truck truck=new Truck();
        truck.speed=12;   //对象引用的父类实例的变量
        truck.payload=13;  //对象引用自己的实例变量  vehicle.speed不会出现， 父类的实例不能引用子类的实例变量





     /*   int x=100;
        int y=200;
        System.out.println(x++>100&&y--<=200);
        System.out.println(x);
        System.out.println(y);     //先运算左边是faulse, 然后y--根本不进行运算  被短路掉
*/

    }

}
class Vehicle{
    public double speed;
}
class Truck extends Vehicle{

    public double payload;
}
class Car extends Vehicle{
    public int passanger;
}
