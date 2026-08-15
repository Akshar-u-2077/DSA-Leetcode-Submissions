class Solution {
    public int maximumLengthSubstring(String s) {
        int freq[] = new int[26];
        int curlen =0;
        int maxlen=0;
        int i=0;
        int j=0;

        while(i<s.length() && j<s.length())
        {
            if(freq[s.charAt(j)-'a']<2)
            {
                freq[s.charAt(j)-'a']++;
                curlen++;
                j++;
                
                
            }
            else
            {
                freq[s.charAt(i)-'a']--;
                curlen--;
                i++;
            }
            maxlen=Math.max(curlen,maxlen);
            
        }
        return maxlen;
    }
}