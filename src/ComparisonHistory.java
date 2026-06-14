import java.util.Stack;

public class ComparisonHistory {

    private Stack<String> history;


    public ComparisonHistory() {

        history = new Stack<>();
    }


    public void saveHistory(String result) {

        history.push(result);

        System.out.println("Comparison saved in history.");
    }


    public void undoLastComparison() {


        if(history.isEmpty()) {

            System.out.println("No comparison history available.");
            return;
        }


        String removed = history.pop();

        System.out.println("Removed: " + removed);
    }


    public void displayHistory() {


        if(history.isEmpty()) {

            System.out.println("History is empty.");
            return;
        }


        System.out.println("\nComparison History:");

        for(String data : history) {

            System.out.println(data);
        }
    }
}