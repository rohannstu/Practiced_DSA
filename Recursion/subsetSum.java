class Solution {
    void func(int indx, int sum, ArrayList<Integer> arr, int N, ArrayList<Integer> sumSubset){
        if(indx == N){
            sumSubset.add(sum);
            return;
        }
        func(indx + 1, sum, arr, N, sumSubset);
        func(indx + 1, sum + arr.get(indx), arr, N, sumSubset);
    }
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        // code here
        ArrayList<Integer> sums = new ArrayList<>();
        func(0, 0, arr, n, sums);
        return sums;
    }
}