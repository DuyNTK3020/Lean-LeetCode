// 2 ms
// class Solution {
//     public int minOperations(int[] nums, int k) {

//         for (int num : nums) {
//             if (num < k) return -1;
//         }

//         Set<Integer> set = new HashSet<>();
//         for (int num : nums) {
//             if (num > k) {
//                 set.add(num);
//             }
//         }

//         return set.size();
//     }
// }

class Solution {
    public int minOperations(int[] nums, int k) {
        boolean[] has = new boolean[101];

        for (int num : nums) {
            has[num] = true;
        }
        int cnt = 0;
        for (int i = 0; i < has.length; i++) {
            if (!has[i]) 
                continue;
            if (has[i] && i < k)
                return -1;
            if (has[i] && i > k)
                cnt++;
        }
        return cnt;
    }
}