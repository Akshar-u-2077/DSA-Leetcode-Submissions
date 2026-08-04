class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> map = new HashSet<Integer>();
        if(nums.length==0)
        {
            return 0;
        }
        for(int i=0;i<nums.length;i++)
        {
            map.add(nums[i]);
        }
        int count=1;
        int i=0;
        int maxcount=1;
        for(int ele :map)
        {
            
            if(!map.contains(ele-1))
            {
                while(map.contains(ele+1))
                {
                    count++;
                    maxcount = Math.max(maxcount,count);
                    ele++;
                }
            }
            count=1;
        }
        return maxcount;
        
    }
}