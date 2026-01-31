class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       int len1 = nums1.length;
       int len2 = nums2.length;
       int [] answer = new int[Math.min(len1, len2)];
       int max1 = Integer.MIN_VALUE;
       int max2 = Integer.MIN_VALUE;
       for(int element : nums1){
        max1 = Math.max(element , max1);
       }
       for(int element : nums2){
        max2 = Math.max(element, max2);
       }
       int [] f1 = new int [max1 + 1];
       int [] f2 = new int [max2 + 1];
       for(int i = 0; i < len1; i++){
        f1[nums1[i]] += 1;
       }
       for(int i = 0; i < len2; i++){
        f2[nums2[i]] += 1;
       }
       int k = 0;
       int len3 = f1.length;
       int len4 = f2.length;
       for(int i = 0; i < len3; i++){
        if(i < len4 && f1[i] > 0 && f2[i] > 0){
            for(int j = 0; j < Math.min(f1[i], f2[i]); j++){
                answer[k] = i;
                k++;
            }
        }
       }
       return Arrays.copyOf(answer,k);
    }
}