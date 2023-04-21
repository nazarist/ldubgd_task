import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner ilyasevich = new Scanner(System.in);

        int number1 = (int) (Math.random()*2+1);
        int number2 = (int) (Math.random()*2+1);
        int number3 = (int) (Math.random()*2+1);

        System.out.println("У вас є дві спроби, щоб відгати послідовність трьох чисел від 1 до 3:");

        System.out.print("Перша спроба. Введіть 3 числа:");
        int guess1 = ilyasevich.nextInt();
        int guess2 = ilyasevich.nextInt();
        int guess3 = ilyasevich.nextInt();

        if (guess1 == number1 && guess2 == number2 && guess3 == number3){
            System.out.println("Ви виграли!");
        } else {
            System.out.println("Ви програли, проте у вас є ще одна спроба");
        }
        System.out.print("Друга спроба. Введіть три числа:");
         guess1 = ilyasevich.nextInt();
         guess2 = ilyasevich.nextInt();
         guess3 = ilyasevich.nextInt();

         if (guess1 == number1 && guess2 == number2 && guess3 == number3){
             System.out.println("Ви виграли!");
         } else {
             System.out.println("Ви програли. Гру закінчено. Правильна послідовність чисел була " + number1 + " " + number2 + " " + number3 + ".");
         }
    }
}
