class Solution {
    public boolean isPossible(int[] arr, int s, int x) {
        boolean[] dp = new boolean[x + 1];
        dp[0] = true;

        long sum = s;

        if (s <= x) {
            dp[s] = true;
        }

        for (int i = 0; i < arr.length; i++) {
            long next = sum + arr[i];

            if (next > x) {
                break;
            }

            int num = (int) next;

            for (int j = x; j >= num; j--) {
                dp[j] = dp[j] || dp[j - num];
            }

            sum += next;
        }

        return dp[x];
    }
}