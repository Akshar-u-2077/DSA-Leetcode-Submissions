class Solution {
    public int maxFreqSum(String s) {
        int vovel[]=new int[26];
        int max1=0;
        int max2=0;
        int cons[] = new int[26];
        for(char ch:s.toCharArray())
        {
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                vovel[ch-'a']++;
                if(vovel[ch-'a']>max1)
                {
                    max1=vovel[ch-'a'];
                }

            }
            else
            {
                cons[ch-'a']++;
                if(cons[ch-'a']>max2)
                {
                    max2=cons[ch-'a'];
                }
            }
        }
        return max1+max2;

    }
}