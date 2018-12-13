// Each entry contains a character and a counter for the character

public class CharacterCounts {

    private Item start; // initialize the start of the list of entries (character,counter).

    private int totalCount = 0; // stores the sum of all counters for all characters in the data structure

    private class Item {
        char character; // given 'Item item = new Item()', we have 'item.character', 'item.counter', 'item.next'
        int counter;
        Item next;
    }

    public void increment(char c) {
        Item p = start;
        while (p != null && p.character != c) { // we search for character c in the list.
            p = p.next; // stop if p == c
        }
        if (p == null) { // we reached the end of the list and c is not found
            Item item = new Item(); //make new item and add c to the start
            item.character = c;
            item.counter = 1;
            item.next = start;
            start = item;
        } else {
            p.counter++; // we found a c
        }
        totalCount++;
    }

    public HuffmanList toHuffmanList() {
        HuffmanList list = new HuffmanList(); // kindly refer to HuffmanList.java
        Item p = start;
        while (p != null) {
            HuffmanNode node = new HuffmanNode(); // kindly refer to HuffmanNode.java
            node.label = String.valueOf(p.character);
            node.frequency = p.counter / (double)totalCount;
            list.insert(node);
            p = p.next;
        }
        return list;
    }
}