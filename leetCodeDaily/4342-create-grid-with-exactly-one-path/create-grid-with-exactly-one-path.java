class Solution {
    public String[] createGrid(int m, int n) {
        StringBuilder row = new StringBuilder();
        String[] result = new String[m];
        if(m == 1){
            for(int i = 0; i < n; i++){
                row.append('.');
            }
            result[0] = row.toString();
            return result;
        }
        for(int i = 0; i < n; i++){
            row.append('.');
        }
        result[0] = row.toString();
        row.setLength(0);
        for(int i = 0; i < n - 1; i++){
            row.append('#');
        }
        row.append('.');
        for(int i = 1; i < m; i++){
            result[i] = row.toString();
        }
        return result;
    }
}