class Solution {
    public int[] resultArray(int[] nums) {
        
        int arr1_prev=nums[0];
        int arr2_prev=nums[1];

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int i=2;i<nums.length;i++)
        {
            if(arr1_prev<arr2_prev)
            {
                arr2.add(nums[i]);
                arr2_prev=nums[i];
            }
            else if(arr1_prev>=arr2_prev)
            {
                arr1.add(nums[i]);
                arr1_prev=nums[i];
            }
            
        }
        int result[] = new int[nums.length];
        int i=0;
        for(int elements : arr1)
        {
            result[i++]=elements;
        }
        for(int elements : arr2)
        {
            result[i++]=elements;
        }
        return result;

    }
}