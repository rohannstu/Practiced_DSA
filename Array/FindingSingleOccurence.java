class Solution {
    public int singleNonDuplicate(int[] nums) {
        int item = 0;
        int n = nums.length;
        int left = 0, right = n - 1;

        while (left <= right) {
            int l = 0, r = 0;
            int mid = (left + right) / 2;

            if (mid - 1 >= 0 && nums[mid - 1] == nums[mid]) {
                l = 1;
            }
            if (mid + 1 < n && nums[mid + 1] == nums[mid]) {
                r = 1;
            }
            if (l == 0 && r == 0) {
                item = nums[mid];
                break;
            }
            if (l == 1) {
                if ((mid - left) % 2 == 0) {
                    right = mid - 2;
                } else {
                    left = mid + 1;
                }
            } else if (r == 1) {
                if ((right - mid) % 2 == 0) {
                    left = mid + 2;
                } else {
                    right = mid - 1;
                }
            }
        }
        return item;
    }
}
