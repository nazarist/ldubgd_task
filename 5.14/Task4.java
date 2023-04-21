import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner ilyasevich = new Scanner(System.in);

        System.out.print("Введіть перше ім'я: ");
        String firstName = ilyasevich.nextLine();

        System.out.print("Введіть друге ім'я: ");
        String secondName = ilyasevich.nextLine();

        if (firstName.equalsIgnoreCase(secondName)) {
            System.out.println("Імена однакові.");
        } else {
            System.out.println("Імена різні.");
        }
    }
}
