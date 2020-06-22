package interview.algorithms;

public class BinarySearch {

	public int search(int[] nums, int target, int start, int end)
	{
		int pivot = (start + end)/2;
		if(target == nums[pivot])
		{
			return pivot;
		}
		
		else if( target < nums[pivot])
		{
			return search(nums, target, start, pivot);
		}
		else if( target > nums[pivot])
		{
			return search(nums,target, pivot, end);
		}
		
		return -1;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearch arr = new BinarySearch();
		int nums[]= {4,5,6,7,0,1,2};
		System.out.println(arr.search(nums, 1, 0, nums.length-1));

	}
}


