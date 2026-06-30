class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr=new int[101];
        int maxFreq=Integer.MIN_VALUE;
        for(int n : nums)
        {
            arr[n]++;
            if(arr[n]>maxFreq)
            {
                maxFreq=arr[n];
            }
        }
        int count=0;
        for(int n : arr)
        {
            if(n==maxFreq)
            {
                count++;
            }
        }
        return maxFreq*count;
    }
}
