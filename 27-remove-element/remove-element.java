class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            if(nums[left] != val){
                left ++;
            }
            else if(nums[right] == val){
                right --;
            }
            else{
                nums[left] = nums[right];
                nums[right] = val;
                left ++;
                right --;
            }

        }
        int length = nums.length;
        for(int i = 0; i < length; i++){
            if(nums[i] == val){
                return i;
            }
        }
        return length;
    }
}