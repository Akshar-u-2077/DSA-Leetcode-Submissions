class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=piles[0];
        long hours=0;
        
        for(int pile :piles)
        {
            high=Math.max(pile,high);
        }
        //int minspeed=high;

        while(low<=high)
        {
            int mid=(low+(high-low)/2);//this will be my banana eating speed
            hours=0;
            for(int pile:piles)
            {
                hours+=(pile+(mid-1))/mid;
            }

            if(hours<=h)
            {
                high=mid-1;
                //minspeed=Math.min(minspeed,mid);
            }
            else if(hours>h)
            {
                low=mid+1;
            }
            
            
        }

        return low;
    }
}