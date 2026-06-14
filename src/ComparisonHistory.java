import java.util.Stack;
public class ComparisonHistory {
    private Stack<String> history;
    public ComparisonHistory() {
        history = new Stack<>();
    }
    public void saveHistory(String result) {
        history.push(result);
        System.out.println("comparison saved in history");
    }
    public void undoLastComparison() {
        if(history.isEmpty()) {
            System.out.println("no comparison history available");
            return;
        }
        String removed = history.pop();
        System.out.println("removed: " + removed);
    }
    public void displayHistory() {
        if(history.isEmpty()) {
            System.out.println("history is empty.");
            return;
        }
        System.out.println("\ncomparison history:");
        for(String data : history) {
            System.out.println(data);
        }
    }
}