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
                    "No plagiarism evidence found."
            );

            return;
        }


        EvidenceNode current = head;


        while(current != null) {


            System.out.println(
                    "Matched: " +
                            current.sentence +
                            " | Source: " +
                            current.source
            );


            current = current.next;
        }
    }
}