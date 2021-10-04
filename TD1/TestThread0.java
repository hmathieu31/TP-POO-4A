package TD1;
public class TestThread0 {
    public static void main(String[] args) {
        MyThread t1, t2;

        t1 = new MyThread("First ..");
        t2 = new MyThread("Second ..");

        t1.start();
        t2.start();
    }
}
