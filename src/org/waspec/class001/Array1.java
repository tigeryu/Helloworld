package org.waspec.class001;

/**
 * Created by v-daisyq on 2/9/2015.
 */
public class Array1 {

    public static void main(String[]args) {
        Student[] students=new Student[10];
        for (int i = 0; i <10 ; i++) {
            students[i]=new Student();
            students[i].score=i*10;
        }
        for(Student finger:students){
            finger.score=finger.score+1;

        }for(Student finger:students){                     //叠带！
            System.out.println(finger.score);

        }

    }

}
class Student{

    public int score;
        }
