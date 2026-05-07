import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Card goldCard =  new GoldCard("G001", "张三", "13800138001", 5000.0);
        pay(goldCard);
        Card silverCard =  new SilverCard("S001", "李四", "13800138002", 2000.0);
        pay(silverCard);
    }

    private static void pay(Card a) {
        System.out.println("请刷卡");
        Scanner sc=new Scanner(System.in);
        double money=sc.nextDouble();
        a.consume(money);
    }
}