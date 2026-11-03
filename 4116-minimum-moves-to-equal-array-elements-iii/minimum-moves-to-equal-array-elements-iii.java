class Solution {
    public int minMoves(int[] nums) {
        int max=nums[0];
        int sum=0;
        int count=0;
        for(int num:nums)
        {
            max=Math.max(num,max);
            sum+=num;
        }

        count=nums.length*max-sum;
        return count;
    }
}