class Solution {
    public int findClosestNumber(int[] nums) {
        int min=Integer.MAX_VALUE;
        int ans=min;
        for(int num:nums)
        {
            if(Math.abs(num)<=min)
            {
                if(Math.abs(num)==Math.abs(ans))
                {
                    ans=Math.max(ans,num);
                }
                else
                {
                    min=Math.abs(num);
                    ans=num;
                }

            }
        }
        return ans;
        
    }
}