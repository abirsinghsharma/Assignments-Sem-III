import java.util.*;
public class InsertionSort {
public static void insertionsort(int[]
arr) {
int n = arr.length;
for (int i = 1; i &lt; n; i++) {
int key = arr[i];
int j = i - 1;
while (j &gt;= 0 &amp;&amp; arr[j] &gt; key)
{
arr[j + 1] = arr[j];
j--;
}
arr[j + 1] = key;
}
}
public static void main(String[] args)
{
int[] arr = {1,3,5,7,9,2,4,6,8,0};
insertionsort(arr);
for (int num : arr) {
System.out.print(&quot; &quot; + num);
}
}
}
