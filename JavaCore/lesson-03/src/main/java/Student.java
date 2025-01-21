public class Student {
    int id;
    String name;
    @Override
    public String toString() {
        return "Tôi là học sinh{}";


    }



    @Override
    public int hashCode() {
        return id + name.hashCode();
    }
}
