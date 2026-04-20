import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int number = random.nextInt(10); // 0–9 аралығы
        System.out.println("Random number: " + number);
    }
}