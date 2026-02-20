
//function for factorail.
public class function {
    public static int factorial(int n){
       int facto = 1;
       for(int i=1;i<=n;i++){
        facto = facto*i; 
        
       }
       return facto;
    }
  // function for product of two numbers.
    public static void product(int a, int b){
        int product = a*b;
        System.out.println("product is " + product);
        
    }
 // function for binomial coefficient.
     public static int bincoeff(int n, int r){
        int factn = factorial(n);
        int factr = factorial(r);
        int factnmr = factorial(n-r);

        int bincoff = factn/(factr*factnmr);
        return bincoff;
     }

     //function for is a numver prime or not.
        // public static boolean isprime(int n){
        //     boolean isprime = true;
        //     for(int i=2;i<=n-1;i++){
        //         if(n%i==0){
        //             isprime = false;
        //             break;
        //         }
        //     }
        //     return isprime;
        // }

        //optimized way to check if `n` is prime or not.
        public static boolean isprime(int n){
            if(n==2){
                return true;
            }
             if(n<=1 || n%2==0){
                return false;
            }
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }            return true;
            
        }

        public static void primesinRange(int n){
            for(int i=2;i<=n;i++){
                if(isprime(i)){
                    System.out.print(i + " ");
                }
            }
        }
        //function to convert binary to decimal.
        public static void binToDec(int n){
            int mynum = n;
            int pow = 0;
            int decnum = 0;
            while(n>0){
                int lastdigit = n%10;
                decnum = decnum + (lastdigit*(int)Math.pow(2, pow));
                pow++;
                n = n/10;
            }
            System.out.println("decimal of " + mynum + " is " + decnum);
        }   
         // function to convert decimal to binary.
         public static void decToBin(int n){
            int mynum = n;
            int pow = 0;
            int binnum = 0;
            while(n>0){
                int rem = n%2;
                binnum = binnum + (rem*(int)Math.pow(10, pow));

                pow++;
                n = n/2;
            }
            System.out.println("binary of " + mynum + " is " + binnum);
         }
         //function to calculate the average of three numbsers.
         public static void average (int a, int b, int c){
            int sum = a+b+c;
            int avg = sum/3;
            System.out.println("average is " + avg);
           
         }
         //function to check if a number is even or not.
            public static boolean isEven(int n){
                if (n%2==0){
                    return true;
                }
                return false;
            }   
            //function to check if a number is palindrome or not.
            public static boolean isPalindrome(int n){
                int mynum = n;
                int revnum = 0;
                while(n>0){
                    int lastdigit = n%10;
                    revnum = revnum*10 + lastdigit;
                    n = n/10;
                }
                if(mynum == revnum){
                    return true;
                }
                return false;
            }
            // function to find sum of the digits of a ineger.
            public static int sumOfDigits(int n){
                int sum = 0;
                while(n>0){
                    int lastdigit = n%10;
                    sum = sum + lastdigit;
                    n = n/10;
                }
                return sum;
              
            }
          
            
            
    public static void main(String[] args) {
       
        System.out.println( factorial(4));
        product(4, 5);
        System.out.println(bincoeff(5, 2));
        primesinRange(20);
        binToDec(1101); 
        decToBin(7);
        average(4, 5, 6);  
        System.out.println(isEven(8));  
        System.out.println(isPalindrome(321));
       System.out.println(sumOfDigits(1234));
    }
}
