class Solution {
    private Boolean canPartition(Boolean[] dp, int target, int index, int[] nums) {
        if (target == 0)
            return true;

        if (target < 0)
            return false;
       
        if (index == 0)
            return target == nums[0];
       
        if (dp[target] != null)
            return dp[target];
       
        return dp[target] = canPartition(dp, target - nums[index], index - 1, nums) || canPartition(dp, target, index - 1, nums);
    }

    public boolean canPartition(int[] nums) {

        int sum = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            sum += nums[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        int target = sum/2;

        Boolean[] dp = new Boolean[target + 1];

        return canPartition(dp, target, length - 1, nums);

        // boolean[] dp = new boolean[target + 1];
        // dp[0] = true;
        // for (int num : nums) {
        //     for (int i = target; i>= num; i--) {
        //         dp[i] = dp[i] || dp[i - num];
        //     }
        // }
        // return dp[target];

    }
}