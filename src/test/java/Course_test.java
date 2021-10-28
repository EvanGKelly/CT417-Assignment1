import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class Course_test {

    Module m1 = new Module("Computer Science", 111);
    Module m2 = new Module("Computer Engineering", 112);
    Module m3 = new Module("Science", 113);

    Module m4 = new Module("History", 114);
    Module m5 = new Module("English", 115);
    Module m6 = new Module("Geography", 116);

    ArrayList<Module> mList = new ArrayList<>();
    ArrayList<Module> mList2 = new ArrayList<>();

    ArrayList<String> mod_List = new ArrayList<>();
    ArrayList<String> student_List = new ArrayList<>();

    ArrayList<Student> sList = new ArrayList<>();
    ArrayList<Student> sList2 = new ArrayList<>();

    Course c1 = new Course("CT101", mList, sList, "10/11/21", "10/07/22");

    Student s1 = new Student("Tom Hardy", 19, "10/12/00", 123, "t.hardy", mList, c1);
    Student s2 = new Student("Black Lively", 18, "10/12/00", 124, "b.lively", mList, c1);
    Student s3 = new Student("Shara Hardy", 19, "10/12/00", 125, "s.hardy", mList, c1);

    Student s4 = new Student("Jake Hardy", 19, "19/12/00", 126, "j.hardy", mList, c1);
    Student s5 = new Student("Chuck Lively", 18, "10/11/00", 127, "c.lively", mList, c1);
    Student s6 = new Student("Chris Hardy", 19, "10/12/01", 128, "c.hardy", mList, c1);

    @Before
    public void setUp() throws Exception {
        mList.add(m1);
        mList.add(m2);
        mList.add(m3);

        mList2.add(m4);
        mList2.add(m5);
        mList2.add(m6);

        sList.add(s1);
        sList.add(s2);
        sList.add(s3);

        sList2.add(s4);
        sList2.add(s5);
        sList2.add(s6);

        mod_List.add("Computer Science");
        mod_List.add("Computer Engineering");
        mod_List.add("Science");

        student_List.add("Tom Hardy");
        student_List.add("Black Lively");
        student_List.add("Shara Hardy");
    }

    @Test
    public void nameTest() {
        assertEquals(c1.getName(), "CT101");
        c1.setName("CT102");
        assertEquals(c1.getName(), "CT102");
    }

    @Test
    public void moduleTest() {
        assertEquals(c1.getModules(), mList);

        for(int i=0; i < mList.size(); i++){
            assertEquals(c1.getModules().get(i).getName(), mod_List.get(i));
        }

        c1.setModules(mList2);
        assertEquals(c1.getModules(), mList2);
    }

    @Test
    public void studentTest() {
        assertEquals(c1.getStudents(), sList);

        for(int i=0; i < sList.size(); i++){
            assertEquals(c1.getStudents().get(i).getName(), student_List.get(i));
        }

        c1.setStudents(sList2);
        assertEquals(c1.getStudents(), sList2);
    }

    String pattern = "dd/MM/yy";

    @Test
    public void startDateTest() {
        assertEquals(c1.getStartDate().toString(pattern), "10/11/21");
        c1.setStartDate("11/11/21");
        assertEquals(c1.getStartDate().toString(pattern), "11/11/21");
    }

    @Test
    public void endDateTest() {
        assertEquals(c1.getEndDate().toString(pattern), "10/07/22");
        c1.setEndDate("01/07/22");
        assertEquals(c1.getEndDate().toString(pattern), "01/07/22");
    }

}
