class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);

        int count=0;
        for(int i=0;i<arr1.length;i++)
        {
            int target=arr1[i];
            int low=0;
            int high=arr2.length-1;
            int flag=0;
            while(low<=high)
            {
                int mid=low+(high-low)/2;
                if(arr2[mid]>=(arr1[i]-d) && arr2[mid]<=(arr1[i]+d))
                {
                    flag=1;
                    break;
                }
                else if(arr2[mid]<arr1[i]-d)
                {
                    low=mid+1;
                }
                else
                {
                    high=mid-1;
                }
            }
            if(flag==0)
            {
                count++;
            }
        }
        return count;
    }
}