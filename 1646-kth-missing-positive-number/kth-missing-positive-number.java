class Solution {
    public int findKthPositive(int[] arr, int k) {
        int arrLen = arr.length;
        int previous = 0;
        int i;
        for( i = 0; i < arrLen; i++){
            k = k - (arr[i]- previous - 1);
            System.out.print(k);
            previous = arr[i];
            if(k == 0){
                return arr[i]-1;
            }
            if(k < 0){
                return (arr[i]-1)+k;
            }

            
        }
        return arr[arrLen-1]+k;
    }
}