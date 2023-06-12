import java.util.Random;

public class problem1 {
    public static void main(String[] args) {
        StringBuilder password = new StringBuilder(8);

        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            char c = (char) (random.nextInt(33, 127));
            password.append(c);


        }

        System.out.println(password);

    }
}
