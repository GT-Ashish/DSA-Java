class Solution {
    public int smallestIndex(int[] nums) {
        int length = nums.length;
        for(int i = 0; i < length; i++){
            int sum = 0;
            int num = nums[i];
            while(num > 0){
                sum += num % 10;
                num /= 10;
            }
            if(sum == i){
                return sum;
            }
        }
        return -1;
    }
}