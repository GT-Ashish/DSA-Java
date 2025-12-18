class Solution {
    public boolean checkIfPangram(String sentence) {
        int length=sentence.length();
        if(length<26){
            return false;
        }
        ArrayList <Character> list= new ArrayList<>(length);
        for(int i=0;i<length;i++){
            list.add(sentence.charAt(i));
        }
        
        for(char i='a';i<='z';i++){
            if(!list.contains(i)){
               return false; 
            }
        }
        return true;

        
    }
}