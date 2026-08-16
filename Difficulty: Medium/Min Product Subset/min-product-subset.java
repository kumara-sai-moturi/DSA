class Solution {
    public int minProd(int[] arr) {
        int negCount = 0;
        int zeroCount = 0;
        int smallestPositive = Integer.MAX_VALUE;
        int largestNegative = Integer.MIN_VALUE;
        int product = 1;

        for (int x : arr) {
            if (x < 0) {
                negCount++;
                largestNegative = Math.max(largestNegative, x);
                product *= x;
            } else if (x == 0) {
                zeroCount++;
            } else {
                smallestPositive = Math.min(smallestPositive, x);
                product *= x;
            }
        }

        if (negCount == 0) {
            if (zeroCount > 0)
                return 0;
            return smallestPositive;
        }

        if (negCount % 2 == 0) {
            product /= largestNegative;
        }

        return product;
    }
}