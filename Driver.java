
public class Driver {

    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("hello");
        System.out.println(trie.contains("hello"));
        System.out.println(trie.contains("hell"));
        System.out.println(trie.contains("ello"));
        System.out.println(trie.containsPrefix("hello"));
        System.out.println(trie.containsPrefix("hell"));
        System.out.println(trie.containsPrefix("ello"));

    }
}
