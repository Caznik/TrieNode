package main;

public class Trie {

	private TrieNode root;

    public Trie() {
        this.root = new TrieNode();
    }

    public void add(String name) {
        TrieNode current = root;
        for (char ch : name.toCharArray()) {
            current.children.putIfAbsent(ch, new TrieNode());
            current = current.children.get(ch);
            current.size++;
        }
    }

    public int find(String partial) {
        TrieNode current = root;
        for (char ch : partial.toCharArray()) {
            current = current.children.get(ch);
            if (current == null) {
                return 0;
            }
        }
        return current.size;
    }
}
