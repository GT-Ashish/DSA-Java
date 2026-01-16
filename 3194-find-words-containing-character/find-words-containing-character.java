class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> List = new ArrayList<>();
        int length = words.length;
        for(int i = 0; i < length; i++){
            String word = words[i];
            int strlen = word.length();
            for(int t = 0; t < strlen; t++){
                if(word.charAt(t) == x){
                    List.add(i);
                    break;
                }
            }
        }
        return List;
    }
}