class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max=0;
        int cur=0;
        int left=0;
        int right=0;

        while(left<nums.length && right<nums.length)
        {
            if(map.containsKey(nums[right]))
            {
                int value=map.get(nums[right]);
                if(value<k)
                {
                    map.put(nums[right],++value);
                    cur++;
                    right++;
                }
                else
                {
                    int val=map.get(nums[left]);
                    map.put(nums[left],--val);
                    cur--;
                    left++;
                }
                
            }
            else
            {
                map.put(nums[right],1);
                right++;
                cur++;
            }
            max=Math.max(cur,max);
            
        }
        return max;
    }
}