class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        ArrayList<List<String>> ans = new ArrayList<>();
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        


        for(int i=0;i<strs.length;i++)
        {
            int count[] = new int[26];
            char string[] = strs[i].toCharArray();
            StringBuilder key = new StringBuilder();
            for(int j=0;j<string.length;j++)
            {
                
                count[string[j]-'a']++;
                
            }
            for(int c :count)
            {
                key.append('#');
                key.append(c);
            }
            String keyString = key.toString();

            if(map.containsKey(keyString))
            {
                ArrayList<String> temp = map.get(keyString);
                
                temp.add(strs[i]);
                map.put(keyString,temp);
            }
            else
            {
                ArrayList<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                map.put(keyString,temp);
            }
        }

        for (ArrayList<String> value : map.values()) {
            ans.add(value);
        }
        return ans;
        


    }

}
