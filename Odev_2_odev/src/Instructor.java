public class Instructor extends User{
    private String students;

    public Instructor(String name, int id, String password, String mail, String students) {
        super(name, id, password, mail);
        this.students = students;
    }

    public String getStudents() {
        return students;
    }

    public void setStudents(String students) {
        this.students = students;
    }
}
