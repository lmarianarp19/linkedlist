package linked_list;

public class LinkedList {
    public Node head;

    public LinkedList(Node head){
        this.head = head;
    }

    public static void printValues(LinkedList linkedList){
//        set next to the next value of the head node
//        Node next = likedList.head.next;
        Node actualNode = linkedList.head;
        while (actualNode != null){
//            print the value
            System.out.println(actualNode.data);
//            update the node
            actualNode = actualNode.next;
        }


    }

    public static void main(String [ ] args){
//        create the nodes

        Node five = new Node(5, null);
        Node four = new Node(4, five);
        Node three = new Node(3, four);
        Node two = new Node(2, three);
        Node one = new Node(1, two);

//        create the new linked_list
        LinkedList mainList = new LinkedList(one);



        printValues(mainList);




    }


}
