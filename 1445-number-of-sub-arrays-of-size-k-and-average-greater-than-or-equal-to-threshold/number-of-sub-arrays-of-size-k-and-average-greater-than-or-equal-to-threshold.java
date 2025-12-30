class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int length = arr.length;
        int compare = k * threshold;
        int sum = 0;
        int count = 0;
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }
        if(sum >= compare){
            count++;
        }
        for(int i = k; i < length; i++){
            sum = sum + arr[i] - arr[i - k];
            if(sum >= compare){
                count ++;
            }
        }
        return count;

        
    }
}