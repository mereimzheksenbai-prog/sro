public class IntervalPrinter implements Runnable {
    private int interval;
    private int repeat;

    public IntervalPrinter(int interval, int repeat) {
        this.interval = interval;
        this.repeat = repeat;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= repeat; i++) {
                System.out.println("Message " + i);
                Thread.sleep(interval * 1000L);
            }
        } catch (InterruptedException e) {
            System.out.println("Timer interrupted");
        }
    }
}