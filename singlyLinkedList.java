class node
{
	private node next;
	private int value;
	
	public node getNext() {
		return next;
	}
	public void setNext(node next) {
		this.next = next;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public node(node n, int value)
	{
		this.next=n;
		this.value=value;
	}
	public node(int value)
	{
		this.value=value;
		this.next=null;
	}
}

public class singlyLinkedList
{
	private node head = null;
	
	public singlyLinkedList(int value)
	{
		head = new node(value);
	}
	
	public void addAtHead(int i)
	{
		node temp = head;
		head = new node(i);
		head.setNext(temp);
	}
	public void addAtTail(int i)
	{
		node temp = head;
		while(temp.getNext()!=null)
			temp=temp.getNext();
		temp.setNext(new node(i)); 
	}	
	public void traverse()
	{
		node temp= head;
		System.out.println("Linked List-->");
		while(temp !=null)
		{
			System.out.println(temp.getValue());
			temp=temp.getNext();
		}
	}
	public void deleteAtIndex(int index)
	{
		node temp=head;
		for(int i=1;i<=index-2 && temp.getNext()!=null;i++)
			temp=temp.getNext();
		temp.setNext(temp.getNext().getNext());
	}
	public void deleteByValue(int value)
	{
		node temp=head;
		while(temp.getNext()!=null)
		{
			if(temp.getNext().getValue()==value)
			{	
				temp.setNext(temp.getNext().getNext());
				break;
			}
			temp=temp.getNext();
		}
	}
	
	public static void main(String[] args)
	{
		singlyLinkedList linkedlist = new singlyLinkedList(10);
		linkedlist.addAtHead(15);
		linkedlist.addAtTail(13);
		linkedlist.addAtTail(14);
		linkedlist.addAtTail(17);
		linkedlist.traverse();
		linkedlist.deleteAtIndex(3);
		linkedlist.traverse();
		linkedlist.deleteByValue(14);
		linkedlist.traverse();
	}
}