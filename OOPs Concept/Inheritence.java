class animal{
    animal(){
        System.out.println("I am an animal");
    }

void breath(){
    System.out.println("I can breathe");
  }
}


class dog extends animal{
    dog(){
        System.out.println("I am a dog");
    }
    void bark(){
        System.out.println("I can bark");
    }
}


public class Inheritence {
    public static void main(String[] args) {
        dog d = new dog();
        d.breath();
        d.bark();
    }
}
