class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> list = new HashSet<Character>();
        if(s.length()==0)
        {
            return 0;
        }
        int i=0;
        int j=1;
        int count=1;
        int maxcount=1;
        list.add(s.charAt(i));
        while(j<s.length())
        {
            if(list.contains(s.charAt(j)))
            {
                list.remove(s.charAt(i));
                i++;
                count=j-i;

            }
            
            else
            {
                list.add(s.charAt(j));
                j++;
                count++;
                
            }
            
            
           
            maxcount=Math.max(count,maxcount);
        
        }
        return maxcount;
}
}