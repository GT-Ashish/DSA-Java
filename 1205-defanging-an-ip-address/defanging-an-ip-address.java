class Solution {
    public String defangIPaddr(String address) {
        String answer="";
        for(int i = 0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                answer+="[.]";
            }
            else{
                answer+=address.charAt(i);
            }
        }
        return answer;
    }
}