package TD1;
public class SelfishRunner extends Thread {
    private int tick = 1;
    private int num;

    public SelfishRunner(int num) {
        this.num = num;
    }

    synchronized public void run() {
        while (tick < 400000) {
            tick++;
            if ((tick % 50000) == 0)
                System.out.println("Thread #" + num + ", tick = " + tick);
        }
        notify();
    }
}
