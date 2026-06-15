import java.util.*;

public class strings {

    public static boolean isPalindrome(String str){
        for (int i = 0; i< str.length()/2 ; i++){
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // algo to calculate shortest path

    public static float getshortestPath(String path){
        int x = 0;
        int y = 0;
        for (int i = 0; i<path.length(); i++){
            char dir = path.charAt(i);
            if (dir == 'N') {
                y++;
            } else if (dir == 'S') {
                y--;
            } else if (dir == 'E') {
                x++;
            } else if (dir == 'W') {
                x--;
            }
            
        }
        int x2 = x*x;
            int y2 = y*y;
            return (float) Math.sqrt(x2 + y2);
    }

    // to print a substring from a string
    public static String printSubstring(String str, int si, int ei){
        String substring = "";
        for (int i = si; i < ei; i++){
            substring += str.charAt(i);
        }
        return substring;
    }

     // to print uppercase to each word first letter 
       public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++){
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        char arr[] = {'a', 'b', 'c', 'd'};
       // String str = "abcd";
        String str2 = new String();

        // Strings are immutable in Java. Once created, their values cannot be changed.

        Scanner sc = new Scanner(System.in);
        String name;
        // sc.next() only reads the next token (word) from the input, while sc.nextLine() reads the entire line of input.
        name = sc.nextLine();
        System.out.println(name);
        

        // to find length of string
        String name1 = "Anurag Chaurasia";
        System.out.println(name1.length());

        //concatination

        String firstname = "Anurag";
        String lastname = "Chaurasia";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);

        //char at index
        String name2 = "Anurag Chaurasia";
        System.out.println("char at index 0: " + name2.charAt(3));
        

        String str = "racecar";
        System.out.println(isPalindrome(str));

        // get shortestpath:

        String path = "WNEENESENNN";
        System.out.println(getshortestPath(path));


        String str3 = "helloworld";
        System.out.println(printSubstring(str3, 3, 7)); 

        //print largest string in an array of strings

       String fruits[] = {"apple", "mango", "banana", "grapes"};
       String largest = fruits[0];
       for (int i = 1; i < fruits.length; i++){
         if (largest.compareTo(fruits[i]) < 0) {
            largest = fruits[i];
        }
    }
    System.out.println("largest string: " + largest);

    //string builder class in java
    StringBuilder sb = new StringBuilder("");
    for (char ch = 'a'; ch <= 'z'; ch++){
        sb.append(ch);
    }
    System.out.println(sb);
        
    String name3  = "hi , i am anurag";
   System.out.println(toUpperCase(name3));
    } 
}
