class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;
        while(true){
        for (int i = left; i <= right; i++) {
            list.add(matrix[top][i]);
            if (list.size() == rows * cols) {
                return list;
            }
        }
        top++;
        for (int i = top; i <= bottom; i++) {
            list.add(matrix[i][right]);
            if (list.size() == rows * cols) {
                return list;
            }
        }
        right--;

        for (int i = right; i >= left; i--) {
            list.add(matrix[bottom][i]);
            if (list.size() == rows * cols) {
                return list;
            }
        }
        bottom--;
        for (int i = bottom; i >= top; i--) {
            list.add(matrix[i][left]);
            if (list.size() == rows * cols) {
                return list;
            }

        }
        left++;
    }
    }
}