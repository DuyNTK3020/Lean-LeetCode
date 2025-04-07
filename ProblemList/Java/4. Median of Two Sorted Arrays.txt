class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int length = m + n;

        int index1 = 0;
        int index2 = 0;

        int[] nums = new int[length];

        for (int i = 0; i < length; i++) {
            if (index1 == m) {
                nums[i] = nums2[index2];
                index2++;
            } else if (index2 == n) {
                nums[i] = nums1[index1];
                index1++;
            } else if (nums1[index1] < nums2[index2]) {
                nums[i] = nums1[index1];
                index1++;
            } else {
                nums[i] = nums2[index2];
                index2++;
            }
        }
        
        if (length % 2 == 0) {
            return (nums[length / 2 - 1] + nums[length / 2]) / 2.0;
        } else {
            return nums[length / 2];
        }
    }
}
