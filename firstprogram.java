

/*import java.util.*;
public class firstprogram{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        // Question 1
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();
        int avg = (A+B+C)/3;
        System.out.println(avg);

        //Question 2
        int side = sc.nextInt();
        int area = side*side;
        System.out.println(area);

        //Question 3

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = (pencil+pen+eraser);
        System.out.println(total);

        //Question 4
       
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;
        double result = (f*b)+ (i%c) - (d*s);
        System.out.println(result);


        //Question 5

        int $ = 24;
        System.out.println($);
        
    }
}*/
import java.util.*;
public class firstprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int choice  = sc.nextInt();
        switch("choice "){
            case "+": System.out.println(a+b);
            break;
            case "-": System.out.println("subtraction  is:" + (a-b));
            break;
            case "*": System.out.println("multiplication is:" + (a*b));
            break;
            case "/": System.out.println("division is:" + (a/b));
            break;
            case "%": System.out.println("modulo is:" + (a%b));
            break;
            default:System.out.println("wrong choice");
           

        }
        sc.close();
    }
}

