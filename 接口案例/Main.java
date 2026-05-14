package 接口案例;

public class Main {
    Student[]allStudents=new Student[10];
    public static void main(String[] args) {
        Student[] allStudents = new Student[10];
        allStudents[0] = new Student("张三", '男', 82.6);
        allStudents[1] = new Student("李四", '女', 92.3);
        allStudents[2] = new Student("王五", '男', 85.7);
        allStudents[3] = new Student("赵六", '女', 67.2);
        allStudents[4] = new Student("孙七", '男', 91.8);
        allStudents[5] = new Student("周八", '女', 73.4);
        allStudents[6] = new Student("吴九", '男', 88.6);
        allStudents[7] = new Student("郑十", '女', 95.1);
        allStudents[8] = new Student("陈明", '男', 82.9);
        allStudents[9] = new Student("林芳", '女', 76.3);
        A cdi =new A2(allStudents);
        cdi.printAll();
        cdi.printAve();
        }
    }