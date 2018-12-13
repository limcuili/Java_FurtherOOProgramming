// a data structure which can store an arbitrary number of
// characters together with their codewords

public class CodeBook {

    private Item start = null;

    private class Item {
        char character;
        String codeword;
        Item next;
    }

    public void insert(char s, String c) {
        // inserts a new entry in the codebook, expressing that character s has codeword c
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

    public int length() {
        // returns how many characters (together with their encodings) are stored in this codebook
    }

}