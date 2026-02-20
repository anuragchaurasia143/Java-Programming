//import java.util.*;

public class searching {
    // linear search
    static int linearSearch(int number[], int key) {
        
        
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
            }
 
        return -1;
    }
    // largest and smallest in an array
    public static int getlargest(int num[]){
        int largest = Integer.MIN_VALUE;  // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity
        for(int i=0; i<num.length; i++){
            if (largest< num[i]){
                largest = num[i];
            }
                if (smallest> num[i]){
                    smallest = num[i];
                }
        }
        System.out.println("smallest value is: " + smallest);
        return largest;
    }
    // binary search
    public static int binarysearch(int marks[], int need){
        int start = 0, end = marks.length-1;
        while (start<=end){
            int mid = (start + end)/2;
            if (marks[mid] == need){
                return mid;
            }
            if (marks[mid]<need){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }  
    // reverse an array
    public static void reverse(int number[]){
        int first = 0, last = number.length-1;
        while (first<last){
            // swap
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;

            first++;
            last--;
        }
    } 
    //pairs in an array
    public static void pairs(int number[]){
        int totalPairs = 0;
        for (int i=0; i<number.length; i++){
            for (int j=i+1; j<number.length; j++){
                System.out.print("(" + number[i]+"," + number[j]+ ")");
                totalPairs++;
            }
           
            System.out.println();
        }
        System.out.println("total pairs = "  + totalPairs);
    }
    // printing all subarrays
    public static void subarrays(int number[]){
        for (int i=0; i<number.length; i++){
            int start = i;
            for (int j=i; j<number.length; j++){
                int end = j;
                for (int k=start; k<=end; k++){
                    System.out.print(number[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 3;
        
        int index = linearSearch(number, key);
        if (index==-1){
            System.out.println("key not found");
            
        }else{
            System.out.println("key found at index: " + index);
        }
         int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
         System.out.println("largest value is: " + getlargest(number));
        int marks[] = {2,4,8,10,12,14,16,18,20};
         int need = 16;

         System.out.println("key found at index: " + binarysearch(number, key));
         

        reverse (number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
         pairs(number);
        subarrays(number);  
    }
   
}

