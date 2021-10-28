public class Module {

    String name;
    int ID;

    public  Module(String name,int ID){
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return " \n Module: " +
                " name= '" + name + '\'' +
                ", ID=" + ID;
    }
}
