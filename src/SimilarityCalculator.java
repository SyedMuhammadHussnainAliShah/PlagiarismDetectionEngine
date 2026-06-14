import java.util.HashSet;
import java.util.PriorityQueue;


public class SimilarityCalculator {


    public double calculateSimilarity(
            Document first,
            Document second) {


        HashSet<String> set =
                new HashSet<>(first.getSentences());


        int matched = 0;


        for(String sentence : second.getSentences()) {


            if(set.contains(sentence)) {

                matched++;
            }
        }


        int total = Math.max(
                first.getSentences().size(),
                second.getSentences().size()
        );


        if(total == 0) {

            return 0;
        }


        return (matched * 100.0) / total;
    }



    public PriorityQueue<SimilarityResult>
    rankDocuments(
            Document original,
            DocumentManager manager) {


        PriorityQueue<SimilarityResult> queue =
                new PriorityQueue<>();


        for(Document doc : manager.getDocuments()) {


            if(doc.getId() != original.getId()) {


                double score =
                        calculateSimilarity(original, doc);


                queue.add(
                        new SimilarityResult(
                                doc.getTitle(),
                                score
                        )
                );
            }
        }


        return queue;
    }
}