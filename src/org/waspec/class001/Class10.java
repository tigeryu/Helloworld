package org.waspec.class001;

/**
 * Created by v-daisyq on 2/6/2015.
 */
public class Class10 {
    public static void main(String[] args) {

        int[] myArray={12,13,55,33,11,44,67,99,7,6,5,444,1};
        for (int i = 0; i <myArray.length/2 ; i++) {
            int temp=myArray[i];
            myArray[i]=myArray[myArray.length-1-i];
            myArray[myArray.length-1-i]=temp;
        }
        int leftIndex=0;
        int rightIndex=myArray.length-1;
        while (leftIndex<=rightIndex){
            int temp=myArray[leftIndex];
            myArray[leftIndex]=myArray[rightIndex];
            myArray[rightIndex]=temp;
            leftIndex++;
            rightIndex--;
        }
        for(int x:myArray){
            System.out.print(x+",");
        }

    }
}