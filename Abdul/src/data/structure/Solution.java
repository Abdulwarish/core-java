package data.structure;

import java.util.Arrays;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
    	int result[];
    	int total[] = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]+nums[j]==target)
				{
					total[0]=i;
					total[1]=j;
					return total;
				}
			}
			
		}
    	return nums;
    }
    
    public static void main(String[] args) {
    	int num[]={2,5,5,11};
        int []total=twoSum(num,10);
    	
        System.out.println(Arrays.toString(total));
	}
}