package TD1;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Toolkit;

/**
 * Schedule a task that executes once every second.
 */
public class AnnoyingBeep {
    Toolkit toolkit;
    Timer timer;
    long t;


    public AnnoyingBeep() {
        TimerTask task;
        toolkit = Toolkit.getDefaultToolkit();
        timer = new Timer();
        timer.scheduleAtFixedRate(task = new RemindTask(), 5000, // initial delay
                1 * 1000); // subsequent rate
        t = task.scheduledExecutionTime();
    }

    class RemindTask extends TimerTask {
        int numWarningBeeps = 3;

        public void run() {
            if (System.currentTimeMillis() < t + 5) {
                if (numWarningBeeps > 0) {
                    toolkit.beep();
                    System.out.println("Beep!");
                    numWarningBeeps--;
                } else {
                    toolkit.beep();
                    System.out.println("Time's up!");
                    // timer.cancel(); //Not necessary because we call System.exit
                    System.exit(0); // Stops the AWT thread (and everything else)
                } 
            } else {
                System.out.println("Too late");
                System.exit(1);
            }
        }
    }

    public static void main(String args[]) {
        System.out.println("About to schedule task.");
        new AnnoyingBeep();
        System.out.println("Task scheduled.");
    }
}