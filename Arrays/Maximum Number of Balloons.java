class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq=new int[26];
        for(char c : text.toCharArray())
        {
            freq[c-'a']++;
        }
        int b=freq['b'-'a'];
        int a=freq['a'-'a'];
        int l=freq['l'-'a'];
        int o=freq['o'-'a'];
        int n=freq['n'-'a'];
        
        int min=0;
        while(b>=1 && a>=1 && l>=2 && o>=2 && n>=1)
        {
            min++;
            b--;
            a--;
            l-=2;
            o-=2;
            n--;
        }
        return min;
    }
}
