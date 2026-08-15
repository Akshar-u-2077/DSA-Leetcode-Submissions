class Solution {
    public int characterReplacement(String s, int k) {
        
        int freq[] = new int[26];

        int left=0;
        int right=0;
        int cur=0;
        int max=0;
        int max_ele= 0;
        int freq_ele_count=0;
        //int replacements=0;
        int windowsize=0;

        
        while(left<s.length() && right<s.length())
        {
            windowsize=right-left+1;
            freq[s.charAt(right)-'A']++;
            if(max_ele<freq[s.charAt(right)-'A'])
            {
                max_ele= freq[s.charAt(right)-'A'];
            }
            if(windowsize-max_ele<=k)
            { 
                right++;
            }
            else
            {
                while((right-left+1)-max_ele>k)
                {
                    freq[s.charAt(left)-'A']--;
                    left++;
                }
                right++;
            }
            windowsize=right-left;
            max=Math.max(windowsize,max);

        }
        return max;
    } 
}