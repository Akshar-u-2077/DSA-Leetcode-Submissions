class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int j=0;
        Stack<Integer> stack = new Stack<>();
        int res[] = new int[nums1.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums1.length;i++)
        {
            res[i]=-1;
            map.put(nums1[i],i);
        
        }
        for(int i=0;i<nums2.length;i++)
        {
            while(!stack.isEmpty() && nums2[i]>stack.peek())
            {
                int val=stack.pop();
                if(map.containsKey(val))
                {
                    res[map.get(val)]=nums2[i];
                }

                
            }
            if(map.containsKey(nums2[i]))
            {
                stack.push(nums2[i]);
            }                      
        }
        return res;
    }
}