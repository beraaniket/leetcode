class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        int n = nums.length;
        for(int i = 2; i < n; i++){
            if(arr1.getLast() > arr2.getLast()){
                arr1.add(nums[i]);
            }
            else arr2.add(nums[i]);
        }
        return Stream.concat(arr1.stream(), arr2.stream()).mapToInt(Integer::intValue).toArray();
    }
}