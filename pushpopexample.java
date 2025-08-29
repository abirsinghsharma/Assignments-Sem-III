import java.util.*;
public class Main{
    Node head; //head is top
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data; 
            this.next=null;
        }
    }
    public void push(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void pop(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
    }
     public void printStack() {
        if (head == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("");
    }
    public static void main(String[] args){
        Main stack=new Main();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack(); 
        stack.pop();
        stack.printStack(); 
        stack.pop();
        stack.pop();
        stack.printStack(); 
        
    }
}








