package org.waspec.class001;

/**
 * Created by v-daisyq on 2/26/2015.
 */
public class Main {
    public static void main(String[] args) {
    Human american=new American();
        american.setAge(20);
        american.greeting();
        System.out.println(american.getAge());

        Human chinese=new Chinese();
        chinese.greeting();
        chinese.setAge(20);
        System.out.println(chinese.getAge());

        Human abc=new ABC();
        abc.setAge(20);
        abc.greeting();
        System.out.println(abc.getAge());

    }
}
interface Human{
  void greeting();
    void setAge(int age);
    int getAge();
}
class  American implements Human{
    protected int _age;
    @Override
    public void greeting() {
        System.out.println("hello!");
    }

    @Override
    public void setAge(int age) {
    this._age=age;
    }

    @Override
    public int  getAge() {
     return this._age;
    }
}
abstract class ChineseBase implements Human{
    protected int _age;
    @Override
    public void greeting() {
        System.out.println("你好！");
    }

    @Override
    public void setAge(int age) {
        this._age=age;
    }

    public abstract int  getAge();
}

class Chinese extends ChineseBase{
    @Override
    public int getAge(){
        return this._age+1;
      }
}
class ABC extends ChineseBase{
    @Override
    public int getAge(){
        return this._age;
    }
}