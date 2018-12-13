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
        // returns the codeword for s if it exists in the codebook and null otherwise
    }

    public void print() {
        Item p = start;
        while (p != null) {
            System.out.println(p.character + "->" + p.codeword);
            p = p.next;
        }
        // for each entry in the codebook with character s and codeword c it prints a line of the form s -> c
    }

    public int length() {
        // returns how many characters (together with their encodings) are stored in this codebook
    }

}