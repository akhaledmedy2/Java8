package thread;

import java.util.Set;

public class ThreadMain {

    public static void main(String[] args) {
//        ThreadExample t1 = new ThreadExample();
//        t1.setName("t1");
//        t1.start();
//
//        ThreadExample t2 = new ThreadExample();
//        t2.setName("t2");
//        t2.start();

        Thread t1 = new Thread(new RunnableExample());
        t1.start();

        Thread t2 = new Thread(() -> {
            int i = 1;
            while (i <= 100) {
                System.out.println(i + " " + Thread.currentThread().getName());
                i++;
            }
        });
        t2.start();
    }

}
