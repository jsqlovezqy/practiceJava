package movie.dome;

public class test {
    public static void main(String[] args){
    Movie []movies=new Movie[6];
        movies[0]=new Movie(1,"星际穿越",9.6,"安妮海瑟薇");
        movies[1]=new Movie(2,"肖申克的救赎",9.7,"蒂姆·罗宾斯");
        movies[2]=new Movie(3,"霸王别姬",9.6,"张国荣");
        movies[3]=new Movie(4,"阿甘正传",9.5,"汤姆·汉克斯");
        movies[4]=new Movie(5,"泰坦尼克号",9.4,"莱昂纳多");
        movies[5]=new Movie(6,"盗梦空间",9.3,"莱昂纳多");
        operationMovie mo =new operationMovie(movies);
        mo.printall();
        mo.choiceMovie();
    }
}
