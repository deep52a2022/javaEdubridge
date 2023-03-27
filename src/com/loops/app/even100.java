package com.loops.app;

public class even100 {
    public static void main(String[] args) {
        int n = 100;

        do{
            if((n & 1) == 0){
                System.out.println(n);
                n--;
            }
            n--;
        }while(n >= 1);

//        for(int i = 100; i >= 1; i--){
//            if(i % 2 == 0) System.out.println(i);
//        }
    }
}
