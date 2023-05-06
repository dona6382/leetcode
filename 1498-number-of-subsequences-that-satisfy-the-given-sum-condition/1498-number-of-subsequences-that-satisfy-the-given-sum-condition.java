class Solution {
    private static final int MOD = 1000000007;

    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] pow2 = new int[n];
        pow2[0] = 1;
        for (int i = 1; i < n; i++) {
            pow2[i] = (pow2[i - 1] * 2) % MOD;
        }
        int i = 0, j = n - 1, count = 0;
        while (i <= j) {
            if (nums[i] + nums[j] <= target) {
                count = (count + pow2[j - i]) % MOD;
                i++;
            } else {
                j--;
            }
        }
        return count;
    }
}
