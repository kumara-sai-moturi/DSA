import java.util.*;

class Solution {
    public ArrayList<Integer> findWays(int[][] grid) {
        int n = grid.length;
        int MOD = 1000000007;

        long[][] ways = new long[n][n];
        int[][] adventure = new int[n][n];

        // Initialize all adventure values to -1
        for (int i = 0; i < n; i++) {
            Arrays.fill(adventure[i], -1);
        }

        // Starting cell
        ways[0][0] = 1;
        adventure[0][0] = grid[0][0];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0 && j == 0) {
                    continue;
                }

                // From TOP
                if (i > 0 &&
                    (grid[i - 1][j] == 2 || grid[i - 1][j] == 3)) {

                    ways[i][j] = ways[i - 1][j];

                    if (ways[i - 1][j] > 0) {
                        adventure[i][j] = Math.max(
                            adventure[i][j],
                            adventure[i - 1][j] + grid[i][j]
                        );
                    }
                }

                // From LEFT
                if (j > 0 &&
                    (grid[i][j - 1] == 1 || grid[i][j - 1] == 3)) {

                    ways[i][j] =
                        (ways[i][j] + ways[i][j - 1]) % MOD;

                    if (ways[i][j - 1] > 0) {
                        adventure[i][j] = Math.max(
                            adventure[i][j],
                            adventure[i][j - 1] + grid[i][j]
                        );
                    }
                }
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        int totalPaths = (int) ways[n - 1][n - 1];

        // If destination cannot be reached
        if (totalPaths == 0) {
            ans.add(0);
            ans.add(0);
        } else {
            ans.add(totalPaths);
            ans.add(adventure[n - 1][n - 1]);
        }

        return ans;
    }
}