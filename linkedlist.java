import java.util.Scanner;

public class Main {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    public void addData(int data) {
        Node newdata = new Node(data);
        if (head == null) {
            head = newdata;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newdata;
        }
    }
    public void printData() {
        Node currentNode = head;
        System.out.println("Linked List:");
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Main list = new Main(); 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements to store:");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int data = scanner.nextInt();
            list.addData(data); 
        }
        list.printData();
        scanner.close();
    }
}
