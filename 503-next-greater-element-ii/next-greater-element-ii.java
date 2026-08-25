class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int res[] = new int[nums.length];
        
        for(int i=0;i<nums.length;i++)
        {
            res[i]=-1;
        }

        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<2*nums.length;i++)
        {
            int index = i%nums.length;
            while(!stack.isEmpty() && nums[index]>nums[stack.peek()%nums.length])
            {
                int stackindex = stack.pop()%nums.length;
                res[stackindex]=nums[index];
            }
            stack.push(i);
        }
        return res;
}
}