class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> small = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> large = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for(int num:nums){
            if(num < pivot) small.add(num);
            else if(num == pivot) equal.add(num);
            else large.add(num);
        }
        result.addAll(small);
        result.addAll(equal);
        result.addAll(large);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}