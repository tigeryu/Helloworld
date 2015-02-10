package org.waspec.class001;

/**
 * Created by v-daisyq on 2/9/2015.
 */
public class Class11 {


    public static void main(String[] args) {

        char[] chars = "abcdefg".toCharArray();
        reverse(chars, 0, chars.length-1);
        String string = new String(chars);
        System.out.println(string);
    }


        public static void reverse ( char[] charArray, int startIndex, int endIndex){

            int leftIndex = startIndex;
            int rightIndex = endIndex;
            while (leftIndex <= (rightIndex-leftIndex)/2+leftIndex) {
                char temp = charArray[leftIndex];
                charArray[leftIndex] = charArray[rightIndex];
                charArray[leftIndex] = temp;
                leftIndex++;
                rightIndex--;


            }


        }

    }
