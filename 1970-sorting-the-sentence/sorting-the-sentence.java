class Solution {
    public String sortSentence(String s) {
       String[] arr = s.split(" ");
       int length = arr.length;
       StringBuilder sb = new StringBuilder();
       for(int i = 1; i <= length; i++){
            for(int j = 0; j < length; j++){
                int slen = arr[j].length();
                if(arr[j].charAt(slen - 1) - '0' == i){
                    sb.append(arr[j], 0, slen - 1);
                    sb.append(' ');
                }
            }
       }
       sb.deleteCharAt(sb.length() - 1);
       return sb.toString();
    }
}