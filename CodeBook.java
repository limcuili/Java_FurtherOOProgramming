// a data structure which can store an arbitrary number of
// characters together with their codewords

public class CodeBook {

    private Item start = null;
    private int length = 0;

    private class Item {
        char character;
        String codeword;
        Item next;
    }

    public void insert(char s, String c) {
        length++;
        Item item = new Item();
        item.character = s;
        item.codeword = c;
        item.next = null;
        if (start == null) {
            start = item;
            return;
        }
        Item q = null;
        Item p = start;
        while (p != null && p.character < item.character) {
            q = p; // q stores the largest p s.t. p.character < item.character
            p = p.next; // p ends up being s.t. p.character >= item.character
        }
        if (q == null) { // either list is empty or item.character < p.character. So put item in front of list.
            item.next = start;
            start = item;
        } else {
            item.next = p; // insert item before p
            q.next = item; // insert item after q, ie. q -> item -> p
        }
    }

    public String codeFor(char s) {
        Item p = start;
        while (p != null && p.character != s) {
            p = p.next;
        }
        if (p == null) {
            return null;
        } else {
            return p.codeword;
        }
    }

    public void print() {
        Item p = start;
        while (p != null) {
            System.out.println(p.character + "->" + p.codeword);
            p = p.next;
        }
    }

    public int length() { return length; }

}