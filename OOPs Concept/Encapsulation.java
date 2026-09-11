
class Student {

    //private variables
    private String name;
    private int age;

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setAge(int age) {
        this.age = age;
    }

    // Getter
    public int getAge() {
        return age;
    }
}



public class Encapsulation {
     public static void main(String[] args) {

        Student s = new Student();

        s.setName("Anurag");
        s.setAge(20);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
}}