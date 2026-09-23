

class employee{
    String name;
    int id;
    //Default constructor
    employee(){
       
        System.out.println("Default constructor");
    }
    //Parameterized constructor
    employee(String name, int id){
        this.name = name;
        this.id = id;
    }
    //Parameterized constructor
    employee(String name){
        this.name = name;
        //this.id = emp.id;
    }
    //copy constructor
    


    void display(){
        System.out.println(name + " " + id);
       
    }
}
public class OOPs2 {
    public static void main(String[] args) {
        employee emp1 = new employee("John", 101 );
        //emp1.name = "John";
        // emp1.id = 101;
         emp1.display();
         
      // employee emp1 = new employee();
       //emp1.display();
       
    }
    
}