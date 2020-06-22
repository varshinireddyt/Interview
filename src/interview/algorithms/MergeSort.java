package interview.algorithms;

public class MergeSort {
	
	  /* MergeSort Algorithm:
	  1. Divide the array into subarrays
	  2. Consider the midpoint and divide it accordingly unitl each subarray has one element.
	  3. Sort the subarrays and merge the arrays.
	  */
	public void doSort(int[] arr, int beg, int end) //dividing the array into the subarray
	{
	 //length of the array
	  if(  beg < end)
	  {
	    int mid = (beg+end)/2;
	    doSort(arr, beg, mid);
	    doSort(arr, mid+1, end);
	    doMerge(arr, beg, mid, end);
	  }
	  
	}

	public void doMerge(int[] arr, int beg, int mid, int end)
	{
	  int length = mid-beg+1; //length of subarray
	  int length2 = end - mid;
	  int[] arr1 = new int[length];
	  int[] arr2 = new int[length2];

	  for(int i = 0; i < length; ++i)
	    arr1[i] = arr[beg + i];
	  for(int j = 0; j < length2; ++j)
	    arr2[j] = arr[j+1+mid];

	    int i = 0;
	  	int j = 0;
	  	int k = beg;

	    while(i < length && j < length2)
			{
				if(arr1[i] <= arr2[j])
					{
						arr[k] = arr1[i];
						System.out.println("Index: " + k + "Value" + arr[k]);

						i++;
					}

					else
					{

						arr[k] = arr2[j];
						System.out.println("Index: " + k + "Value" + arr[k]);

						j++;
					}
				k++;

			}
		while (i < length)
			{
				arr[k] = arr1[i];
				System.out.println("Index: " + k + "Value" + arr[k]);
				k++;
				i++;
			}
		while (j< length2)
			{
				arr[k] = arr2[j];
				System.out.println("Index: " + k + "Value" + arr[k]);
				k++;
				j++;
			}


	}

	public static void printArray(int arr[])
	{
	  int n = arr.length;
	  for(int i=0; i<n; i++)
	  {
	    System.out.print(arr[i] + " ");
	    System.out.println();
	  }
	}
	
	public static void main(String[] args) {

		  MergeSort mer = new MergeSort();
		  int arr[] = {5,2,4,10,9,0, 9};
		  System.out.println("unsorted array");
		    printArray(arr);
		  mer.doSort(arr, 0, arr.length-1);
		  System.out.println("sorted array");
		  printArray(arr);
		
	}

}
