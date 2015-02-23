package org.waspec.class001;

/**
 * Created by v-daisyq on 2/21/2015.
 */
//learn about the t
public class Class15 {
    public static void main(String[]args) {
        Monk monk = new Monk();
        try{
            monk.setAge(120);
            System.out.println(monk.getAge());
            monk.setAge(24);
            System.out.println(monk.getAge());
            monk.setAge(121);
            System.out.println(monk.getAge());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
class Monk{
    public int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age)throws Exception{
        if(age>100){
            this.age=age;
        } else{
            String message=String.format("the age%d is under 100",age);
            throw new Exception(message);
        }
    }
}