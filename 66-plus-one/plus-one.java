class Solution {
    public int[] plusOne(int[] digits) {
       int length = digits.length - 1;
       if(digits[length] < 9){
        digits[length] += 1;
        return digits;
       } 
       int sum = 1;
       for(int i = length; i >= 0; i--){
        sum += digits[i];
        digits[i] = sum % 10;
        sum = sum / 10; 
        if(sum == 0){
            return digits;
        }
       }
       int [] answer = new int [length + 2];
       answer[0] = sum;
       for(int i = 0; i <= length; i++){
        answer[i + 1] = digits[i];
       }
       return answer;
    }
}