public class LinearSearch {
// Function to perform linear search
public static int linearSearch(int[]
arr, int key) {
int n = arr.length;
for (int i = 0; i &lt; n; i++) {
if (arr[i] == key) {
return i; // return index
if element is found
}
}
return -1; // return -1 if element
not found
}
public static void main(String[] args)
{
int[] arr = {7, 4, 5, 62, 2, 2,
6};
int key = 62;
int result = linearSearch(arr,
key);
if (result == -1) {
System.out.println(&quot;Element
not found in the array.&quot;);
} else {
System.out.println(&quot;Element
found at index: &quot; + result);
}
}
}
