public class Main {
    public static void main(String[] args) {
        User user1=new User("ali",1,"1234","ali12@hotmail.com");
        Student student=new Student("fatma",2,"563","fatma@mail.ru","ankara","ankara Okul");
        Instructor instructor=new Instructor("engin",3,"1234","engin@mail.ru","50");

        UserManeger userManeger=new UserManeger();
        userManeger.add(user1);

        StudentManager studentManager=new StudentManager();
        studentManager.add(student);

        İnstructorManager i̇nstructorManager=new İnstructorManager();
        i̇nstructorManager.add(instructor);
    }
}
