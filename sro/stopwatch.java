public class Stopwatch implements Runnable {
    private int limit;

    public Stopwatch(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        int count = 0;

        try {
            while (count <= limit) {
                System.out.println("Elapsed: " + count);
                Thread.sleep(1000);
                count++;
            }
        } catch (InterruptedException e) {
            System.out.println("Timer interrupted");
        }
    }
}