package 接口案例;

public class A1 implements A {
    private Student[] students;
    public A1(Student[] students){
        this.students=students;
    }
    @Override
    public void printAll() {
        System.out.println("成绩");
        for (int i = 0; i < students.length; i++) {
            Student s=students[i];
            System.out.println(s.getName()+" "+s.getSex()+" "+s.getScore());
        }

    }

    @Override
    public void printAve() {
    double sum=0;
        for (int i = 0; i < students.length; i++) {
            Student s=students[i];
            sum+= s.getScore();
        }
        System.out.println("平均分："+sum/ students.length);
    }
}
