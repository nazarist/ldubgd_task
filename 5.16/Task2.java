import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть довжину першого катету:");
        int a = scanner.nextInt();

        System.out.println("Введіть довжину другого катету:");
        int b = scanner.nextInt();

        int c = (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Довжина гіпотенузи дорівнює:" + c);

        double p = (double) a + b + c;
        double s = (double) (a * b) / 2;

        System.out.println("Периметр трикутника: " + p);
        System.out.println("Площа трикутника: " + s);
    }
}
