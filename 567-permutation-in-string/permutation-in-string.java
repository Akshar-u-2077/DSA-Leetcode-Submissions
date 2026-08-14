class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int windowsize=s1.length();
        if(s1.length()>s2.length())
        {
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        int freq1[] = new int[26];
        int freq2[] = new int[26];

        for(int i=0;i<s1.length();i++)
        {
            char ch = s1.charAt(i);
            freq1[ch-'a']++;
        }
        int j=0;
        int i=0;
        while((j-i+1)<windowsize)
        {
            freq2[s2.charAt(j)-'a']++;
            j++;
        }
        freq2[s2.charAt(j)-'a']++;
        if((j-i+1)==windowsize)
        {
            while(j<s2.length() && i<s2.length() && j-i+1==windowsize)
            {
                if(Arrays.equals(freq1,freq2))
                {
                    return true;
                }
                else
                {
                    freq2[s2.charAt(i)-'a']--;
                    i++;
                    j++;
                    if(j>=s2.length())
                    {
                        break;
                    }
                    freq2[s2.charAt(j)-'a']++;
                }
            }
        }
        


        
        return false;


    }
}