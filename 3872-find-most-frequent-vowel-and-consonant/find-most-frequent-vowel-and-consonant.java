class Solution {
    public int maxFreqSum(String s) {
        int max1 = 0;
        int max2 = 0;
        int length = s.length();
        int[] array = new int[26];
        for (int i = 0; i < length; i++) {
            array[s.charAt(i) - 'a'] += 1;
        }
        for (int i = 0; i < 26; i++) {
            if (i == 0 || i == 4 || i == 8 || i == 14 || i == 20) {
                max1 = Math.max(max1, array[i]);
            } else {
                max2 = Math.max(max2, array[i]);
            }
        }
        return max1 + max2;
    }
}