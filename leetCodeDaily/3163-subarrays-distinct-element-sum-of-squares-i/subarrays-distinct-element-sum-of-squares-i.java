class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int result = 0;
        for(int i = 0; i < n; i++){
            Set<Integer> st = new TreeSet<>();
            for(int j = i; j < n; j++){
                st.add(nums.get(j));
                result += st.size() * st.size();
            }
        }
        return result;
    }
}