public class OOPs {
    public static void main(String[] args) {
        pen pen1 = new pen(); // creating object of pen class called pen1
        pen1.setcolor("blue");
        System.out.println(pen1.color);
        pen1.tip = 5;
        System.out.println(pen1.tip);

        Student s1 = new Student("John"); // creating object of student class called s1
        System.out.println(s1.name);

       
    }
}

class pen {
    String color;
    int tip;

    void setcolor(String newcolor) {
        color = newcolor;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calculatePercentage(int totalmarks, int marksobtained) {
        percentage = (marksobtained / totalmarks) * 100;
       
    }

    // constructor
     Student(String name) {
        this.name = name;
        
    }

}
