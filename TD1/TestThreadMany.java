package TD1;
public class TestThreadMany {
    public static void main(String[] args) {
        for (int i = 0; i < Integer.parseInt(args[0]); i++) {
            new MyThread("Thread" + i).start();

        }
    }
}
