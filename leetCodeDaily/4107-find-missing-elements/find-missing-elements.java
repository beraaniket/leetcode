class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> st = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            st.add(num);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        for(int i = min; i <= max; i++){
            if(!st.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}