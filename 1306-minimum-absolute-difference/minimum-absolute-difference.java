class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] array) {
        Arrays.sort(array);
        int length = array.length;
        int mindiff = Integer.MAX_VALUE;
        for (int i = 1; i < length; i++) {
            int diff = array[i] - array[i - 1];
            mindiff = Math.min(diff, mindiff);
        }
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i < length; i++) {
            if(array[i] - array[i - 1] == mindiff){
                List<Integer> temp = new ArrayList<>(2);
                temp.add(array[i - 1]);
                temp.add(array[i]);
                list.add(temp);
            }
        }
        return list;
    }
}