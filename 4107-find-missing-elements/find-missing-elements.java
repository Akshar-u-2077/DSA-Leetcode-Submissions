class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> map = new HashSet<Integer>();
        int min=nums[0];
        int max=nums[0];

        for(int num:nums)
        {
            map.add(num);
            min=Math.min(min,num);
            max=Math.max(max,num);
        }
        for(int i=min;i<=max;i++)
        {
            if(!map.contains(i))
            {
                list.add(i);
            }
        }

            
        
        return list;
    }
}