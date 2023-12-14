package Easy;

class RemoveDuplicatesFromSortedArray {

	public int removeDuplicates(int[] nums) {
		int j = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				nums[j] = nums[i];
				j++;
			}
		}
		return j;
	}
}
// Bad Question. This answer is efficient but does not take into account the
// values after the indexes after new array
