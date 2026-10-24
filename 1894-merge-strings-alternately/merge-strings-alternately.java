class Solution {
    public String mergeAlternately(String word1, String word2) {

        int len1=word1.length();
        int len2=word2.length();
        
        int len = len1+len2;
        int i=0;
        int j=0;
        int k=0;
        StringBuilder sb = new StringBuilder();
        while(i<len1 && j<len2 && k<len)
        {
            if(k%2==0)
            {
                sb.append(word1.charAt(i));
                i++;
            }
            else
            {
                sb.append(word2.charAt(j));
                j++;
            }
            k++;
        }
        if(i==len1 && j!=len2)
        {
            String sub = word2.substring(j);
            sb.append(sub);
        }
        else if(i!=len1 && j==len2)
        {
            String sub = word1.substring(i);
            sb.append(sub);
        }
        String ans = sb.toString();
        return ans;

        
    }
}