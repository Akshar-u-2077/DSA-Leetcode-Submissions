class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max_value=nums[0];
        int min_value;
        int i=0;
        int j=0;
        int n=nums.length-1;
        int min_instability=0;
        while(j<nums.length)
        {
            i=0;
            max_value=nums[i];
            min_value=nums[j];
            for(i=0;i<=j;i++)
            {
                if(nums[i]>=max_value)
                {
                    max_value=nums[i];
                }
            }
            for(i=j;i<=n;i++)
            {
                if(nums[i]<=min_value)
                {
                    min_value=nums[i];
                }
            }
            min_instability=max_value-min_value;
            if(min_instability<=k)
            {
                return j;
            }
            j++;

        }
        return -1;
    }
}