import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Student_test {

    Module m1 = new Module("Computer Science", 111);
    Module m2 = new Module("Computer Engineering", 112);
    Module m3 = new Module("Science", 113);

    Module m4 = new Module("History", 114);
    Module m5 = new Module("English", 115);
    Module m6 = new Module("Geography", 116);

    ArrayList<Module> mList = new ArrayList<>();
    ArrayList<String> mod_List = new ArrayList<>();
    ArrayList<Module> mList2 = new ArrayList<>();

    ArrayList<Student> sList = new ArrayList<>();


    Course c1 = new Course("CT101", mList, sList, DateTime.parse("10/11/21"), DateTime.parse("10/07/22"));

    Student s1 = new Student("Tom Hardy", 19, "10/12/00", 123, "t.hardy", mList, c1);
    Student s2 = new Student("Black Lively ", 18, "10/12/00", 124, "b.lively", mList, c1);
    Student s3 = new Student("Shara Hardy", 19, "10/12/00", 125, "s.hardy", mList, c1);


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

        mod_List.add("Computer Science");
        mod_List.add("Computer Engineering");
        mod_List.add("Science");
    }

    @Test
    public void testStudentName(){

        assertEquals(s1.getName(), "Tom Hardy");

        s1.setName("Blake Lively");

        assertEquals(s1.getName(), "Blake Lively");
    }

    @Test
    public void testStudentAge(){
        assertEquals(s1.getAge(), 19);

        s1.setAge(21);

        assertEquals(s1.getAge(), 21);
        assertNotEquals(s1.getAge(), 22);
    }

    @Test
    public void testStudentDOB(){
        assertEquals(s1.getDOB(), "10/12/00");

        s1.setDOB("09/04/01");

        assertEquals(s1.getDOB(), "09/04/01");
    }

    @Test
    public void testStudentID(){
        assertEquals(s1.getID(), 123);

        s1.setID(234);

        assertEquals(s1.getID(), 234);
    }

    @Test
    public void testStudentUserName(){
        assertEquals(s1.getUserName(), "t.hardy");

        s1.setUserName("b.lively");

        assertEquals(s1.getUserName(), "b.lively");
    }

    @Test
    public void testStudentModules(){
        assertEquals(s1.getModules(), mList);

        for(int i=0; i < mList.size(); i++){
            assertEquals(s1.getModules().get(i).getName(), mod_List.get(i));
        }

        s1.setModules(mList2);
        assertEquals(s1.getModules(), mList2);
    }

    @Test
    public void testStudentCourse(){
        assertEquals(s1.getCourse(), c1);

    }




}
