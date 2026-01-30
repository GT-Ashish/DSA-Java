class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int [] rarray = new int [m];
        int [] carray = new int [n];
        for(int i = 0; i < m ; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    rarray[i] = 1;
                    carray[j] = 1; 
                }
            }
        }
        for(int i = 0; i < n; i++){
            if(carray[i] == 1){
                for(int j = 0; j < m; j++){
                    matrix[j][i] = 0;
                }
            }
        }
        for(int i = 0; i < m; i++){
            if(rarray[i] == 1){
                for(int j = 0; j < n; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        
        
    }
}