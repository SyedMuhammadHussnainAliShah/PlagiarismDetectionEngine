public class EvidenceNode {


    String sentence;
    String source;
    EvidenceNode next;


    public EvidenceNode(String sentence, String source) {


        this.sentence = sentence;
        this.source = source;
        next = null;
    }
}