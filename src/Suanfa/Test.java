package Suanfa;
public class Test {
    //Reverse words in a sentence
    public static void main(String[] args){
        char temp;
        char[] str = "Hello World".toCharArray();
        for(int i = 0; i <= str.length/2; i++){
            temp = (char) (str[i] ^ str[str.length - 1 - i]);
            str[i] ^= temp;
            str[str.length - 1 - i] ^= temp;
        }
        System.out.println(str);
        int i = 0;
        while(i < str.length){
            int j = i;
            while(j != str.length &&str[j] != ' ') j++;
            for(int k = i; k <= (i + j - 1) /2; k++){
                temp = (char) (str[k] ^ str[j - 1 - k + i]);
                str[k] ^= temp;
                str[j - 1 - k + i] ^= temp;
            }
            i = j + 1;
        }
        System.out.println(str);
    }
}
