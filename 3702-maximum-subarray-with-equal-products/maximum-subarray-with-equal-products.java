class Solution {
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    
    private int lcm(int a, int b) {
        if (a == 0 || b == 0) return 0;
        return (a / gcd(a, b)) * b;
    }


    public int maxLength(int[] nums) {
        int count=1;
        int maxcount=1;
        
        
        for(int i=0;i<nums.length;i++)
        {
            int prod=nums[i];
            int cur_gcd=nums[i];
            int cur_lcm=nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
                prod*=nums[j];
                cur_gcd= gcd(cur_gcd,nums[j]);
                cur_lcm=lcm(cur_lcm,nums[j]);
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