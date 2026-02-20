//import java.util.*;

public class searching {
    // static int linearSearch(int number[], int key) {
        
        
    //     for (int i = 0; i < number.length; i++) {
    //         if (number[i] == key) {
    //             return i;
    //         }
    //         }
 
    //     return -1;
    //}
    // public static int getlargest(int number[]){
    //     int largest = Integer.MIN_VALUE;  // -infinity
    //     int smallest = Integer.MAX_VALUE; // +infinity
    //     for(int i=0; i<number.length; i++){
    //         if (largest< number[i]){
    //             largest = number[i];
    //         }
    //             if (smallest> number[i]){
    //                 smallest = number[i];
    //             }
    //     }
    //     System.out.println("smallest value is: " + smallest);
    //     return largest;
    // }
    public static int binarysearch(int number[], int key){
        int start = 0, end = number.length-1;
        while (start<=end){
            int mid = (start + end)/2;
            if (number[mid] == key){
                return mid;
            }
            if (number[mid]<key){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }   
    public static void main(String[] args) {
        // int number[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // int key = 3;
        
        // int index = linearSearch(number, key);
        // if (index==-1){
        //     System.out.println("key not found");
            
        // }else{
        //     System.out.println("key found at index: " + index);
        // }
        //  int number[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        //  System.out.println("largest value is: " + getlargest(number));
        int number[] = {2,4,8,10,12,14,16,18,20};
         int key = 16;

         System.out.println("key found at index: " + binarysearch(number, key));
    }
}

