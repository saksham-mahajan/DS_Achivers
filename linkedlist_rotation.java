package assignments;
import java.util.Scanner;



public class linkedlist_rotation {
	Node head;
	static class Node {
		int data;
		Node next;
		Node(int d) {
			data = d;
			next=null;
		}
	}
	public static linkedlist_rotation insert(linkedlist_rotation li,int d) {
		Node newNode = new Node(d);
		newNode.next = null;
		if (li.head == null) {
			li.head = newNode;
		} else {
			Node last = li.head;
			while (last.next != null) {
				last = last.next;

			}
			last.next = newNode;
		}
		return li;
	}
	public static void main(String arg[]) {
		linkedlist_rotation li=new linkedlist_rotation();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of elements");
		int n=sc.nextInt();
		System.out.println("Enter the Elements");
		for(int i=0;i<n;i++) {
			int d=sc.nextInt();
			insert(li,d);
		}
		System.out.println("Enter the value of k");
		int k=sc.nextInt();
		rotate(li,k);
		System.out.println("Linked List after Rotation");
		display(li);
	}
	private static void display(linkedlist_rotation li) {
		Node temp=li.head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}

	}
	public static linkedlist_rotation rotate(linkedlist_rotation li, int k) {
		while(k!=0) {
			Node temp=li.head;
			Node temp1=li.head;
			while(temp.next.next!=null) {
				temp=temp.next;
			}
			temp.next.next=li.head;
			li.head=temp.next;
			temp.next=null;
			k--;
		}
		return li;
	}
}
