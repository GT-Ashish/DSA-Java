class Solution {
    public int[] intersection(int[] nums, int[] array) {
        Arrays.sort(array);
        Arrays.sort(nums);
        int length = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            while(i + 1 < length && nums[i] == nums[i + 1]){
                i++;
            }
            if (binarysearch(array, nums[i])) {
                list.add(nums[i]);
            }
        }

        int size = list.size();
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public boolean binarysearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return true;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}