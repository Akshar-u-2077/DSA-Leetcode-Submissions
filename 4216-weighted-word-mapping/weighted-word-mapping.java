class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<words.length;i++)
        {  
            int sum=0;
            for(int j=0;j<words[i].length();j++)
            {
                sum+=weights[words[i].charAt(j) - 'a'];
                
            }
            sb.append(((char)(25-(sum%26)+'a')));
        }
        return sb.toString();

            
    }
}