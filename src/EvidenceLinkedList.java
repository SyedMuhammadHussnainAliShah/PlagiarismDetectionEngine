public class EvidenceLinkedList {
    private EvidenceNode head;
    public void addEvidence(
            String sentence,
            String source) {
        EvidenceNode node =
                new EvidenceNode(sentence, source);
        if(head == null) {

            head = node;
            return;
        }
        EvidenceNode current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = node;
    }
    public void displayEvidence() {
        if(head == null) {
            System.out.println(
                    "no plagiarim evidence found"
            );
            return;
        }
        EvidenceNode current = head;
        while(current != null) {
            System.out.println(
                    "matched: " +
                            current.sentence +
                            " | source: " +
                            current.source
            );
            current = current.next;
        }
    }
}