class Solution {
    public int smallestIndex(int[] nums) {
        
        for(int i = 0;i < nums.length;i++) {
            int indSum = 0;
            int digit = nums[i];
            while(digit != 0) {
                int temp = digit % 10;
                indSum += temp;
                digit = digit/10;
            }
            if(indSum == i) return i;
        }
        return -1;
    }
}