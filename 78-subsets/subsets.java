class Solution {

    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public void backtrack(int index,List<Integer> list ,List<List<Integer>> ans,int[] nums)
    {
        if(index==nums.length)
        {
            ans.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[index]);
        backtrack(index+1,list,ans,nums);
        list.remove(list.size()-1);
        backtrack(index+1,list,ans,nums);
        return;
    }
    public List<List<Integer>> subsets(int[] nums) {
        
        backtrack(0,list,ans,nums);
        return ans;
    }
}