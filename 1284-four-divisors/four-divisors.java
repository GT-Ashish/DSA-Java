class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for (int a : nums) {
            if (a > 5) {
                int end = (int) Math.sqrt(a);
                int count = 0;
                int divisor = 0;
                for (int i = 2; i <= end; i++) {
                    if (a % i == 0) {
                        count++;
                        divisor = i;
                    }
                    if (count > 1) {
                        break;
                    }
                }
                if (count == 1 && divisor * divisor != a) {
                    sum = sum + 1 + a + divisor + a / divisor;
                }

            }
        }
        return sum;

    }
}