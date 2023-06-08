package hashTable;

import java.util.concurrent.CountDownLatch;

import javax.net.ssl.CertPathTrustManagerParameters;

public class ht {
    Node head;
    Node[] massiv = new Node[16];

    public Object replays(Integer key, Integer v){
        int index = key.hashCode()%16;
        if (massiv[index] != null) {
            Node tempNode = massiv[index];
            while (tempNode != null) {
                if (tempNode.key == key) {
                    Integer x = tempNode.value;
                    tempNode.value = v;
                    return x;
                }
                tempNode = tempNode.next;
            }
        } return null;
    }

    public Object get(Integer key){
        int index = key.hashCode()%16;
        if (massiv[index] != null) {
            Node tempNode = massiv[index];
            while (tempNode != null) {
                if (tempNode.key == key) {
                    return tempNode.value;
                }
                tempNode = tempNode.next;
            }
        } return null;
    }

    public Object remove(Integer key){
        int index = key.hashCode()%16;
        if (massiv[index] != null) {
            Node tempNode = massiv[index];
            if (tempNode.key == key && tempNode.next == null){
                massiv[index] = null;
                return tempNode.value;
            }
            if (tempNode.key == key && tempNode.next != null){
                massiv[index] = tempNode.next;
                return tempNode.value;
            }
            while (tempNode.next != null){
                if (tempNode.next.key == key){
                    Integer tmp = tempNode.next.value;
                    tempNode.next = tempNode.next.next;
                    return tmp;
                }
                tempNode = tempNode.next;
            }
        }
        return null;
        }

    public Object put(int v, int k){
        Node temp = new Node();
        temp.value = v;
        temp.key = k;
        temp.hash = temp.key.hashCode()%16;
        if (massiv[temp.hash] != null){
            Node tempNode = massiv[temp.hash];
            while (tempNode != null){
                if (tempNode.key == k){
                    return tempNode.value;
                }
            tempNode = tempNode.next;
            }
            temp.next = massiv[temp.hash];
        }
        massiv[temp.hash] = temp;
        return null;
    }

    public int size(){
	int size = 0;
	Node tmp = massiv[size];
	if (tmp == null) return 0;
	while (tmp != null) { 
	    size++;
	    tmp = tmp.next;
	}
	return size * 16;
	}
    
    public boolean containsKey(Integer key) {
        int index = key.hashCode()%16;
        if (massiv[index] != null) {
            Node tmp = massiv[index];
            while (tmp != null) {
                if (tmp.key == key) {
                    return true;
                }
                tmp = tmp.next;
            }
        } 
        return false;
    }
    
    public boolean containsValue(Integer v) {
	int count = 0;
	int index = massiv[count].key.hashCode()%16;
	    while(count < massiv.length) {
		index = massiv[count].key.hashCode()%16;
		if (massiv[index] != null) {
		    Node tmp = massiv[index];
		    while (tmp != null) {
                        if (tmp.value == v) {
                            return true;
                        }
                        tmp = tmp.next;
                    }
		    count++;
               }	
	    }
	return false;
    }
   
}

class Node{
    Integer value, key;
    int hash;
    Node next;
}
