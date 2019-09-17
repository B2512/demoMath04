package b2512.wuzhangjie;

import java.util.Scanner;

public class profit {
    public static void main(String[] args) {
        double bonus = 0;
        System.out.print("请你输入当月的利润:");
        double profit = new Scanner(System.in).nextDouble();
        if (profit<=100000){
            bonus =profit * 0.1;
        }else if (profit>100000&&profit<200000){
            bonus = 100000 * 0.1 + (profit - 100000) * 0.075;
        }else if (profit>200000&&profit<400000){

        }
        System.out.println(bonus);
    }
}
