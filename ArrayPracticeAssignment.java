public class ArrayPracticeAssignment {
    // Given an array of integers, return true if any value appears at least twice in the array, and return false if every element is distinct.
    public static boolean containsDuplicate(int nums[]) {
    for(int i=0; i<nums.length-1 ; i++) 
        { for(int j=i+1; j<nums.length ; j++ ) 
            { if( nums[i] == nums[j] ) { 
                return true ; 

                } 
             }
            } 
             return false;
        }

        
        public static void main (String[] arg){
            int nums[] = {1,2,3,4,5,6,7,8,9,10};
            System.out.println(containsDuplicate(nums));
    }
}
