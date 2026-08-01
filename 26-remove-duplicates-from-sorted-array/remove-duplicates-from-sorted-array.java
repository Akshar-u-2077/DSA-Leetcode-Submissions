class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1;
        
        int i=0;
        int count=0;
        while(i<nums.length && j<nums.length)
        {
            if(nums[i]==nums[j])
            {
                j++;
                
            }
            else
            {
                nums[i+1]=nums[j];
                i++;
                if(i==j)
                {
                    j=i+1;
                }
            }
        }
        return i+1;
    }
}