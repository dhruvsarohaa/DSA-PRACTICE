class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n : nums)
        {
            int freq=map.getOrDefault(n,0)+1;
            map.put(n,freq);
            if(freq>nums.length/2)
            {
                return n;
            }
        }
        return -1;
    }
}
