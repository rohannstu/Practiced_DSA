class GfG {
    int maxLen(int arr[],  int n, int k) {
        // HashMap to store the sum and its index
        Map<Integer, Integer> mp = new HashMap<>();
        int sum = 0;
        int max_len = 0;

        for (int i = 0; i < n; i++) {
            // Add the current element to sum
            sum += arr[i];

            // If the sum is equal to k, update max_len
            if (sum == k) {
                max_len = i + 1;
            }

            // Check if sum - k exists in the map
            int rem = sum - k;
            if (mp.containsKey(rem)) {
                int len = i - mp.get(rem);
                max_len = Math.max(max_len, len);
            }

            // If sum is not already in the map, add it
            if (!mp.containsKey(sum)) {
                mp.put(sum, i);
            }
        }
        return max_len;
    }
}