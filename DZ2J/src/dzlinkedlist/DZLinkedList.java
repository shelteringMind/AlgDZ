//Необходимо реализовать метод разворота связного списка (двухсвязного или односвязного на выбор).
package dzlinkedlist;

public class DZLinkedList{
    
    protected Node head;
    protected Node tail;

    public String get(int item){
        if (item > size()){throw new ArrayIndexOutOfBoundsException();}
        Node tmp = head;
        while (item > 0){
            tmp = tmp.next;
            item--;
        }
        return tmp.value;
    }

    public int size(){
        int size = 1;
        if (head == null) return 0;
        Node tmp = head;
        while (tmp.next != null){
            tmp = tmp.next;
            size++;
        }
        return size;
    }

    public void remove(Node node){
	Node previous = node.previous;
	Node next = node.next;
	if(previous == null) {
	    next.previous = null;
	    head = next;
	} else if (next == null) {
	    previous.next=null;
	    tail = previous;
	} else {
	    next.previous = previous;
	    previous.next = next;
	}
    }

    public void addFirst(String str){
        Node node = new Node();
        node.value = str;
        if (head != null){
            if (size() == 1) {
                tail = head;}
            node.next = head;
            head.previous = node;
        }
        head = node;
    }
    
    public void addEnd(String str){
        Node node = new Node();
        node.value = str;
        if (tail != null){
            if (size() == 1) {
                head = tail;}
            node.previous = tail;
            tail.next = node;
        }
        tail = node;
    }
    
    public void reversLL(){
	Node node = new Node();
	node = head;
	while(node!=null) {
	    Node previous = node.previous;
	    Node next = node.next;
	    node.next = previous;
	    node.previous = next;
	    if(previous == null) {
		tail = node;
	    }
	    if(next == null) {
		head = node;
	    }
	    
	    node = next;
	}
    }

    class Node{
        public String value;
        public Node next;
        public Node previous;
    }
}
    