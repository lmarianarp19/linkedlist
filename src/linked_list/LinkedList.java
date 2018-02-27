package linked_list;

public class   LinkedList {
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
        System.out.println("End");
    }

    public static void insert(Node node, LinkedList linkedList){
//        TODO do i need a node parameter?
        Node head_before = linkedList.head;
        linkedList.head = node;
        node.next = head_before;

    }



    public static boolean check_value(LinkedList linkedList, int value){
        Node actual_node = linkedList.head;
        while(actual_node != null) {
            if(value == actual_node.data){
                return true;
            } else {
                actual_node = actual_node.next;
            }
        }
        return false;

    }

    public static int get_max(LinkedList linkedList){
        int max = linkedList.head.data;
        Node actual_node = linkedList.head;
        while(actual_node != null){
            if (actual_node.data > max) {
                max = actual_node.data;
            }
            actual_node = actual_node.next;

        }
        return max;
    }

    public static int get_min(LinkedList linkedList){
        int min = linkedList.head.data;
        Node actual_node = linkedList.head;
        while(actual_node != null){
            if (actual_node.data < min) {
                min = actual_node.data;
            }
            actual_node = actual_node.next;

        }
        return min;
    }

    public static int len(LinkedList linkedList){
        Node actual_node =  linkedList.head;
        int count = 0 ;
        while(actual_node != null){
            count ++;
            actual_node = actual_node.next;
        }
        return count;

    }

    public static int get_n(LinkedList linkedList, int n ){
        if(n <= len(linkedList) ){
            int count = 0;
            Node actual_node = linkedList.head;
            for (int i = 0; i != n; i ++){
                actual_node = actual_node.next;
            }
            return actual_node.data;
        }else{
            return -1;
        }
    }

    public static void insert_ascending(LinkedList linkedList, int a ){
        if( a < linkedList.head.data){
            Node new_node = new Node(a, linkedList.head);
            linkedList.head = new_node;
        } else {
            Node before = linkedList.head;
            Node current_node = before.next;
            while (current_node.data < a ) {
//                TODO case when the biggest is a
                before = current_node;
                current_node = current_node.next;
            }
            System.out.println("before "+before.data);
            System.out.println(current_node.data);
            Node new_node = new Node(a, current_node);
            before.next = new_node;

        }
    }

    public static void main(String [ ] args){
//        create the nodes

        Node five = new Node(20, null);
        Node four = new Node(17, five);
        Node three = new Node(11, four);
        Node two = new Node(6, three);
        Node one = new Node(1, two);


//        create the new linked_list
        LinkedList mainList = new LinkedList(one);

        printValues(mainList);
        System.out.println(get_n(mainList,7));
        insert_ascending(mainList, 7);
        printValues(mainList);


    }




}
