import java.util.*;

public class Array {
    public static void main(String[] args) {
    //    int marks[]= new int[50];
    //    int numbers[] = {1,3,2,4,};
    //   String fruits[] = {"apple","mango","banana"};  


    //creation of an array  
    int marks[]= new int[50];

    //taking input from user and storing in array   
    Scanner sc = new Scanner(System.in);

    marks[0] = sc.nextInt();    
    marks[1] = sc.nextInt();
    marks[2] = sc.nextInt();   
    sc.close();
    
    System.out.println("phy:" + marks[0]);
    System.out.println("chem:" + marks[1]); 
    System.out.println("maths:" + marks[2]);    
    //updating the value of an array element
    marks[2] = 100; 
    System.out.println("maths:" + marks[2]);

    //finding the length of an array    
    System.out.println( "the length of array = " + marks.length);

    //calculating the percentage of marks
    int percentage = (marks[0]+marks[1]+marks[2])/3;
    System.out.println("percentage = " + percentage + "%");
}
}
