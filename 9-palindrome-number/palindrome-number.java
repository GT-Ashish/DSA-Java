class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
     int copy=x;
     int palin=0;
     int dig;
     while(copy!=0){
        dig=copy%10;
        palin=palin*10+dig;
        copy=copy/10;
     }
     if(palin==x){
        return true;
     }
     return false;
        
    }
}