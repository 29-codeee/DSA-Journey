class Solution {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        int p;
        for(int i=0;i<nums.length;i++){
            p=target-nums[i];
            if(map.containsKey(p)){
            return new int[]{map.get(p),i};
        }
        map.put(nums[i],i);
    }
    return new int[]{};
}}