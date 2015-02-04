package org.waspec.class001;

/**
 * Created by v-daisyq on 1/28/2015.
 方法有两种， 一个有返回值，一个没有返回值void   等接口以后声明和定义分开
 方法的名字一定是个动词 (方法参数)

 */
public class Televesion {

    public void play(int channel){

          //方法体
        String message=String.format("Playing channel %d",channel);
        System.out.println(message);
    }

    public int shutTv(int time){      //有返回值 ， 返回一个整数类型的time；

        return time;
    }

}
