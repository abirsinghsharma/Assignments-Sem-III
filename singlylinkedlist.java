import java.util.*;
public class Main{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data; 
            this.next=null;
        }
    }
    public void addFirst(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void delFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
    }
    public void delLast(){
        if (head==null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next==null){ 
            head=null;
            return;
        }
        Node secondLast=head;
        Node last=head.next;
        while(last.next!=null){
            secondLast=secondLast.next;
            last=last.next;
        }
        secondLast.next=null;
    }
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data + "->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    public int getSize(){
        int size=0;
        Node currNode=head;
        while(currNode!=null){
            size++;
            currNode=currNode.next;
        }
        return size;
    }
      public void reverse(){
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args){
        Main list=new Main();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.printList(); 
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.printList(); 
        list.delFirst();
        list.printList(); 
        list.delLast();
        list.printList(); 
        System.out.println("Size: " + list.getSize()); 
        list.printList();
        list.reverse();
        list.printList();
    }
}
