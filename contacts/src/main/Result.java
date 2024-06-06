package main;

import java.util.ArrayList;
import java.util.List;

public class Result {
	public static List<Integer> contacts(List<List<String>> queries) {
		Trie trie = new Trie();
        List<Integer> result = new ArrayList<>();
        
        for (List<String> query : queries) {
            String command = query.get(0);
            String argument = query.get(1);
            
            if (command.equals("add")) {
                trie.add(argument);
            } else if (command.equals("find")) {
                result.add(trie.find(argument));
            }
        }
        
        return result;
	}
}
