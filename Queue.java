import java.util.*;
public class Main {
    public static final int max = 7;
    public static int[] arr = new int[max];
    public  static int r = -1;
    public  static int f = -1;
    
    public void enq(int d) {
        if (r == max - 1) {
            System.out.println("overflow");
            return;
        }
        if (f == -1) {
            f = 0;
        }
        r++;
        arr[r] = d;
        System.out.println("added " + d);
    }
    
    public void deq() {
        if ((f == -1 && r == -1) || f > r) {
            System.out.println("underflow");
            return;
        }
       
        System.out.println("removed " + arr[f]);
        f++;
        if (f > r) {
           System.out.println("no");
        }
    }
    public void prin(){
                 for (int c=f; c<=r;c++){
                System.out.print(arr[c]);
                 }
    }
    public static void main(String[] args) {
        Main qu = new Main();
        qu.enq(10);
        qu.enq(20);
        qu.enq(30);
        qu.enq(40);
        qu.enq(50);
        qu.enq(60);
        qu.enq(70);
        qu.enq(80);
        qu.deq();
        qu.deq();
        qu.prin();
    }
}
