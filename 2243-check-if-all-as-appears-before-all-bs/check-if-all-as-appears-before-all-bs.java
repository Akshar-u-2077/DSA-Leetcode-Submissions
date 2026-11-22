class Solution {
    public boolean checkString(String s) {
        int bIdx=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='b')
            {
                 break;
            }
            bIdx++;
        }
        char[] string = s.toCharArray();
        for(int i=bIdx;i<s.length();i++)
        {
            if(string[i]=='a')
            {
                return false;
            }
        }
        return true;
    }
}