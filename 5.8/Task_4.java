public class Main {
    public static void main(String[] args) {
        String l = "Так";
        switch (l) {
            case "Так":
            case "так":
            case "ОК":
            case "Yes":
            case "Ok":
            case "+":
                System.out.println("Я погоджуюсь");
                break;
            case "NO":
            case "Ні":
            case "ні":
            case "-":
            case "No":
                System.out.println("Я відмовляюсь");
                break;
        }
    }
}