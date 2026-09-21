class Solution {
    public int maxSubArray(int[] nums) {
        int max=0,sum=0;
        max=nums[0];
        sum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
          sum=Math.max(nums[i],sum+nums[i]);
          max=Math.max(sum,max);
        }
        return max;
    }
}