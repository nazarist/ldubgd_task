import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int a = (int) (Math.random()*41-20);
        System.out.println("Випадкове натуральне число на проміжку [-20;20]:" + a);

        Random random = new Random();
        int randomNum = random.nextInt(41)-20;
        System.out.println("Випадкове натуральне число на проміжку [-20;20]:" + randomNum);
    }
}