public class HuffmanList {

    private Item min = null;

    private class Item {
        HuffmanNode node;
        Item next;
    }

    public void insert(HuffmanNode n) {
        Item item = new Item();
        item.node = n;
        item.next = null;
        if (min == null) {
            min = item;
            return;
        }
        item q = null;
        item p = min;
        while (p != null && p.node.frequency < n.frequency) {
            q = p;
            p = p.next;
        }
        if (q == null) {
            item.next = min;
            min = item;
        } else {
            item.next = p;
            q.next = item;
        }
    }

    public HuffmanNode extractMin() {
        if (min == null) {
            return null;
        }
        HuffmanNode n = min.node;
        min = min.next;
        return n;
    }

    public boolean containsAtMostOneItem() {
        return (min == null || min.next == null);
    }

}