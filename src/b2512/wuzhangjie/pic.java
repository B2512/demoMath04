package b2512.wuzhangjie;

public class pic {
    public static void main(String[] args){
        double h = 100;//记录球每次反弹和下次落地时的高度
        double sum = 0;//统计球一共经过多少米
        for (int i = 1;i<=10;i++){
            sum = sum + h;//累加上落地时经过的高度 0=0+100;
//            System.out.println(sum);
            h = h/2;//反弹的高度 100/2=50;
//            System.out.println(h);
            sum = sum + h;//再累加上反弹的高度 100+50=150;
        }
        System.out.println("第10次落地时,共经过:"+sum+"米。第10次反弹"+h+"米");
    }
}
