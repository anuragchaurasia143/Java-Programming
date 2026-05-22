public class max_subarray_sum {
    public static void findMaxSubarraySum(int number[]){
       int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i=0; i<number.length; i++){
           int  start = i;
            for (int j=i; j<number.length; j++){
               int  end = j;
                currentSum = 0;
                for (int k=i; k<=j; k++){
                    currentSum += number[k];
                }
                System.out.println(currentSum);
                if (maxSum<currentSum){
                    maxSum = currentSum;
                }
            }
            
        }
        System.out.println("max sum is: " + maxSum);
    }

    public static void main(String[] args) {
        int number[] = {1,-2,6,-1,3};
        findMaxSubarraySum(number); 
    }
}
