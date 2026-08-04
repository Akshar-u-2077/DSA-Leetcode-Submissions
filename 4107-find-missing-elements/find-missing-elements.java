class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        
        ArrayList<Integer> list = new ArrayList<>();
       
        int min=nums[0];
        int max=nums[0];
        for(int ele:nums)
        {
            min=Math.min(ele,min);
            max=Math.max(ele,max);
            
        }
        int arr[] = new int[max+1];
        for(int ele:nums)
        {
            
            arr[ele]++;
        }
         
        for(int i=min;i<max;i++)
        {
            if(arr[i]==0)
            {
                list.add(i);
            }
        }
        return list;
    }
}