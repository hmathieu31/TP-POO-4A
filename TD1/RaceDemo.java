package TD1;
public class RaceDemo {
    private final static int NUMRUNNERS = 1;

    public static void main(String[] args) {
        SelfishRunner[] runners = new SelfishRunner[NUMRUNNERS];
        PoliteRunner runner = new PoliteRunner(4);
        for (int i = 0; i < NUMRUNNERS; i++) {
            runners[i] = new SelfishRunner(i);
            runners[i].setPriority(2);
        }
        for (int i = 0; i < NUMRUNNERS; i++) {
            runner.start();
            runners[i].start();

        }
    }
}
