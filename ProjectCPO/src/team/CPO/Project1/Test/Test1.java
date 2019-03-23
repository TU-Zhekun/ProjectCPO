package team.CPO.Project1.Test;

public class Test1 {
    public static void main(String[] args) {
        Thread t1 = new ThreadTest1();
        t1.start();
        Thread t2 = new ThreadTest2();
        t2.start();
    }
}
