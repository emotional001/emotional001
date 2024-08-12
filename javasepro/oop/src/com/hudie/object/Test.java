package com.hudie.object;

public class Test {
    public static void main(String[] args) {

        //波妞的学生数据
        Student s1 = new Student();
        s1.name = "波妞";
        s1.chinese = 100;
        s1.math = 100;
        s1.printTocalScore();
        s1.printAverageScore();

        //胖仔的学生数据
        Student s2 = new Student();
        s2.name = "胖仔";
        s2.chinese = 59;
        s2.math = 100;
        s2.printTocalScore();
        s2.printAverageScore();
    }
}
