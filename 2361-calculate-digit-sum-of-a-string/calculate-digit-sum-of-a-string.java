class Solution {
    public String digitSum(String s, int k) {
        int count=0;
        
        int sum=0;
        while(s.length()>k) 
        {
            sum=0;
            count=0;
            StringBuilder temp = new StringBuilder();
            for(int i=0;i<s.length();i++)
            {
                sum+=s.charAt(i)-'0';
                count++;
                if(count==k || i+1 == s.length())
                {
                    temp.append(Integer.toString(sum));
                    sum=0;
                    count=0;
                }
            }
            s=temp.toString();
        }
        return s;
    }
}