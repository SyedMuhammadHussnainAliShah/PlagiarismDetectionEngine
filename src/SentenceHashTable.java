import java.util.HashMap;


public class SentenceHashTable {


    private HashMap<Integer, String> table;


    public SentenceHashTable() {

        table = new HashMap<>();
    }


    public void addSentence(String sentence) {


        int hash = sentence.hashCode();

        table.put(hash, sentence);
    }


    public void addDocument(Document document) {


        for(String sentence : document.getSentences()) {

            addSentence(sentence);
        }
    }


    public boolean containsSentence(String sentence) {


        int hash = sentence.hashCode();

        return table.containsKey(hash);
    }


    public void displayHashes() {


        for(Integer key : table.keySet()) {


            System.out.println(
                    "Hash: " + key +
                            " Sentence: " + table.get(key)
            );
        }
    }


    public HashMap<Integer, String> getTable() {

        return table;
    }
}