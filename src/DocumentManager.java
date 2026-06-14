import java.util.ArrayList;


public class DocumentManager {


    private ArrayList<Document> documents;


    public DocumentManager() {

        documents = new ArrayList<>();
    }


    public void addDocument(Document document) {

        documents.add(document);

        System.out.println("Document added successfully.");
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

            System.out.println("No documents available.");
            return;
        }


        for(Document document : documents) {

            document.display();
        }
    }
}