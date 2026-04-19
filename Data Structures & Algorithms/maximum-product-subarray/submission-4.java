class Solution {
    public int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            int p = nums[i];
            res = Math.max(p, res);
            for(int j = i + 1; j < nums.length; j++){
                p *= nums[j];
                res = Math.max(res, p);
            }
        }
        return res;
    }
}
