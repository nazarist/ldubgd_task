
public class Group {
    private String name;
    private String faculty;

    Group(String name, String faculty){
        this.faculty = faculty;
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public String getFaculty()
    {
        return this.faculty;
    }

}
