class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prod=1;
        int m=n;
        while(m>0)
        {
            int dig=m%10;
            sum+=dig;
            m/=10;
        }
        m=n;
        while(m>0)
        {
            int dig=m%10;
            prod*=dig;
            m/=10;
        }

        return (n%(sum+prod))!=0?false:true;

    }
}