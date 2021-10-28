import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.ArrayList;

public class Course {

    String name;
    ArrayList<Module> modules;
    ArrayList<Student> students;
    DateTime startDate, endDate;

    DateTimeFormatter dtf = DateTimeFormat.forPattern("dd/MM/yy");

    public Course(String name, ArrayList<Module> modules, ArrayList<Student> students, String startDate, String endDate) {
        this.name = name;
        this.modules = modules;
        this.students = students;
        this.startDate = dtf.parseDateTime(startDate);
        this.endDate = dtf.parseDateTime(endDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = dtf.parseDateTime(startDate);
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = dtf.parseDateTime(endDate);
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", modules=" + modules +
                ", students=" + students +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", dtf=" + dtf +
                '}';
    }
}
