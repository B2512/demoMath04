package b2512.yeqingnan;

public class Main {
    public static void main(String[] args) {
        double sum = 100, height = 100;
        for (int i = 1; i <= 10; i++) {
            height = height / 2;
            sum = sum + height * 2;
        }
        height = height / 2;
        System.out.println("第十次落地时的高度是：" + height + "\n小球共经过：" + sum + "米");
    }
}
