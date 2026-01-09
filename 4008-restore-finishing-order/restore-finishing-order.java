class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int length = friends.length;
        int count = 0;
        int [] answer = new int[length];
        for(int element : order){
            for(int i = 0; i < length; i++){
                if(friends[i] == element){
                    answer[count] = element;
                    count ++;
                }
            }
        }
    return answer;
    }
}