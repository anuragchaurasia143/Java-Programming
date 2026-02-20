
// class Main{
//     public static void main(String[] args) {
//         int num1 = 0;
//         int num2 = 4;
//         int num3 ;
//         try{
//             num3 = num2/num1;
//         }catch(ArithmeticException e){
//             System.out.println("Can not divide with 0.");
//         }finally{
//             System.out.println("finally block");
//         }
//     }
// }
import java.util.*;

public class Main{
    public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
        
    //     int n = sc.nextInt();
        
    //     int sum = 0;
    //     int i = 1;

    //     while(i<=n){
    //      sum = sum+i;
    //      i++;
    //     }

    //   System.out.println("the sum is:" + sum);        
    // }
   
    // int n = 6758493;

    // while(n>0){
    //   int lastdigit = n%10;
    //   System.out.print(lastdigit);
    //   n = n/10;
    // }
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    if(n==2){
      System.out.println("n is prime number");

    }else{
     boolean isPrime = true;

    for(int i=2; i<=n-1 ; i++){
      if(n%i==0){
        isPrime = false;
      }
      
    }if(isPrime==true){
      System.out.println("n is prime number");

    }else{
      System.out.println("n is not a prime number");
    }
    sc.close();
    } 
  }
}