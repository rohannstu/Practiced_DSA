class Solution {
    int max_len(int[] arr, int n, int k) {
        // n is array size
        int left = 0, right = 0;
        long long sum = arr[0];
        long long max_len = 0;
        while (right < n) {
            while (sum > k && left < right) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                max_len = Math.max(max_len, right - left + 1);
            }
            right++;
            if (right < n) {
                sum += arr[right];
            }
        }
        return max_len;
    }
}
