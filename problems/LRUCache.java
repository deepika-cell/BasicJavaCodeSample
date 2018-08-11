package problems;

import java.util.HashMap;
import java.util.Map;

class Node
{
	int key;
	int value;
	Node prev;
	Node next;
	
	public Node(int key,int value)
	{
		this.key = key;
		this.value=value;
	}
}

public class LRUCache
{
	Map<Integer, Node> map = new HashMap<Integer, Node>(); 
	private int capacity;
	Node head = null;
	Node end = null;
	
	public LRUCache(int capacity)
	{
		this.capacity = capacity;
	}
	public int get(int key)
	{
		if(map.containsKey(key))
		{
			Node node = map.get(key);
			deleteNode(node);
			makeHead(node);
			return node.value;
		}
		return -1;
	}
	
	public void set(int key, int value)
	{
		if(map.containsKey(key))
		{
			Node oldNode = map.get(key);
			oldNode.value = value;
			deleteNode(oldNode);
			makeHead(oldNode);
		}
		else
		{
			Node newNode = new Node(key,value);
			if(map.size()>=capacity)
			{
				map.remove(end.key);
				deleteNode(end);
			}
			makeHead(newNode);
			map.put(key,newNode);
		}
	}
	
	private void deleteNode(Node node)
	{
		if(node.prev!=null)
			node.prev.next = node.next;
		else
			head = node.next;
		if(node.next!=null)
			node.next.prev=node.prev;
		else
			end=node.prev;
	}
	
	private void makeHead(Node node)
	{
		node.prev=null;
		node.next=head;
		if(head!=null)
			head.prev = node;
		head=node;

		if(end==null)
			end=node;
	}
}