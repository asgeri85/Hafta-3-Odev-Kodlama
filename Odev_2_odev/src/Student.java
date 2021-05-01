public class Student extends User{
    private String adres;
    private String school;

    public Student(String name, int id, String password, String mail,String adres, String school) {
        super(name,id,password,mail);
        this.adres = adres;
        this.school = school;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
