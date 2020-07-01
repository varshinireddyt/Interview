package interview.leetcode;

public class SearchArray {

	public int search(int[] nums, int target)
	{
		if(nums.length == 0)
		{
			return -1;
		}
		
		if (nums.length <= 2) {
			for(int i = 0; i<nums.length; i++)
			{
				if(nums[i] == target)
					return i;
			} 
		}
		
		int pivot = nums.length/2;
		if( target <= nums[pivot-1]) 
		{
			for(int i = pivot; i<nums.length; i++)
			{
				if(nums[i] == target)
					return i;
			}
		}
		else if( target >= nums[pivot-1])
		{
			for(int i = pivot-1; i >= 0; i--)
			{
				if(nums[i] == target)
					return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SearchArray arr = new SearchArray();
		int nums[] = {1,3};
		System.out.print(arr.search(nums, 1));
		
	}

}
