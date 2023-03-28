package com.loops.app;

public class JumpStatement {
    public static void main(String[] args) {
        for(int i = 40; i < 100; i++){
            if(i == 50 ) continue;
            if(i == 70) break;
            System.out.println(i);
        }


    }


}
