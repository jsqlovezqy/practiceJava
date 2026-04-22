package movie.dome;

import java.util.Scanner;

public class operationMovie {
    private Movie[] movies;
    public operationMovie (Movie[] movies){
        this.movies=movies;
    }
    public void printall() {
        for (int i = 0; i <movies.length; i++) {
            Movie m=movies[i];
            System.out.println(m.getId()+"\t"+m.getName()+"\t"+m.getPrice()+"\t"+m.getActor());
        }
        System.out.println("----------------------------");
    }

    public void choiceMovie() {
        System.out.println("请输入电影id");
        Scanner sc=new Scanner(System.in);
        int id = sc.nextInt();
        for (int i = 0; i < movies.length; i++) {
            Movie m=movies[i];
            if(m.getId()==id){
                System.out.println(m.getId()+"\t"+m.getName()+"\t"+m.getPrice()+"\t"+m.getActor());
                return;
            }
        }
    }
}
