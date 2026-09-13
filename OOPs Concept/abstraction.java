
// Abstract class
abstract class Animal {

   abstract void animalSound();
 
   void sleep() {
    System.out.println("Zzz");
  }
}


class Pig extends Animal {
   void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}


public class abstraction {
    public static void main(String[] args) {
    Pig myPig = new Pig(); 
    myPig.animalSound();
    myPig.sleep();
    }
}
