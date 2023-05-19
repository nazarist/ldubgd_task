public class Student {

    private String fName;
    private String lName;
    private Group group;
    private  int course;
    private int talon = 0;


    public Student(String fName, String lName, Group group, int course) {
        this.fName = fName;
        this.lName = lName;
        this.group = group;
        this.course = course;
    }


    public void getStudent()    {
        Help.out(
                "This is Student: ",
                "First Name: " + this.fName,
                "Last Name: " + this.lName,
                "Group: " + this.group.getName(),
                "course: " + this.course,
                "Faculty: " + this.group.getFaculty()
        );
    }


    public void addOneTalon() {
        this.talon++;
    }
    

    public int getTalon()
    {
        return this.talon;
    }
}