package Pertemuan3;

public class StrukturList {
    Node head;


    public void addTail(int data) {
    Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }else {
            Node posNode =null;
            Node curNode = head;

            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();

            }
            posNode.setNext(newNode);
        }
    }

    public void addHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }


    public void displayElement() {
        Node curNode = head;
        System.out.println("Display Element: ");

        while (curNode != null) {
            System.out.print(curNode.getData() + ", ");
            curNode = curNode.getNext();
        }
    }
}
