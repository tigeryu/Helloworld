package org.waspec.class001;


import java.io.*;

/**
 * Created by v-daisyq on 2/23/2015.
 */
public class practise2 {
    public static void main(String[] args) {
        while (true){
            try{
                InputStreamReader inputStreamReader=new InputStreamReader(System.in);
                BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
                String content1=bufferedReader.readLine();
                Integer integer1=Integer.parseInt(content1);
                String content2=bufferedReader.readLine();
                Integer integer2=Integer.parseInt(content2);
                Calculators calculators=new Calculators();
                int sum=calculators.add(integer1,integer2);
                System.out.println(String.format("%d+%d=%d",integer1,integer2,sum));

                if(sum==99){
                    System.out.println("game over");
                    break;
                }
            }catch (IOException e){
                System.out.println("read error");
            } catch (NumberFormatException e){
                System.out.println("number format error , please enter the next ones!");
            }
        }
    }
}
class Calculators{
    public int add(int a, int b){
        return a+b;
    }
}
