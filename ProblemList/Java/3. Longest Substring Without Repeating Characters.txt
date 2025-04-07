class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        Set<Character> seen = new HashSet<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < length; end++) {
            char ch = s.charAt(end);
            
            while (seen.contains(ch)) {
                seen.remove(s.charAt(start));
                start++;
            }
            seen.add(ch);
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
