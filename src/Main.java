import java.util.PriorityQueue;

public class Main {


    public static void main(String[] args) {


        DocumentManager manager =
                new DocumentManager();


        Document doc1 =
                new Document(
                        1,
                        "Assignment 1",
                        "Java is powerful. Data structures are important."
                );


        Document doc2 =
                new Document(
                        2,
                        "Assignment 2",
                        "Java is powerful. Algorithms are useful."
                );


        Document doc3 =
                new Document(
                        3,
                        "Assignment 3",
                        "Python is easy. Machine learning is popular."
                );


        manager.addDocument(doc1);
        manager.addDocument(doc2);
        manager.addDocument(doc3);


        Utility.line();

        manager.displayAllDocuments();


        Utility.line();


        SimilarityCalculator calculator =
                new SimilarityCalculator();


        PriorityQueue<SimilarityResult> results =
                calculator.rankDocuments(
                        doc1,
                        manager
                );


        System.out.println(
                "\nPlagiarism Ranking:"
        );


        while(!results.isEmpty()) {


            results.poll().display();
        }


        Utility.line();


        ComparisonHistory history =
                new ComparisonHistory();


        history.saveHistory(
                "Compared Assignment 1 with all documents"
        );


        history.displayHistory();
    }
}