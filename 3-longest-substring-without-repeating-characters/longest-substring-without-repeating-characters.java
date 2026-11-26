class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> map = new HashSet<Character>();
        int i=0;
        int j=0;
        int count=0;
        int maxcount=1;
        if(s.length()==0)
        {
            return 0;
        }
        
        while(i<s.length() && j<s.length())
        {
            if(i==0 && j==0)
            {
                map.add(s.charAt(j));
                j++;
                count++;
                continue;
                //count++;
            }
            if(!map.contains(s.charAt(j)))
            {
                map.add(s.charAt(j));
                j++;
                count++;
            }
            else if(map.contains(s.charAt(j)))
            {
                map.remove(s.charAt(i));
                i++;
                count=j-i;
                
            }
            
            maxcount=Math.max(count,maxcount);
        }
        return maxcount;
    }
}