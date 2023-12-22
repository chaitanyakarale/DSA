

public class LinkedList {
    public static class Node {
        int Data;
        Node Next;

        public Node(int Data) {
            this.Data = Data;
            this.Next = null;

        }
    }

    public static Node head;
    public static Node tail;
    public static int size = 1;

    public void addFirst(int Data) {
        Node newNode = new Node(Data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.Next = head;

        head = newNode;
        size++;

    }

    public void addLast(int Data) {
        Node newNode = new Node(Data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.Next = newNode;

        tail = newNode;
        size++;

    }

    public void printList() {
        if (head == null) {
            System.out.println("Empty List");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.Data + "->");
            temp = temp.Next;
        }
        System.out.println("null");

    }

    public void addMiddle(int Data, int idx) {
        if (idx == 0) {
            addFirst(Data);
            return;
        }
        Node temp = head;
        Node newNode = new Node(Data);
        int i = 0;
        while (i < idx - 1) {
            temp = temp.Next;
            i = i + 1;
        }
        newNode.Next = temp.Next;
        temp.Next = newNode;
        size++;

    }

    public int removeFirst() {

        if (size == 0) {
            System.out.println("Empty list");
            return Integer.MIN_VALUE;

        } else if (size == 1) {
            int val = head.Data;
            head = tail = null;
            size = 0;
            return val;

        }
        int val = head.Data;

        head = head.Next;
        size--;

        return val;

    }

    public int removeLast() {
        Node temp = head;
        if (size == 0) {
            System.out.println("Empty list");
            return Integer.MIN_VALUE;

        } else if (size == 1) {
            int val = head.Data;
            head = tail = null;
            size = 0;
            return val;

        }
        int val = tail.Data;

        for (int i = 0; i < (size - 2); i++) {
            temp = temp.Next;
        }

        temp.Next = null;
        tail = temp;

        size--;
        return val;

    }

    public int search(int key) {
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            if (temp.Data == key) {
                return idx;

            }
            temp = temp.Next;
            idx = idx + 1;

        }
        return -1;

    }

    public int rsearch(int key, Node temp, int idx) {

        if (temp == null) {
            return -1;
        }

        if (temp.Data == key) {
            return idx;

        } else {

            return rsearch(key, temp.Next, ++idx);
        }

    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.Next;
            curr.Next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void removeFromEnd(int n) {
        // calculate size;
        Node temp = head;
        Node prev = head;
        int sz = 0;
        while (temp != null) {
            temp = temp.Next;
            sz++;
        }
        if (n == sz) {
            head = head.Next;
        }
        int i = 1;

        while (i < sz - n) {
            prev = prev.Next;

        }
        prev.Next = prev.Next.Next;
        return;
    }

    public boolean palindrome() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.Next != null) {
            slow = slow.Next;
            fast = fast.Next.Next;
        }
        if (head == null || head.Next == null) {
            return true;
        }
        Node prev = null;
        Node curr = tail = slow;
        Node next;
        while (curr != null) {
            next = curr.Next;
            curr.Next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        while (right != null) {
            if (left.Data != right.Data) {
                return false;

            }
            left = left.Next;
            right = right.Next;
        }
        return true;
    }

    public static boolean loop() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.Next != null) {
            slow = slow.Next;
            fast = fast.Next.Next;
            if (slow == fast) {
                return true;
            }

        }
        return false;
    }

    public static void removeCycle() {
        // Detect loop
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.Next != null) {
            slow = slow.Next;
            fast = fast.Next.Next;
            if (slow == fast) {
                cycle = true;
                break;
            }

        }
        if (cycle == false) {
            return;
        }

        slow = head;
        // slow=slow.Next;
        // fast=fast.Next;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.Next;
            fast = fast.Next;

        }
        prev.Next = null;

    }

    public Node getMid(Node head) {
        Node slow = head;
        Node fast = head.Next;
        while (fast != null && fast.Next != null) {
            slow = slow.Next;
            fast = fast.Next.Next;
        }
        return slow;
    }

    public Node merge(Node leftHead, Node rightHead) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
        while (leftHead != null && rightHead != null) {
            if (leftHead.Data <= rightHead.Data) {
                temp.Next = leftHead;
                leftHead = leftHead.Next;
                temp = temp.Next;
            } else {
                temp.Next = rightHead;
                rightHead = rightHead.Next;
                temp = temp.Next;
            }

        }
        while (leftHead != null) {
            temp.Next = leftHead;
            leftHead = leftHead.Next;
            temp = temp.Next;

        }
        while (rightHead != null) {
            temp.Next = rightHead;
            rightHead = rightHead.Next;
            temp = temp.Next;

        }

        return mergeLL.Next;

    }

    public Node mergesort(Node head) {
        if (head == null || head.Next == null) {
            return head;
        }
        // find mid
        Node mid = getMid(head);

        // ll and rll

        Node rightHead = mid.Next;
        mid.Next = null;
        Node leftHead = head;
        Node newleft = mergesort(leftHead);
        Node NewRight = mergesort(rightHead);
        return merge(newleft, NewRight);
    }

    public void zigzag() {
        Node mid = getMid(head);
        Node right = mid.Next;
        mid.Next = null;
        Node left = head;
        // reverse
        Node prev = null;
        Node curr = tail = right;
        Node next;

        while (curr != null) {
            next = curr.Next;
            curr.Next = prev;
            prev = curr;
            curr = next;
        }
        right = prev;

        // alternate;
        Node nextL, nextR;
        while (left != null && right != null) {
            nextL = left.Next;
            left.Next = right;
            nextR = right.Next;
            right.Next = nextL;

            right = nextR;
            left = nextL;
        }

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.printList();
        ll.addFirst(2);
        ll.printList();
        ll.addLast(3);
        ll.printList();
        ll.addLast(5);
        ll.printList();
        ll.addMiddle(4, 3);
        ll.printList();
        System.out.println(ll.size);
        System.out.println(ll.removeFirst());
        ll.printList();
        System.out.println(ll.size);
        ll.removeLast();
        ll.printList();
      
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addLast(4);
        ll.addFirst(5);
        ll.addLast(6);
        ll.printList();
        ll.head = ll.mergesort(ll.head);
        ll.printList();
        ll.zigzag();
        ll.printList();
        // System.out.println(ll.loop());

        head = new Node(1);
        head.Next = new Node(2);
        head.Next.Next = new Node(3);
        head.Next.Next.Next = new Node(4);
        head.Next.Next.Next.Next = head.Next;
        System.out.println(loop());
        removeCycle();
        System.out.println(loop());

    }

}
