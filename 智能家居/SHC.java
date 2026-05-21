package 智能家居;

public class SHC {
    public void control(Ha ha){
        ha.press();
    }
    public void printall(Ha[] has){
        for (int i = 0; i < has.length; i++) {
            Ha ha=has[i];
            System.out.println(ha.getName()+"状态 "+(ha.isStatus()?"开":"关"));
        }
    }
}
