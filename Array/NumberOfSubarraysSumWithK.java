class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        int sum = 0;
        int n = nums.length;
        int cnt = 0;
        mp.put(0,1);
        for(int i = 0; i < n; i++){
            sum += nums[i];
            int rem = sum - k;
            if(mp.containsKey(rem)){
                int temp = mp.get(rem);
                cnt += temp;
            }
            mp.put(sum, mp.getOrDefault(sum, 0) + 1);
        }
        return cnt;
    }
}