class Solution {
    public int arrangeCoins(int n) {
        int start = 1;
        int end = n;
        int middle;
        long number;
        while(start <= end){
            middle = start + (end - start) / 2;
            number=countStairs(middle);
            if(number == n){
                return middle;
            }
            else if(number < n){
                start = middle + 1;
            }
            else {
                end = middle - 1;
            }
        } 
        return end;
        
    }
    public long countStairs(int n){
       return((long)n * (n + 1)) / 2; 
    }
}