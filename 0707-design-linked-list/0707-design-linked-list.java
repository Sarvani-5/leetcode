class MyLinkedList {
    Node head;
    class Node{
        int val;
        Node next;
        Node(int data){
            val = data;
            next = null;
        }
    }
    public MyLinkedList() {
        head = null;
    }
    
    public int get(int index) {
        int i = 0;
        Node curr = head;
        while(curr!=null){
            if(index==i){
                return curr.val;
            }
            curr = curr.next;
            i++;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if (head==null){
            head = newNode;
            return;
        }
        Node curr = head;
        newNode.next = curr;
        head = newNode;
        
    }
    
    public void addAtTail(int val) {
        
        Node newNode = new Node(val);
        if (head==null){
            head = newNode;
            return;
        }
        Node curr = head;
    while(curr.next!=null){
        curr = curr.next;
    }
    curr.next = newNode;
        
    }
    
      public void addAtIndex(int index, int val) {
        if (index < 0)
            return;

        Node newNode = new Node(val);
        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node curr = head;
        int i = 0;
        while (curr != null && i < index - 1) {
            curr = curr.next;
            i++;
        }

        if (curr == null)
            return;

        newNode.next = curr.next;
        curr.next = newNode;
    }

    public void deleteAtIndex(int index) {
        if (index < 0)
            return;

        if (index == 0) {
            if (head != null)
                head = head.next;
            return;
        }

        Node curr = head;
        int i = 0;
        while (curr != null && i < index - 1) {
            curr = curr.next;
            i++;
        }

        if (curr == null || curr.next == null)
            return;

        curr.next = curr.next.next;
    }
}



/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */