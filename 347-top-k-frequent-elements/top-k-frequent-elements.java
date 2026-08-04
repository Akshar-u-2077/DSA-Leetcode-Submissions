class Solution {
    public int[] topKFrequent(int[] nums, int k) {
            HashMap<Integer,Integer> map = new HashMap<>();
            int count=0;
            int max=nums[0];
            int ans[] = new int[k];
            
            for(int num:nums)
            {
                
                if(!map.containsKey(num))
                {
                    map.put(num,1);
                    count++;//this counts the number of uniuque elements in the array..
                }
                else
                {   int val=(map.get(num));
                    map.put(num,++val); //this map stores like number -->its frequency
                      
                }
                
            }
            ArrayList<Integer>[] list = new ArrayList[nums.length+1];
            for(Map.Entry<Integer, Integer> entry : map.entrySet())
            {
                if(list[entry.getValue()]==null)
                {
                    list[entry.getValue()]=new ArrayList<>();
                }
                
                
                list[entry.getValue()].add(entry.getKey());
                
            }
            int index=0;
            for(int i=nums.length;i>=0;i--)
            {
                if(list[i]!=null)
                {
                    
                    for(int ele : list[i])
                    {
                        if(index<k)
                            ans[index++]=ele;
                        
                    }
                }
            }
          return ans;  
            
    }
}