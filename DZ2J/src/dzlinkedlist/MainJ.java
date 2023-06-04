package dzlinkedlist;

public class MainJ {
    public static void main(String[] args) {

	DZLinkedList pr = new DZLinkedList();
        pr.addFirst("Java1");
        pr.addFirst("Java2");
        pr.addFirst("Java3");
        pr.addFirst("Java4");
        pr.addEnd("JavaEnd");
        for (int i = 0; i < pr.size(); i++) {
            System.out.println(pr.get(i));
        }
        pr.reversLL();
        for (int i = 0; i < pr.size(); i++) {
            System.out.println(pr.get(i));
        }
    }
}