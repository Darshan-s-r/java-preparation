class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
		int end = letters.length-1;
		// if(target >= arr[end]) {
		// 	return arr[start];
		// }
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			// if(arr[mid] == target) {
			
			// 	return arr[mid+1];
			// }
			if(target > letters[mid]) {
				start = mid+1;
			}
			else if(target < letters[mid]) {
				end = mid-1;
			}

		}
		return letters[start % letters.length];
    }
}