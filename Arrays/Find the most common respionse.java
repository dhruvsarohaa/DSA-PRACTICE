class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        HashMap<String,Integer> map=new HashMap<>();
        int n=responses.size();
        int i=0;
        int freq=0;
        String mm="";
        int a=Integer.MIN_VALUE;
        while(i<n)
        {
            HashSet<String> set=new HashSet<>();
            for(String s : responses.get(i))
            {
                set.add(s);
            }
            for(String s : set)
            {
                freq=map.getOrDefault(s,0)+1;
                map.put(s,freq);
                if(freq>a)
                {
                    a=freq;
                    mm=s;
                }
                else if(freq==a)
                {
                    if(s.compareTo(mm)<0)
                    {
                        mm=s;
                    }
                }
            }
            i++;
        }
        return mm;
    }
}
