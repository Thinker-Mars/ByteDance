package judgeLinkedListCircle;

import java.util.HashSet;
import java.util.Set;


/**
 * 单向链表
 * @author Cone
 * @since 2019年7月27日
 *
 */
public class SingleLinkedList {
	private Node head;//标识头节点
	private int size;//标识链表中节点个数
	
	public SingleLinkedList() {
		this.size = 0;
		this.head = null;
	}
	
	//node类
	private class Node{
		private Object data;//每个节点的数据
		private Node next;//指向下一个节点的链接
		
		public Node(Object data) {
			this.data = data;
		}
	}
	
	/**
	 * 将节点插入链表
	 * @param data 带插入的值
	 */
	public void add(Object data) {
		Node temp = head;
		if (size == 0) {
			head = new Node(data);
			size++;
			return;
		}
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = new Node(data);
		size++;
	}
	
	/**
	 * 从头开始遍历节点
	 */
	public void display() {
		if (size > 0) {
			Node node = head;
			if (size == 1) {
				System.out.println("[" + node.data + "]");
				return;
			}
			while (node != null) {
				System.out.println(node.data);
				node = node.next;
			}
		} else {
			System.out.println("[]");
		}
	}
	
	/**
	 * 根据索引得到链表的某个节点的值
	 * @param key
	 * @return
	 */
	public Object getNode(int key) {
		
		if (key < 0 || key > size - 1) {
			throw new ArrayIndexOutOfBoundsException("越界！");
		} else {
			Node temp = head;
			int count = 0;
			while (temp != null) {
				if (count == key) {
					return temp.data;
				}
				temp = temp.next;
				count++;
			}
			
		}
		return null;
	}
	
	
	/**
	 * 从头开始，依次与给定索引位置的节点的值进行比较，如果相同，则返回true，否则false
	 * @param key
	 * @return
	 */
	public boolean havaSameElement(int key) {
		boolean flag = false;
		int count = 0;
		Node temp = head;
		while (temp != null && count < key) {
			if (temp.data == getNode(key)) {
				flag = true;
				return flag;
			}
			count++;
			temp = temp.next;
		}
		return flag;
		
	}
	
	/**
	 * 方式1
	 * @return
	 */
	public boolean isAnnulate1() {
		boolean flag = false;
		for (int i = 1; i < size; i++) {
			if (havaSameElement(i)) {
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	
	/**
	 * 方式2
	 * @return
	 */
	public boolean isAnnulate2() {
		boolean flag = false;
		Set<Object> set = new HashSet<>();
		Node temp = head;
		while (temp != null) {
			if (!set.add(temp.data)) {
				flag = true;
				break;
			}
			temp = temp.next;
		}
		return flag;

	}
	
	public Node getIntersect() {
		Node temp = head;
		Node tortoise = temp;
		Node rabbit = temp;
		while (rabbit != null && rabbit.next != null) {
			tortoise = tortoise.next;
			rabbit = rabbit.next.next;
			if (tortoise == rabbit) {
				return tortoise;
			}
		}
		return null;
	}
	
	/**
	 * 方式3
	 * @return
	 */
	public Object isAnnulate3() {
		Node temp = head;
		if (temp == null) {
			return null;
		}
		Node intersect = getIntersect();
		if (intersect == null) {
			return null;
		}
		Node startNode = head;
		while (startNode != intersect) {
			startNode = startNode.next;
			intersect = intersect.next;
		}
		return startNode.data;
		
	}

}
