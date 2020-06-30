package interview.algorithms;

public class SelectionSort {
	
	/* 1. array of unsorted elements.
	 2. assume a minimum value and compare it with every elements.
	 3. swap the position of the minimum value with the starting index.
	 4. continue the iteration by swapping the values.
	 */
	// 1. for iteration starting with i=0 to array length
	// 2. assume i  value as minimum value
	// 3. compare i index (minimum value) value with all the elements in the array.
	// 4. swap the minimum value with the index position.
	
	
	
	public void doSorting(int[] nums)
	{
		int length = nums.length;
		for(int i=0; i<length; i++)
		{
//			int minimum = nums[i];
			for(int j=i+1; j<length; j++)
			{
				if(nums[j] < nums[i])
				{
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
					
				}
			}
		}
	
	}
	//time complexity: O(n square)
	
	public void printArray(int[] nums)
	{
		for(int i=0; i<nums.length; i++)
		{
			System.out.print(nums[i]);
			System.out.println();
		}
	}
	


	public static void main(String[] args) {
		
		SelectionSort select = new SelectionSort();
		
		int arr[] = {4,5,20,2,10};
		
		select.doSorting(arr);
		select.printArray(arr);
	}

}
