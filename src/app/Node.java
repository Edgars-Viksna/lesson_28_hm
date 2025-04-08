package app;

public class Node {

    private Person person;
    private Node prev;
    private Node next;

    public Node(Person person, Node prev, Node next) {
        this.person = person;
        this.prev = prev;
        this.next = next;
    }

    public Person getPerson() {
        return person;
    }

    public Node getPrev() {
        return prev;
    }

    public Node getNext() {
        return next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
