class Solution {
    public int maxNumberOfBalloons(String text) {
        int freq[] = new int[128];
        for(char ch:text.toCharArray())
        {
            freq[ch]++;
        }
        return Math.min(freq['b'],
                    Math.min(freq['a'],
                    Math.min(freq['l']/2,
                    Math.min(freq['o']/2,freq['n']))));

        }
}