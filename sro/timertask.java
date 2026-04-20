public class CountdownTimer implements Runnable {
    private int time;

    public CountdownTimer(int time) {
        this.time = time;
    }

    @Override
    public void run() {
        try {
            while (time > 0) {
                System.out.println("Remaining: " + time);
                Thread.sleep(1000);
                time--;
            }
            System.out.println("Finished!");
        } catch (InterruptedException e) {
            System.out.println("Timer interrupted");
        }
    }
}