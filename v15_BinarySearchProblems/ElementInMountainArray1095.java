package v15_BinarySearchProblems;

public class ElementInMountainArray1095 {

    // https://leetcode.com/problems/find-in-mountain-array/

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 5, 4, 3};
        int target = 4;
        int result = findInMountainArray(target, arr);
        System.out.println(result); // Print the result
    }

    public static int findInMountainArray(int target, int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int peak = peekElement(arr, start, end);
        int firstTry = binary_search(target, arr, start, peak);

        if (firstTry != -1) {
            return firstTry;
        }

        // Perform binary search on the descending part of the array
        return binary_search(target, arr, peak + 1, end);
    }

    public static int peekElement(int[] arr, int start, int end) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int binary_search(int target, int[] arr, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1; // Target not found
    }
}


