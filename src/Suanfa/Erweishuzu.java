package Suanfa;

/**
 * Created by v-daisyq on 2/10/2015.
 */
public class Erweishuzu {

    public static void main(String[] args) {

        char[][] desk = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                desk[i][j] = ((i + j) % 2 == 0 ? 'X' : 'O');
            }

        }
        for (int i = 0; i <8 ; i++) {
            String str=new String(desk[i]);
            System.out.println(str);
        }
    }
}
