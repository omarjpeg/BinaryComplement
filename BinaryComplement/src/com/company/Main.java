package com.company;

public class Main {

    private static Object StringBuilder;

    public static void main(String[] args) {
        System.out.println(findComplement(1));

    }
    public static int findComplement(int num) {
        String workon = Integer.toBinaryString(num);

    char[] array = workon.toCharArray();
    String output = "";
    for(char q : array){
        switch (q){
            case '0':
                output = output.concat("1");
                break;
            case '1':
               output =  output.concat("0");
                break;
        }
    }

        return Integer.parseInt(output,2);
    }
}
