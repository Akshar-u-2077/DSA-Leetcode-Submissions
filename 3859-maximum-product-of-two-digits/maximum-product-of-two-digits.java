class Solution {
    public int maxProduct(int n) {
       int ans=0;
       String temp = Integer.toString(n);
       int digits[] = new int[temp.length()];
       for(int i=0;i<temp.length();i++)
       {
            digits[i]=temp.charAt(i)-'0';
       }
       int max_index=0;
       int max=Integer.MIN_VALUE;
       for(int i=0;i<digits.length;i++)
       {
            if(digits[i]>max)
            {
                max=digits[i];
                max_index=i;
            }
       }
       digits[max_index]=-1;
       for(int i:digits)
       {
            if(i!=-1)
            {
                ans = Math.max(ans,max*i);
            }
       }

       return ans;
    }
}