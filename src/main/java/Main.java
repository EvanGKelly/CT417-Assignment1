import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Module m1 = new Module("Computer Science", 111);
        Module m2 = new Module("Computer Engineering", 112);
        Module m3 = new Module("Science", 113);

        ArrayList<Module> mList = new ArrayList<Module>();

        mList.add(m1);
        mList.add(m2);
        mList.add(m3);

        System.out.println(mList.get(2).getName());

        DateTimeFormatter dtf = DateTimeFormat.forPattern("dd/MM/yyyy");
        DateTime jodatime = dtf.parseDateTime("12/09/2021");
        DateTimeFormatter dtfOut = DateTimeFormat.forPattern("dd/MM/yyyy");

        System.out.println(jodatime.toString("dd/MM/yyyy"));


        Course c1 = new Course("CT101", mList, null, "10/11/21", "10/07/22");

        System.out.println(c1.getStartDate().toString("dd/MM/yyyy"));
        //Student s1 = new Student("Tom", 19, "10/12/00", 123, "t.hardy", mList, null);


    }
}
