import java.util.LinkedList;

public class MyLinkedList implements MyLists {


    private Node head = null;
    private Node tail = null;
    private int size = 0;

    @Override
    public void add(Person person) {
        Node node = new Node(person, tail, null);
        size = size + 1;
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        node.getPrev().setNext(node);   // noda которую мы делаем, обратись к предыдущей ноде и запиши меня в предыдущей ноте как следующую.
        tail = node;
    }

    @Override
    public Person get(int index) {
        if (index < 0 || index > size) {
            return null;
        }
        int count = 0;
        Node currentNode = head;
        while (count < index) {
            currentNode = currentNode.getNext();
            count = count + 1;
        }
        return currentNode.getPerson();
    }

    @Override
    public int size() {
        return size;
    }
}
