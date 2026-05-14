package 接口案例;

public class A2 implements A {
    private Student[] students;
    public A2(Student[] students) {
        this.students = students;
    }
    @Override
    public void printAll() {
    int count=0;
        for (int i = 0; i < students.length; i++) {
            Student s=students[i];
            System.out.println(s.getName()+" "+s.getSex()+" "+s.getScore());
            if(s.getSex()=='男'){
                count++;
            }
        }
        System.out.println("男："+count);
        System.out.println("女："+(students.length-count));
    }

    @Override
    public void printAve() {
        Student s1=students[0];
        double sum=s1.getScore();
        double min=s1.getScore();
        double max =s1.getScore();
        for (int i = 0; i < students.length; i++) {
            Student s=students[i];
            sum += s.getScore();
            if(s.getScore()>max){
                max=s.getScore();
            }
            if(s.getScore()<min){
                min=s.getScore();
            }
        }
        System.out.println("平均分："+ (sum-max-min) / (students.length-2));
    }
}
