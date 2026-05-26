public class 验证码String {
    public static void main(String[] args) {
        String code =YZM(6);
        System.out.println(code);
    }

    public static String YZM(int n){
        String str="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String code="";
        for (int i = 0; i < n; i++) {
            int index =(int)(Math.random()*str.length());
            code+=str.charAt(index);
        }
        return code;
    }
}