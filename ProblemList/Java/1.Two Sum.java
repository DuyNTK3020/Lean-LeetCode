class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> targetIndex = new HashMap();
        int[] result = new int[2];
        for(int i = 0; i< nums.length; i++){
            if(targetIndex.containsKey(target - nums[i])){
                result[0] = i;
                result[1] = targetIndex.get(target - nums[i]);
                return result;
            }
            targetIndex.put(nums[i], i);
        }
        return result;
    }
}