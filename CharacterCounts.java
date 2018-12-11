// Each entry contains a character and a counter for the character

public class CharacterCounts {

    private int totalCount = 0; // stores the sum of all counters for all characters in the data structure
    
    public void increment(char c) {
    //determines whether there is already an entry for the character c;
    // if this is not the case it inserts a new entry for c and sets its counter to 1;
    // otherwise it increases the counter for c by one.
    }

    public HuffmanList toHuffmanList() {
        // first creates an empty HuffmanList list, then creates for each entry with character ch
        // and count co a new HuffmanNode n with label String.valueOf(ch) (and left and right equal to null)
        // and frequency co/(double) totalCount, and then calls list.insert(n).
    }
}