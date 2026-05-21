package 智能家居;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ha[] sh=new Ha[4];
        sh[0]=new Air("路飞空调",true);
        sh[1]=new TV("蛋小红电视",true);
        sh[2]=new DW("OPPO洗碗机",true);
        sh[3]=new lamp("菩提灯",true);

        SHC shc =new SHC();
        shc.control(sh[0]);
        while(true) {
            shc.printall(sh);
            System.out.println("请选择你要操控的对象");
            Scanner sc =new Scanner(System.in);
            String a=sc.next();
            switch(a){
                case "1":
                    shc.control(sh[0]);
                case "2":
                    shc.control(sh[1]);
                case "3":
                    shc.control(sh[2]);
                case "4":
                    shc.control(sh[3]);
                default:
                    System.out.println("谢谢使用");
                    return;
            }

        }
    }
}