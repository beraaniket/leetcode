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
        int i = 0;
        for(int j = 0; j < arr1.size(); j++){
            nums[i] = arr1.get(j);
            i++;
        }
        for(int k = 0; k < arr2.size(); k++){
            nums[i] = arr2.get(k);
            i++;
        }
        return nums;
    }
}