package com.hudie.demo;

public class TestDemo1 {
    public static void main(String[] args) {


        int[] faceScores = {15,9000,10000,20000,9500,-5};

        int max = faceScores[0];

        for (int i = 1; i < faceScores.length; i++) {
            if (max < faceScores[i]) {
                max = faceScores[i];
            }
        }
        System.out.println(max);
    }
}
