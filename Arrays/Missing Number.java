class Solution {
    public int missingNumber(int[] nums) {
        int[] freq=new int[nums.length+1];
        for(int n : nums)
        {
            freq[n]++;
        }
        for(int i=0;i<=nums.length;i++)
        {
            if(freq[i]==0)
            {
                return i;
            }
        }
        return -1;
    }
}
