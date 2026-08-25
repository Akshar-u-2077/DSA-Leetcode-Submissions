class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> map = new HashSet<>();
        for(int num :nums)
        {
            map.add(num);
        }
        for(int i=1;i<=100;i++)
        {
            if(!map.contains(k*i))
            {
                return k*i;
            }
        }
        return nums[nums.length-1]+k;
    }
}