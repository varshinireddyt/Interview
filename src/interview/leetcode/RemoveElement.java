package interview.leetcode;

public class RemoveElement {
	//Solution for Remove element
	//Time complexity: O(n)
	
	public int remove(int[] nums, int val)
	{
		int length = nums.length;
		int j=0;
		if(length == 0 || length == 1)
		{
			return length;
		}
		for(int i = 0; i<length; i++)
		{
			if(nums[i] != val)
			{
				nums[j++] = nums[i];
			}			
		}
		nums[j++] = nums[length-1];
		return j;
	}

	public static void main(String[] args) {
		
		RemoveElement rem = new RemoveElement();
		int nums[] = {3,2,2,3};
		System.out.println(rem.remove(nums, 3));

	}

}
