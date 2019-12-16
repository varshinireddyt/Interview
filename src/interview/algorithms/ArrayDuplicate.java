package interview.algorithms;

public class ArrayDuplicate {
	//Solution for Leetcode: Remove Duplicates from Sorted Array;
	//Time Complexity: O(n)

	public int removeDuplicate(int[] arr)
	{
		int length = arr.length;
		if(length == 0 || length == 1)
		{
			return length;
		}
		int count=0;
		for(int i=0;i<length-1;i++)
		{
			if(arr[i] != arr[i+1])
			{
				arr[count++] = arr[i];
				System.out.println(arr[count]);
			}	
			arr[count++] = arr[length-1];
	     }
		return count;
	}
	
	public static void main(String[] args) {
		
		ArrayDuplicate rem = new ArrayDuplicate();
		int arr[] = {1,1,2};
		System.out.println("new array: " + rem.removeDuplicate(arr));

	}

}
