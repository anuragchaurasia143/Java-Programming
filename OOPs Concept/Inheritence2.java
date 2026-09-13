class college {
    String name;
    int id;
    String branch;
    
    college(String name, int id, String branch) {
        this.name = name;
        this.id = id;
        this.branch = branch;
    }
    
    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Branch: " + branch);
    }
}

class student extends college {
    int rollno;
    
    student(String name, int id, String branch, int rollno) {
        super(name, id, branch);
        this.rollno = rollno;
    }
    
    void display() {
        super.display();
        System.out.println("Roll No: " + rollno);
    }
}


class CSE3C extends student {
    String subject;
    
    CSE3C(String name, int id, String branch, int rollno, String subject) {
        super(name, id, branch, rollno);
        this.subject = subject;
    }
    
    void display() {
        super.display();
        System.out.println("Subject: " + subject);
    }
}

public class Inheritence2 {
    public static void main(String[] args) {
        CSE3C cseStudent = new CSE3C("Alice", 123, "CSE", 456, "Data Structures");
        cseStudent.display();
}
}