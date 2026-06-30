class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;
        double[] arr=new double[nums.length/2];
        while(start<end)
        {
            arr[start]=(nums[start]+nums[end])/2.0;
            start++;
            end--;
        }
        Arrays.sort(arr);
        return arr[0];
    }
}
