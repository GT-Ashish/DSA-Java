class Solution {
    public String convertToBase7(int num) {
       int copy = num;
       int remainder = 0;
       int newnum = 0;
       int count = 1;
       if(num < 0){
        num *= -1;
       }
       while(num > 0){
        remainder = num % 7;
        System.out.print(remainder);
        newnum = remainder * count + newnum;
        count *= 10;
        num /= 7;
       }
       if(copy < 0){
        newnum *= -1;
       }
       return ""+newnum;
    }
}