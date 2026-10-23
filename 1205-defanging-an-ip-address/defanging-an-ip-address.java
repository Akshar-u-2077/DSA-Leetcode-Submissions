class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();


        for(char ch:address.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                sb.append(ch);
            }
            else if(ch=='.')
            {
                sb.append("[.]");
            }
        }

        String ans = sb.toString();
        return ans;
    }
}