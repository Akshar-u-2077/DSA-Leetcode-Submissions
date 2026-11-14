class Solution {
    public int romanToInt(String s) {

        Map<Character, Integer> map = new HashMap<>(
                Map.of(
                        'I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000));

        int ans = 0;
        //if(map.containsKey(s.charAt(s.length()-1)))
        //{
        int prev = map.get(s.charAt(s.length() - 1));
        //}
        for (int i = s.length() - 1; i >= 0; i--) {
            if (i == s.length() - 1) {
                ans += prev;
            } else {
                char ch = s.charAt(i);
                if (map.containsKey(ch)) {
                    int cur = map.get(ch);
                    if (cur < prev) {
                        ans -= cur;
                    } else {
                        ans += cur;
                    }
                    prev=cur;
                }
            }

        }
        return ans;

    }
}