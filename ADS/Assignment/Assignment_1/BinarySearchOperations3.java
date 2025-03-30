/* Problem  
 Given a sorted array of integers (which may include duplicates), perform the following operations: 
1.	Search for a given key and return its index (if found) with Binary Search. 
2.	Find the first and last occurrence of the key in the array. 
3.	Count the total number of times the key appears. 
4.	Find any peak element in the array (an element greater than its neighbors). 
Input: 
arr = [1, 3, 3, 3, 5, 6, 8], key = 3 
Input for Peak Element: arr =[1, 2, 18, 4, 5, 0] Output: 
Key found at index: 2   
First occurrence: 1   
Last occurrence: 3   
Total count of key: 3   
Peak element: 18 

*/

import java.util.*;

class BinarySearchOperations3 {

    // Binary Search to find any occurrence of key
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid; // Returning any occurrence of key
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Key not found
    }

    // Find the first occurrence of the key
    public static int findFirstOccurrence(int[] arr, int key) {
        int left = 0, right = arr.length - 1, first = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                first = mid;
                right = mid - 1; // Continue searching in the left half
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return first;
    }

    // Find the last occurrence of the key
    public static int findLastOccurrence(int[] arr, int key) {
        int left = 0, right = arr.length - 1, last = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                last = mid;
                left = mid + 1; // Continue searching in the right half
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return last;
    }

    // Count the occurrences of the key
    public static int countOccurrences(int[] arr, int key) {
        int first = findFirstOccurrence(arr, key);
        if (first == -1) {
            return 0; // Key not found
        }
        int last = findLastOccurrence(arr, key);
        return last - first + 1;
    }

    // Find any peak element in the array
    public static int findPeakElement(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean leftCheck = (i == 0 || arr[i] > arr[i - 1]);
            boolean rightCheck = (i == n - 1 || arr[i] > arr[i + 1]);
            if (leftCheck && rightCheck) {
                return arr[i];
            }
        }
        return -1; // Should not occur if there's at least one peak
    }

    // Main method to test the functions
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 3, 3, 5, 6, 8};
        int key = 3;
        int[] arr2 = {1, 2, 18, 4, 5, 0};

        System.out.println("Key found at index: " + binarySearch(arr1, key));
        System.out.println("First occurrence: " + findFirstOccurrence(arr1, key));
        System.out.println("Last occurrence: " + findLastOccurrence(arr1, key));
        System.out.println("Total count of key: " + countOccurrences(arr1, key));
        System.out.println("Peak element: " + findPeakElement(arr2));
    }
}

/* o/p :

Key found at index: 3
First occurrence: 1
Last occurrence: 3
Total count of key: 3
Peak element: 18

*/

 
 
 
 
 
 
 
 
 
 
 
 
