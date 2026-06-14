import java.util.ArrayList;

public class Document {

    private int id;
    private String title;
    private String content;

    private ArrayList<String> words;
    private ArrayList<String> sentences;


    public Document(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;

        words = TextProcessor.extractWords(content);
        sentences = TextProcessor.extractSentences(content);
    }


    public int getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }


    public String getContent() {
        return content;
    }


    public ArrayList<String> getWords() {
        return words;
    }


    public ArrayList<String> getSentences() {
        return sentences;
    }


    public void display() {

        System.out.println("\nDocument ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Words: " + words.size());
        System.out.println("Sentences: " + sentences.size());
    }
}