//overloading is a compile time polymorphism. 

class calculator {
    int sum(int a, int b) {
        System.out.println(a+b);
        return a + b;
    }
    
    int sum(int a, int b, int c) {
        return a + b + c ;
    }
}

class multiplication {
    int mul(int a, int b) {
        System.out.println(a*b);
        return a * b;
    }
    
    int mul(int a, int b, int c) {
        return a * b * c;
    }
}
//overriding 

class animal{
    static  void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends animal {
   static void speak() {
        System.out.println("Dog barks");
    }
}

public class Polimorphism {

    public static void main(String[] args) {
    //overloading  
    calculator c = new calculator();
    c.sum(10, 20);
    System.out.println(c.sum(10, 20,30));  


   multiplication m = new multiplication();
   m.mul(10, 20);
   System.out.println(m.mul(10, 20, 10));
  //overriding
     animal a = new Dog();
     a.speak();
    }
}