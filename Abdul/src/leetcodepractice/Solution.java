package leetcodepractice;

class Solution {
	public static void main(String args[]) {
		int array[] = {0,2,1,5,3,4};
		System.out.println(buildArray(array));
	}

	public static int[] buildArray(int[] nums) {
		int[] ans = new int[nums.length];
		for (int i = 0, j = 0; i < nums.length; i++, j++) {
			ans[i] = nums[nums[j]];
		}
		return ans;
	}
}