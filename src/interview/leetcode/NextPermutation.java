package interview.leetcode;

public class NextPermutation {
	
	/*
	 * 1. Scan from right to left, consider a pivot element which is less than its previous one
	 * 2. Scan again from right to left, find the first element that is greater than pivot(let it be q)
	 * 3. Swap the pivot and q
	 * 4. Reverse the elements from [pivot+1, nums.length]
	 * 
	 */
	
	
	public void findNextPermutation(int[] nums)
	{
		int pivotIndex = -1;
		int q = 0;
		
		for(int i = nums.length-1; i>0; i--)
		{
			if(nums[i-1] < nums[i])
			{
				pivotIndex = i-1;
				break;
			}
		}
		if(pivotIndex == -1)
		{
			reverse(nums,0,nums.length-1);
			printArray(nums);
			return;
		}
		for(int j=nums.length-1; j>=pivotIndex+1; j--)
		{
			if(nums[pivotIndex] < nums[j])
			{
				q = j;
				break;
			}
		}

		swap(nums, pivotIndex, q);
		//Reversing
		reverse(nums, pivotIndex+1, nums.length-1);
		printArray(nums);
		
	}
	public void swap(int[] nums,int p,int q)
	{
		int t = nums[p];
		nums[p] = nums[q];
		nums[q] = t;
	}
	public void reverse(int[] nums, int beg, int end)
	{
		while(beg<end)
		{
			swap(nums,beg,end);
			beg++;
			end--;
		}
	}
	public void printArray(int[] nums)
	{
		for(int i = 0; i<nums.length; i++)
		{
			System.out.print(nums[i] + " ");
		}
	}
	public static void main(String[] args) {
		
		NextPermutation arr = new NextPermutation();
		int nums[] = {3,2,1};
		arr.findNextPermutation(nums);
		

	}

}
