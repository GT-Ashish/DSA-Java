class Solution {
    public int func(int n){
        if(n==1 || n==0){
            return n;
        }
        return func(n-1)+func(n-2);
    }
    public int fib(int n) {
        return func(n);
    }
}