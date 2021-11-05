import java.util.HashSet;

public class LinkedListImplementation {
  public static void add(LinkedListNode head, int data) {
    LinkedListNode curr = head;
    while (curr.next != null) {
      curr = curr.next;
    }
    curr.next = new LinkedListNode(data);
  }

  public static void addMultiple(LinkedListNode head, int... dataArr) {
    LinkedListNode curr = head;
    while (curr.next != null) {
      curr = curr.next;
    }
    for (int i = 0; i < dataArr.length; i++) add(curr, dataArr[i]);
  }

  public static void printList(LinkedListNode head) {
    LinkedListNode curr = head;
    while (curr != null) {
      System.out.printf("%d -> ", curr.data);
      curr = curr.next;
    }
    System.out.println("NULL");
  }

  public static boolean containsDuplicates(LinkedListNode head) {
    HashSet<Integer> listValues = new HashSet<>();
    LinkedListNode curr = head;
    while (curr != null) {
      if (listValues.contains(curr.data)) return true;
      else {
        listValues.add(curr.data);
        curr = curr.next;
      }
    }
    return false;
  }

  public static void removeAtIndex(LinkedListNode head, int index) {
    LinkedListNode curr = head;
    LinkedListNode prev = null;
    for (int i = 0; i < index; i++) {
      prev = curr;
      curr = curr.next;
    }
    prev.next = curr.next;
  }

  public static void removeDupsWithBuffer(LinkedListNode head) {
    HashSet<Integer> listValues = new HashSet<>();
    LinkedListNode curr = head;
    LinkedListNode prev = null;
    while (curr != null) {
      if (listValues.contains(curr.data)) {
        prev.next = curr.next;
      } else {
        listValues.add(curr.data);
        prev = curr;
      }
      curr = curr.next;
    }
  }

  public static void removeDupsNoBuffer(LinkedListNode head) {
    LinkedListNode curr = head;
    while (curr != null) {
      LinkedListNode runner = curr;
      while (runner.next != null) {
        if (runner.next.data == curr.data) {
          runner.next = runner.next.next;
        } else {
          runner = runner.next;
        }
      }
      curr = curr.next;
    }
  }
  
  public static void removeKthToLastElement(LinkedListNode head, int listSize, int k) {
    int index = listSize - k;
    removeAtIndex(head, index);
  }
  
  public static void removeKthToLastElement(LinkedListNode head, int k) {
    int listSize = 0;
    LinkedListNode curr = head;
    while (curr != null) {
      listSize++;
      curr = curr.next;
    }

    removeKthToLastElement(head, listSize, k);
  }

  public static void removeNonBeginningOrEndElem(LinkedListNode node) {
    System.out.printf("The node that will be taken out is %d.%n", node.data);
    node.data = node.next.data;
    node.next = node.next.next;

  }
  
  // TODO
  // TEST
  public static void partition(LinkedListNode head, int partitionVal) {
    
  }

  public static void main(String[] args) {
    LinkedListNode head = new LinkedListNode(0);
    addMultiple(head, 1,9,8,7,2,3,4);
    partition(head, 5);
    printList(head);
  }

  public static class LinkedListNode {
    // instance vars
    private int data;
    private LinkedListNode next;

    // constructor
    public LinkedListNode(int data) {
      this.data = data;
      this.next = null;
    }

    // methods
    public int getData() {
      return this.data;
    }

    public void setData(int newData) {
      this.data = newData;
    }

    public LinkedListNode getNext() {
      return this.next;
    }

    public void setNext(LinkedListNode newNext) {
      this.next = newNext;
    }
  }
}
