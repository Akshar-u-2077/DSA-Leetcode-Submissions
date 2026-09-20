class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int i=1;
        for(char ch:s.toCharArray())
        {
            int prod=i*(Math.abs(ch-'z')+1);
            sum+=prod;
            i++;
        }
        return sum;
    }
}