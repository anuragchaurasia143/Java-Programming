public class sum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int target = 8;

        // for (int i=0; i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]+arr[j]==target){
        //             System.out.println( arr[i] + " and " + arr[j]);
        //         }
        //     }
        // }


        

        }

        // optimized solution
        public static void optimized(int arr[], int target){
            int f = 0;
            int l = arr.length-1;

            while(f<l){
                if(arr[f]+arr[l]==target){
                    System.out.println(arr[f] + " and " + arr[l]);
                    f++;
                    l--;
                }
                else if(arr[f]+arr[l]<target){
                    f++;
                }
                else{
                    l--;
                }
            }
        }
    }

