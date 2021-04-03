class TrieNode{
    char val;
    boolean isWord;
    TrieNode[] children;
    TrieNode(char c){
        children = new TrieNode[26];
        val = c;
    }
}

class Trie {
    /** Initialize your data structure here. */
    TrieNode root;
    public Trie() {
            root = new TrieNode(' ');
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = root;
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            if(node.children[c - 'a'] == null){
                node.children[c - 'a'] = new TrieNode(c);
            }
            node = node.children[c - 'a'];
        }
        node.isWord = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = root;
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            if(node.children[c - 'a'] == null ) return false;
            node = node.children[c - 'a'];
        }
        return node.isWord;

    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for(int i=0; i<prefix.length(); i++) {
            char c = prefix.charAt(i);
            if (node.children[c - 'a'] == null) return false;
            node = node.children[c - 'a'];
        }
        return true;
    }
    /** Returns if the word is in the trie. */
    public String findLongestWord(String[] words) {
        System.out.println(" start ");
        String res = "";
        TrieNode node = root;
        outer:
        for(String word: words) {
            System.out.println(" word "+ word);
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (node.children[c - 'a'] == null || node.children[c - 'a'].isWord == false) continue outer;
                node = node.children[c - 'a'];
            }

            if (word.length() > res.length() || (word.length() == res.length() && word.compareTo(res) < 0)){
                res = word;
            }
            System.out.println(" res " + res);

        }
        return res;
    }

}

public class L_208 {

    public static void main(String[] args){
        String res = "-";
        Trie obj = new Trie();
        //String word = "apple";
        /*obj.insert(word);
        boolean param_2 = obj.search("apple");
        boolean param_3 = obj.startsWith("apc");
        System.out.println(param_2 + "  " + param_3);*/
        String[] word1 = {"w","wo","wor","worl","world"};
        String[] word2 = {"a", "banana", "app", "appl", "ap", "apple", "apply"};
        for(String word : word1){
            obj.insert(word);
        }

        res = obj.findLongestWord(word1);
        System.out.println(res);
    }
}
