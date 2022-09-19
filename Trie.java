public class Trie {

    private static final int TRIE_SIZE = 26;
    private final Trie[] lookupTable;
    private boolean isLastElement;

    Trie() {
        this.lookupTable = new Trie[TRIE_SIZE];
        isLastElement = false;
    }

    public void insert(String word) {
        Trie trie = this;
        int size = word.length();

        for(int i = 0; i < size; i++) {
            int index = word.charAt(i) - 97;
            if(trie.lookupTable[index] == null)
                trie.lookupTable[index] = new Trie();

            trie = trie.lookupTable[index];
        }
        trie.isLastElement = true;
    }

    public boolean contains(String word) {
        Trie trie = this;
        int size = word.length();

        for(int i = 0; i < size; i++) {
            int index = word.charAt(i) - 97;
            if(trie.lookupTable[index] == null)
                return false;

            trie = trie.lookupTable[index];
        }

        return trie.isLastElement;
    }

    public boolean containsPrefix(String word) {
        Trie trie = this;
        int size = word.length();

        for(int i = 0; i < size; i++) {
            int index = word.charAt(i) - 97;
            if(trie.lookupTable[index] == null)
                return false;

            trie = trie.lookupTable[index];
        }

        return true;
    }

}
