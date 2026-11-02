class Solution {
    public int minStartValue(int[] nums) {
        int min = Integer.MAX_VALUE;
        int preFixSum = 0;
        for(int num : nums){
            preFixSum += num;
            min = Math.min(min , preFixSum);
        }
        return min >0 ? 1:1 - min;
    }
}