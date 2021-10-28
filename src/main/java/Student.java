import java.util.ArrayList;

public class Student {
    String name, DOB, userName;
    int age, ID;
    Course course;
    ArrayList<Module> modules;

    public Student(String name, int age, String DOB, int ID, String userName, ArrayList<Module> modules, Course course){
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.ID = ID;
        this.userName = userName;
        this.modules = modules;
        this.course = course;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getID() {
        return ID;
    }

    public Course getCourse() {
        return course;
    }

    public String getDOB() {
        return DOB;
    }

    public String getUserName() {
        return userName;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", DOB='" + DOB + '\'' +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", ID=" + ID +
                ", course=" + course +
                ", modules=" + modules +
                '}';
    }
}

