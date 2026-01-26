class Solution {
    public List<Integer> findDisappearedNumbers(int[] array) {
        List <Integer> list = new ArrayList<>();
        int length = array.length;
        int i = 0;
        while(i < length){
            if(array[i] - 1 == i){
                i++;
            }
            else{
                int temp = array[i];
                array[i] = array[array[i] - 1];
                array[temp - 1] = temp;
                if(array[i] == temp){
                    i++;
                }
            }
            
        }
        for(int j = 0; j < length; j++){
            if(array[j] - 1 != j){
                list.add(j + 1);
            }
        }
        return list;
    }
}