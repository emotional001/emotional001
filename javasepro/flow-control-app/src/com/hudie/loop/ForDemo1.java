package com.hudie.loop;

public class ForDemo1 {
    public static void main(String[] args) {
        //表示i为值 i如果小于2 则i=0 执行一次打印，再迭代i++ 对i进行一次增值为1
        //i的值为1时，i小于2 则再执行一次打印，再迭代i++ 对i的值为1进行再一次的增值为2
        //i的值为2时，i不小于2 则不再执行一次打印，终止执行打印。
        for (int i = 0; i < 2; i++){
            System.out.println("牛逼");
        }
        System.out.println("------------------------------");

        int sum = 0;
        for (int i = 1; i<=1000; i++){
            sum += i;
        }
        System.out.println("1~1000的整数和是: " + sum);

        System.out.println("-------------------------");

        //需求:做一个1~100的奇数和
        int sum2 = 0;
        for (int i = 1; i<=100; i += 2){
            sum2 += i;
        }
        System.out.println("1~100的奇数和为: " + sum2);

        System.out.println("--------------------------");

        //先定义sum3为0，做循环取1~100的值，然后进行if的筛选，i的值为1取余2结果为1 则表示为奇数，i的值为2取余2结果为0 则表示偶数，以此叠加i的值筛选奇数出来
        //将i的奇数值加入sum3作为显示打印的内容
        int sum3 = 0;
        for (int i = 1; i < 100; i++){
            if (i % 2 == 1) {
                sum3 += i;
            }
        }
        System.out.println("1~100的奇数和为: " + sum3);

        System.out.println("--------------------------");

        //需求：做一个1~1000的偶数和
        int sum4 = 0;
        for (int i = 2; i <= 1000 ; i += 2) {
            sum4 += i;
        }
        System.out.println("1~1000的偶数和为: " + sum4);
    }
}
