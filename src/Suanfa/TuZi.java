package Suanfa;

public class TuZi {


    public static void main(String[] args) {
        Revers revers=new Revers();

        int[] myA={12,14,16,244,22,55,45};
        revers.reverse(myA);

//        for (int i = 0; i <myA.length ; i++) {
//            System.out.print(myA[i ]+"\t");
 //       }
        for(int myint:myA){
            System.out.print(myint+"\t");
        }

    }

}
    class Revers{
    public int[] reverse(int[] array1){
        for (int i = 0; i <array1.length/2 ; i++) {
            int temp=array1[i];
            array1[i]=array1[array1.length-1-i];
            array1[array1.length-1-i]=temp;
        }
        return array1;

    }
}