class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq=new int[26];
        for(char ch :  chars.toCharArray())
        {
            freq[ch-'a']++;
        }
        int sum=0;
        for(String word : words)
        {
            int[] freqWord=new int[26];
            for(char ch : word.toCharArray())
            {
                freqWord[ch-'a']++;
            }
            boolean good=true;
            for(int i=0;i<26;i++)
            {
                if(freqWord[i]>freq[i])
                {
                    good=false;
                    break;
                }
            }
            if(good)
            {
                sum+=word.length();
            }
        }
        return sum;
    }
}
