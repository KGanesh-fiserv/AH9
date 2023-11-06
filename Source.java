class Node<T> {
    T val;
    Node<T> next;
    
    public Node(T val) {
      this.val = val;
      this.next = null;
    }
  }
  
  class Source {
    public static <T> Node<T> reverseList2(Node<T> head) {
      Node<T> current = head;
      Node<T> next = null;
      Node<T> prev = null;
      while(current != null){
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
      }
      head = prev;
      return head;
    }
    public static <T> Node<T> reverseList(Node<T> head) {
      Node<T> startNode = head;
      int length = countList(head);
      int count = 0;
      int stopper = length;
      while(count < length){
        while(stopper > 1){
          T temp = head.val;
          head.val = head.next.val;
          head.next.val = temp;
          head = head.next;
          stopper --;
        }
        head = startNode;
        count++;
        stopper = length - count;
      }
      // todo
      return startNode;
    }
    
    private static <T> int countList(Node<T> head) {
      int count = 0;
      while (head != null) {
          count ++;
          head = head.next;            
        }
      return count;
      
    }

    public static <T> void printList(Node<T> head){
      
        while (head != null) {
            System.out.println(head.val);
            head = head.next;            
        }
    }
    public static void main(String[] args) {
      Node<String> x = new Node<>("x");
      Node<String> y = new Node<>("y");
    
      x.next = y; // x -> y
    
      printList(reverseList(x)); // y -> x
      System.out.println("--------------------------------");

      // Test Case 2
      Node<String> a = new Node<>("a");
      Node<String> b = new Node<>("b");
      Node<String> c = new Node<>("c");
      Node<String> d = new Node<>("d");
      Node<String> e = new Node<>("e");
      Node<String> f = new Node<>("f");

      a.next = b;
      b.next = c;
      c.next = d;
      d.next = e;
      e.next = f;
      // a -> b -> c -> d -> e -> f

      printList(reverseList2(a)); // f -> e -> d -> c -> b -> a


    }
  }