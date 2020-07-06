package interview.leetcode;

public class Rotated {
	
	//LeetCode: Search in Rotated Sorted Array
	
	public int search(int[] nums, int target) {
		int start = 0;
		int end = nums.length-1;
		while(start<end) {
			int mid = (start + end)/2;
			if(nums[mid] > nums[end]) {
				if(target > nums[mid] || target <= nums[end]) {
					start = mid + 1;
				}
				else {
					end = mid;
				}
			}
			else {
				if(target > nums[mid] && target <= nums[end]) {
					start = mid + 1;
				}
				else {
					end = mid;
				}
			}
		}
		if(start != end || target != nums[start]) {
			return -1;
		}
		return start;
		 
	}
	

	public static void main(String[] args) {
		
		Rotated sort = new Rotated();
		int nums[] = {1,2};
		System.out.println("position : " + sort.search(nums,1));
		
	}

}
