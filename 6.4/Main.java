public class Main {
    public static void main(String[] args) {
        Group group = new Group("КН12с", "Faculty");

        Student student = new Student("Nazar", "Ilasevish", group, 1);

        student.getStudent();
        
        student.addOneTalon();
        
        Help.out(student.getTalon());   
    }
}