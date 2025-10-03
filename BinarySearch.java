import java.util.Scanner;
public class BinarySearch {
    public static int binarySearch(int[] arr, int key, int st, int end) {
        if (st > end) {
            return -1; 
        }
        int mid = st + (end - st) / 2; 
        if (arr[mid] == key) {
            return mid; 
        } else if (arr[mid] < key) {
            return binarySearch(arr, key, mid + 1, end); 
        } else {
            return binarySearch(arr, key, st, mid - 1);  
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the" + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter target to search: ");
        int key = sc.nextInt();
        int result = binarySearch(numbers, key, 0, n - 1);
        if (result == -1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element " + key + " found at index: " + result);
        }
    }
}
