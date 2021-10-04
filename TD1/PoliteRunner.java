package TD1;
public class PoliteRunner extends Thread {
    private int tick = 1;
    private int num;

    public PoliteRunner(int num) {
        this.num = num;
    }

    synchronized public void run() {
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (tick < 400000) { 
            tick++;
            if ((tick % 50000) == 0)
                System.out.println("Thread #" + num + ", tick = " + tick);
                
        }
    }
}