class Node{
    private int val;
    private Node next;

    void setValue(int v, Node node ){
        val = v;
        next = node;
    }
    void getValue(){
        System.out.println();
        return;
    }
}

class LinkedList{
    Node node;

}

public class MidValue {

    public  static void main(String args[]){
        System.out.println("Mid Value of Linked list");
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();
        Node node5 = new Node();

        node1.setValue(1, null);
        node2.setValue(2, node1);
        node3.setValue(3, node2);
        node4.setValue(4, node3);
        node5.setValue(5, node4);
        System.out.println(node1);

    }
}



