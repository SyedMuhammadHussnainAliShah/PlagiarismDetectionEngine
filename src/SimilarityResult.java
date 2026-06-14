public class SimilarityResult
        implements Comparable<SimilarityResult> {


    private String documentName;
    private double similarity;


    public SimilarityResult(
            String documentName,
            double similarity) {


        this.documentName = documentName;
        this.similarity = similarity;
    }


    public String getDocumentName() {

        return documentName;
    }


    public double getSimilarity() {

        return similarity;
    }


    @Override
    public int compareTo(SimilarityResult other) {


        return Double.compare(
                other.similarity,
                this.similarity
        );
    }


    public void display() {

        System.out.println(
                documentName +
                        " : " +
                        similarity +
                        "% matched"
        );
    }
}