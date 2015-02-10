package Suanfa;

public class TuZi {


    public static void main(String[] args) {


        char[] myChar="this is a black cat".toCharArray();
        TuZi.reverse(myChar,0,myChar.length-1);
        for(char char2:myChar) {
            System.out.print(char2);
        }
        System.out.println();

            int i=0; int j=0;
            for (i=0;j<myChar.length;j++) {
                if(myChar[j ]==' '){
                    TuZi.reverse(myChar,i,j-1);
                    i=j+1;
                }


            }
            TuZi.reverse(myChar,i,myChar.length-1);

            for (char char1 : myChar) {
                System.out.print(char1);
            }


        }



    public static char[] reverse(char[] array1,int startIndex,int endIndex){
        int leftIndex=startIndex;
        int rightIndex=endIndex;
        while (leftIndex<rightIndex){
            char temp=array1[leftIndex];
            array1[leftIndex]=array1[rightIndex];
            array1[rightIndex]=temp;
            leftIndex++;
            rightIndex--;
        }
        return array1;
    }
}