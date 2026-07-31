class Solution {
    public int[] findDegrees(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int n = matrix.length;
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 1) count++;
            }
            list.add(count);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}