class Solution {
    public int pivotInteger(int n) {
        int totalsum = (n * (n + 1)) / 2;
        int left = 0;
        int right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((mid * (mid + 1)) / 2 == totalsum - ((mid - 1) * (mid)) / 2) {
                return mid;
            } else if ((mid * (mid + 1)) / 2 < totalsum - ((mid - 1) * (mid)) / 2) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}