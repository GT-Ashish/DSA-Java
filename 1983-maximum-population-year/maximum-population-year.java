class Solution {
    public int maximumPopulation(int[][] logs) {
        int [] population = new int[100];
        int length  = logs.length;
        for(int i = 0; i < length; i++){
            for(int j = logs[i][0]; j < logs[i][1]; j++){
                population[j - 1950] += 1;
            }
        }
        int max = 0;
        int year = 1950;
        int min = 0;
        for(int i = 0; i < 100; i++){
            if(population[i] > max){
                max = population[i];
                min = year;
            }
            year++;
        }
        return min;
    }
}