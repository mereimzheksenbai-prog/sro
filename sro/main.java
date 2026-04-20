public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new CountdownTimer(5));
        Thread t2 = new Thread(new Stopwatch(5));
        Thread t3 = new Thread(new AlarmTimer(3));

        t1.start();
        t2.start();
        t3.start();
    }
}