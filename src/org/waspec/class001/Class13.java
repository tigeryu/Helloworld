package org.waspec.class001;
import java.util.ArrayList;


public class Class13 {
    public static void main(String[] args) {
        int a = hanoi(4);
        System.out.println(a);
        int totalNumber=haoni2(2);
        System.out.println(totalNumber);
        for (int i = 1; i <15 ; i++) {
            int total=haoni2(i);
            System.out.print(total+"\t");

        }
    }


    public static int hanoi(int level) {
        int result = 0;
        if (level == 1) {
            result = 1;
        } else {
            result = 1 + hanoi(level - 1) + hanoi(level - 1);
        }
        return result;
    }


    public static int haoni2(int year) {
    int result=0;
        if(year==1){
            result=1;
        } else if(year==2){
            result=1;
        }else {
            result=haoni2(year-1)+haoni2(year-2);
        }
        return result;
    }

}


