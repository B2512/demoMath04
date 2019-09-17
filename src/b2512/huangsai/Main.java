package b2512.huangsai;
/*一球从100米高度自由落下,每次落地后反跳回原高度的一半
再落下,求它在第10次落地时经过多少米？第10次反弹多高？*/
public class Main {
    public static void main(String[] args) {
        double high = 100,ont = 100;
        for (int i=1; i<=10;i++){
            high = high/2;
            ont= ont+high*2;
        }
//        high = high/2;
        System.out.println("米"+ont+"\n高"+high);
    }
}
