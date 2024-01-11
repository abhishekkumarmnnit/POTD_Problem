public class _1_2_Solution {
    class Solution {
        public int missingNumber(int[] nums) {
            //sum of n natural number - total sum of given arr 
            int n =nums.length; 
            int result = (n*(n+1))/2;
            int sum =0;
            for(int i=0;i<n; i++){
               sum+=nums[i];
            }
            return result - sum;
              
        }
    }
    
}
