public class HashMap {
    class ListNode {
        int key, val;
        ListNode next;

        ListNode(int key, int val) {
            this.key = key;
            this.val = val;
        }

    }

    final ListNode[] nodes = new ListNode[10000];

    private int index(int key) {
        return Integer.hashCode(key) % nodes.length;
    }

    private ListNode find(ListNode bucket, int key) {
        ListNode node = bucket, prev = null;
        while (node != null && node.key != key) {
            prev = node;
            node= node.next;
        }
        return prev;
    }

    public void put(int key, int value) {
        int i = index(key);
        if (nodes[i] == null) {
            nodes[i] = new ListNode(-1, -1);
        }
        ListNode prev = find(nodes[i], key);
        if (prev.next == null) {
            prev.next = new ListNode(key, value);
        } else {
            prev.next.val = value;
        }
    }

    public int get(int key) {
        int i = index(key);
        if (nodes[i] == null) {
            return -1;
        }

        ListNode node = find(nodes[i], key);
        if (node.next == null) {
            return -1;
        } else {
            return node.next.val;
        }
    }

    public void remove (int key) {
        int i = index(key);
        if (nodes[i] == null) {
            return;
        }
        ListNode prev = find(nodes[i], key);
        if (prev.next == null) {
            return;
        }
        prev.next = prev.next.next;
    }
}


class HashMapTest {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        System.out.print(hashMap.get(1)); // returns 1
        System.out.print(", " + hashMap.get(3)); // returns -1 (not found)
        hashMap.put(2, 1);          // update the existing value
        System.out.print(", " + hashMap.get(2)); // returns 1
        hashMap.remove(2);          // remove the mapping for 2
        System.out.print(", " + hashMap.get(2)); // returns -1 (not found)
    }
}


