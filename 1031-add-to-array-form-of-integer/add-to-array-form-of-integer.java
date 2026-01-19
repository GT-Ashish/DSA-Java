class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int length = num.length;
        int kdigs = (int)Math.log10(k) + 1;
        int max = Math.max(length , kdigs);
        ArrayList<Integer> List = new ArrayList<>(max);
        int sum = 0;
        int carry = 0;
        int pointer = length - 1;
        for(int i = 0; i < max; i++){
            if(pointer < 0){
               sum = 0 + k % 10 + carry;
            }
            else{
                sum = num[pointer] + (k % 10) + carry;
            }
            carry = sum / 10;
            List.add(0,sum % 10);
            sum = 0;
            k = k / 10;
            pointer --;
            
        }
        if(carry != 0){
           List.add(0,carry);
         }
         return  List;
     }

}