import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        int max_len = 1, cnt = 1;

        for(int i = 0; i < list.size() - 1; i++){
            if((list.get(i + 1) - list.get(i)) == 1){
                cnt++;
            } else {
                max_len = Math.max(max_len, cnt);
                cnt = 1;
            }
        }
        max_len = Math.max(max_len, cnt);
        return max_len;
    }
}
