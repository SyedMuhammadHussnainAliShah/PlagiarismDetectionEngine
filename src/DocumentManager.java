import java.util.ArrayList;
public class DocumentManager {
    private ArrayList<Document> documents;
    public DocumentManager() {

        documents = new ArrayList<>();
    }
    public void addDocument(Document document) {
        documents.add(document);
        System.out.println("document added succesfuly");
    }
    public ArrayList<Document> getDocuments() {
        return documents;
    }
    public Document findDocument(int id) {
        for(Document document : documents) {
            if(document.getId() == id) {
                return document;
            }
        }
        return null;
    }
    public void displayAllDocuments() {
        if(documents.isEmpty()) {
            System.out.println("no document avalable");
            return;
        }
        for(Document document : documents) {
            document.display();
        }
    }
}