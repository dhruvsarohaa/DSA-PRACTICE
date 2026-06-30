class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int i;
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n : nums)
        {
            int freq=map.getOrDefault(n,0)+1;
            map.put(n,freq);
            if(freq>nums.length/3)
            {
                if(list.contains(n))
                {
                    continue;
                }
                list.add(n);
            }
        }
        return list;
    }
}
