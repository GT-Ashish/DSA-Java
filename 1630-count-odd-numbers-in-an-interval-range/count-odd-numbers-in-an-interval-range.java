class Solution {
    public int countOdds(int low, int high) {
       int count=high-low;
       if(low%2!=0 || count%2!=0){
        return count/2+1;
       }
       return count/2;

    }
}