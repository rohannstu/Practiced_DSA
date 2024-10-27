class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0, N = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] != n){
                sum += nums[i];
            }
            else{
                N = 1;
            }
        }

        int indx_sum;
        int ans = 0;
        indx_sum = (((n - 1) * (n)) / 2);
        if((indx_sum - sum) != 0){
            ans = indx_sum - sum;
        }
        else{
            if(N == 1){
                ans = 0;
            }
            else{
                ans = n;
            }
        }
        return ans;
    }
}