public class SelectionSort {
public static void selectionSort(int[]
arr) {
int n = arr.length;
for (int i = 0; i &lt; n - 1; i++) {
int minIndex = i;
for (int j = i + 1; j &lt; n;
j++) {
if (arr[j] &lt;
arr[minIndex]) {
minIndex = j;
}
}
int temp = arr[minIndex];
arr[minIndex] = arr[i];
arr[i] = temp;
}
}
public static void main(String[] args)
{
int[] arr = {5,6,2,4,1,3};
selectionSort(arr);
System.out.println(&quot;Selection
Sort:&quot;);
for (int num : arr)
System.out.print(num + &quot; &quot;);
}
}
