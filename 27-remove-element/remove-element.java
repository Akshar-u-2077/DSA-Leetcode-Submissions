class Solution {
    public int removeElement(int[] nums, int val) {
        
        int left=0;
        int right=0;
        int count=0;
        while(left<nums.length && right<nums.length)
        {
            if(nums[left]==val && nums[right]!=val)
            {
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right++;
                count++;
            }
            else if(nums[left]==val && nums[right]==val)
            {
                right++;
            }
            else
            {
                left++;
                right++;
                count++;
            }
        }
        return count;
    }
}