package com.hudie.object;
//面对对象的学生成绩模板
public class Student {
    String name;
    double chinese;
    double math;

    public void printTocalScore(){
        System.out.println(name + "的总成绩是： " + (chinese + math));
    }

    public void printAverageScore() {
        System.out.println(name + "的平均成绩是： " + (chinese + math) / 2.0);
    }
}
