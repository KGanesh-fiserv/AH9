class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class ECSource {
  public static <T> boolean isUnivalueList(Node<T> head) {
    if(head.next == null){
      return true;
    }
    else if(!head.next.val.equals(head.val)){
     return false;
    }
    return isUnivalueList(head.next);
  }

  public static void main(String[] args) {
        Node<String> z = new Node<>("z");
        // z

        // Printing solution
        System.out.println((ECSource.isUnivalueList(z)));

        //Test Case 2
        Node<Integer> u = new Node<>(2);
        Node<Integer> v = new Node<>(2);
        Node<Integer> w = new Node<>(2);
        Node<Integer> x = new Node<>(2);
        Node<Integer> y = new Node<>(2);

        u.next = v;
        v.next = w;
        w.next = x;
        x.next = y;

        // 2 -> 2 -> 2 -> 2 -> 2
        System.out.println((ECSource.isUnivalueList(u)));

        //Test Case 3
        Node<Integer> a = new Node<>(2);
        Node<Integer> b = new Node<>(2);
        Node<Integer> c = new Node<>(3);
        Node<Integer> d = new Node<>(3);
        Node<Integer> e = new Node<>(2);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

    // 2 -> 2 -> 3 -> 3 -> 2
    System.out.println((ECSource.isUnivalueList(a)));
    }
}
