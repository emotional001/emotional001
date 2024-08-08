package com.hudie.loop;

public class BreakAndContinueDemo5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("我爱你: " + i);
            if (i == 3){
                break;
            }
        }
        System.out.println("------------------------------");


        for (int i = 1; i <= 5; i++) {
            if (i == 3){
                continue;
            }
            System.out.println("我爱你: " + i);
        }
    }
}
