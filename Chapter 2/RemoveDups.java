public class RemoveDups {
  public static void main(String[] args) {
    LinkedList list = new LinkedList(1,2,3);
    list.printList();
  }
  
  public static class LinkedList {
    // instance variables
    private LinkedListNode head = null;
    private int size = 0;

    // constructor (default constructor unnecessary)

    // TEST
    public LinkedList(int... args) {
      for (int i = 0; i < args.length; i++) {
        this.addNode(args[i]);
        this.size++;
      }
    }

    // methods

    // TEST
    public void printList() {
      LinkedListNode curr = this.head;
      while (curr != null) {
        System.out.printf("%i -> ", curr.data);
        curr = curr.next;
      }
      System.out.println("NULL");
    }

    // TEST
    public void addNode(int data) {
      if (head == null) {
        head = new LinkedListNode(data);
        return;
      }

      while (head != null) {
        head = head.next;
      }
      head.next = new LinkedListNode(data);
    }

    // TEST
    public LinkedListNode getHead() {
      return this.head;
    }

    // TEST
    public int getSize() {
      return this.size;
    }

    // TODO
    public void removeDups() {
      
    }

    // TOD0
    public void removeDupsNoBuffer() {
      
    }

    // LinkedListNode class
    class LinkedListNode {
      LinkedListNode next;
      int data;

      public LinkedListNode(int data) {
        this.data = data;
      }
    }
  }
}
