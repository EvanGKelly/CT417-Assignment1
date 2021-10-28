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

        Student s1 = new Student("Tom", 19, "10/12/00", 123, "t.hardy", mList, null);

        for(int i=0; i < mList.size(); i++){
            System.out.println(s1.getModules().get(i).getName());
        }


    }
}
