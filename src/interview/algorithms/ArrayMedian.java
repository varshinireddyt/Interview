package interview.algorithms;

public class ArrayMedian {
	//My Solution for LeetCode: Median of Two Sorted Array.
	//Time Complexity: O(nlogn)
	//This code uses concept of MergeSort algorithm.
	//Reference: geeksforgeeks
	
	/*
	 * 1. Merge two arrays in a sorting order of size  m+n
	 * 2. consider two arrays apply merge sort algorithm
	 * 3. If a[i] < b[j]  then c[k] = a[i], i++, k++
	 * 4. Else a[i] > b[j] then c[k] = b[j], j++, k++
	 * 
	 */
	 
	public double[] doMergeSort(int[] nums1, int[] nums2)
	{
		int i = 0;
		int j = 0;
		int k = 0;
		
		int m = nums1.length;
		int n = nums2.length;
		
		double[] nums3 = new double[m+n];
		
		while(i < nums1.length && j < nums2.length)
		{
			if(nums1[i] < nums2[j])
				{
					nums3[k] = nums1[i];
					System.out.println("Index: " + k + "Value" + nums3[k]);
					
					i++;
				}
				
				else
				{
					
					nums3[k] = nums2[j];
					System.out.println("Index: " + k + "Value" + nums3[k]);
					
					j++;
				}
			k++;
			
		}
		while (i < m)
		{
			nums3[k] = nums1[i];
			System.out.println("Index: " + k + "Value" + nums3[k]);
			k++;
			i++;
		}
		while (j< n)
		{
			nums3[k] = nums2[j];
			System.out.println("Index: " + k + "Value" + nums3[k]);
			k++;
			j++;
		}
		return nums3;
	}
	
	public double doMedian(int[] nums1, int[] nums2)
	{
		double[] nums = doMergeSort(nums1,nums2);
		
		int length = nums.length;
		int m = (length/2) - 1;
		int n = length/2;
		if(length%2 == 0)
		{
			return (nums[m]+ nums[n])/2;
			
		} else {
			return (nums[n]);
		}
	}
		
	
	public static void main(String[] args) {
		
		ArrayMedian med = new ArrayMedian();
		int arr[] = {1,3};
		int arr1[] = {2};
//		med.doMergeSort(arr, arr1);
		System.out.println("Median " + med.doMedian(arr, arr1));

	}

}
