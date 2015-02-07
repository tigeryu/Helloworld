package org.waspec.class001;

/**
 * Created by v-daisyq on 2/4/2015.
 */
public class Class9 {
    //数据类型提升  ， 两个数据进行操作的时候将提高到精度高的类型   {{}} 块当作一条语句 statement,s

   public static int a;

    public static void main(String[] args) {

        final int x = 100;    //只有一次赋值机会，之后无法改变这个值；
        System.out.println(x);
        Teve teve=new Teve();
        teve.play();
        Cal.add(12, 16);   //side effect;        12,16   在调用方法的时候所提供的值和表达式   是实际参数
        System.out.println(a);
        System.out.println(teve.x);





    }
}

    class Teve {
        int x;
        public void play() {
            System.out.println("CCTV");
        }
    }

    class Cal {
        public static double add(double a, double b) {     // double a, double b; 在声明定义方法的时候声明的参数变量 形式参数
            double total = a + b;
            System.out.println(total);
            return total;
        }
    }

