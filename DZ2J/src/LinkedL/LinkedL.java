//Необходимо реализовать метод разворота связного списка (двухсвязного или односвязного на выбор).
package LinkedL;

public class LinkedL{
    
    private Node head;
    private Node tail;

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

    public void remove(){
        if (head != null)
            head = head.next;
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
    
    public void revers(LinkedL list){
	for(int i = list.size();i > 0;i++) {
	    }
	}

    class Node{
        public String value;
        public Node next;
        public Node previous;
    }
}