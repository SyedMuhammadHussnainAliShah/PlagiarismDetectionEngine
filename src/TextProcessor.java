import java.util.ArrayList;

public class TextProcessor {


    public static ArrayList<String> extractWords(String text) {

        ArrayList<String> words = new ArrayList<>();

        String[] data = text.toLowerCase()
                .replaceAll("[^a-zA-Z ]", "")
                .split("\\s+");


        for(String word : data) {

            if(!word.isEmpty()) {
                words.add(word);
            }
        }

        return words;
    }


    public static ArrayList<String> extractSentences(String text) {

        ArrayList<String> sentences = new ArrayList<>();

        String[] data = text.split("[.!?]");


        for(String sentence : data) {

            sentence = sentence.trim();

            if(!sentence.isEmpty()) {

                sentences.add(sentence.toLowerCase());
            }
        }

        return sentences;
    }
}