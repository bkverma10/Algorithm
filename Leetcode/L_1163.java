class TrieNode1 {
    char val;
    boolean isWord = false;
    TrieNode[] children;
    TrieNode1(char c){
        children = new TrieNode[26];
        val = c;
    }
}

class Trie1{
    TrieNode root;
    Trie1(){
        root = new TrieNode(' ');
    }

    void insert(String word){
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

    String largestSuffix(String reverse){
        TrieNode node = root;
        String res = "";
        StringBuilder builder = new StringBuilder("");
        for(int i=0; i< reverse.length(); i++){
            char c = reverse.charAt(i);
            builder.insert(0, node.children[c - 'a'].val);
            if(res.compareTo(builder.toString()) < 0){
                res =  builder.toString();
            }
            node = node.children[c - 'a'];
        }
        return res;
    }


}




public class L_1163 {

    public static void main(String[] args){
        Trie1 obj = new Trie1();
        String s = "leetcode";
        String reverse = new StringBuffer(s).reverse().toString();
        System.out.println(reverse);
        obj.insert(reverse);
        System.out.println(obj.largestSuffix(reverse));
        String s1 = "tcode";
        System.out.println(s1.compareTo(s));

    }
}
