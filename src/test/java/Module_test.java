import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Module_test {

    Module m1 = new Module("Computer Science", 111);

    @Test
    public void nameTest() {
        assertEquals(m1.getName(), "Computer Science");
        m1.setName("Computer Programming");
        assertEquals(m1.getName(), "Computer Programming");
    }

    @Test
    public void idTest() {
        assertEquals(m1.getID(), 111);
        m1.setID(112);
        assertEquals(m1.getID(), 112);
    }
}
