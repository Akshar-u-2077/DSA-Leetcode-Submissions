class Solution {
    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Safe LCM using long and divide-before-multiply
    private long lcm(long a, long b) {
        if (a == 0 || b == 0) return 0;
        return (a / gcd(a, b)) * b;
    }


    public int maxLength(int[] nums) {
        int count=1;
        int maxcount=1;
        
        
        for(int i=0;i<nums.length;i++)
        {
            int prod=nums[i];
            long cur_gcd=(long)nums[i];
            long cur_lcm=(long)nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
                prod*=nums[j];
                cur_gcd= gcd(cur_gcd,(long)nums[j]);
                cur_lcm=lcm(cur_lcm,(long)nums[j]);
                if(prod==cur_gcd*cur_lcm)
                {
                    count=j-i+1;
                }

            }
            maxcount=Math.max(count,maxcount);
            
        }
        return maxcount;
    }
}