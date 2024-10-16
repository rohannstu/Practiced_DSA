class Solution {
    public boolean check(int[] nums) {
        int T1 = 0, T2 = 0;
        int indx = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                indx = i + 1;
                T1 = 1;
                break;
            }
        }
        for (int k = indx; k < nums.length - 1; k++) {
            if (nums[k] > nums[k + 1]) {
                T2 = 1;
                break;
            }
        }
        if ((T1 == 1 && T2 == 1)) {
            return false;
        }
        if (T1 == 0 && T2 == 0) {
            return true;
        } else {
            if (nums[0] >= nums[nums.length - 1]) {
                return true;
            } else {
                return false;
            }
        }

    }
}

// 3 4 5 1 2 --> 3 , 1

// 2 3 1 4 --> [2, 3], [1, 4] -- > [1, 4, 5, ]