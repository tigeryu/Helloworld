package Suanfa;

/**
 * Created by v-daisyq on 2/10/2015.
 */
public class NumberForeach {
    public static void main(String[]args) {
        int[] score = new int[10];

        for (int i = 0; i <10 ; i++) {
                score[i]=i*10;
        }
        for(int in:score){
            in=in+1;

        }
        for(int in:score){
            System.out.println(in);
        }



        Studen[] studens=new Studen[10];
        for (int i = 0; i <10 ; i++) {
            studens[i]=new Studen();
            studens[i].defen=i*10;
        }
        for(Studen stu:studens){
            stu.defen=stu.defen+1;
            System.out.println(stu.defen);
        }

    }

}



class Studen{
    int defen;
}

