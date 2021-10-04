package TD1;
/**
 * MyThread
 */
public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Hello there" + getName());
    }
}
