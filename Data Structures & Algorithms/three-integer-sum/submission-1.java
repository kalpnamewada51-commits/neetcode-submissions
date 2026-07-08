class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int sum = 0;
        for(int i =0;i<nums.length;i++)
        {
             if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
                }
            int start = i+1;
            int end = nums.length-1;
            while(start<end)
            {
                sum = nums[i]+nums[start]+nums[end];
                if(sum==0)
                {
                    List<Integer> threeElement = new ArrayList<>();
                    threeElement.add(nums[i]);
                    threeElement.add(nums[start]);
                    threeElement.add(nums[end]);
                    res.add(threeElement);
                    start++;
                    end--;
                    while (start < end && nums[start] == nums[start - 1]) {
    start++;
}
while (start < end && nums[end] == nums[end + 1]) {
    end--;
}
                }
                else if (sum > 0) {
                    end--;
                } else {
                    start++;
                
                }
            }
            
        }
        return res;
    }
}
