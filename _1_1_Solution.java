import java.util.Arrays;

public class _1_1_Solution {

    // start 
    class Solution {
    int print2largest(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=max){
                return arr[i];
            }
        }
        return -1;
    }
    // end 
}
}
