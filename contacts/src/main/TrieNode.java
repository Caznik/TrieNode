package main;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
	Map<Character, TrieNode> children = new HashMap<>();
    int size = 0;

    public TrieNode() {}
}
