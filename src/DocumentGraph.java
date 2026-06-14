import java.util.*;

public class DocumentGraph {


    private HashMap<Integer,
            ArrayList<Integer>> graph;


    public DocumentGraph() {

        graph = new HashMap<>();
    }


    public void addConnection(int a, int b) {


        graph.putIfAbsent(a, new ArrayList<>());
        graph.putIfAbsent(b, new ArrayList<>());


        graph.get(a).add(b);
        graph.get(b).add(a);
    }



    public void bfs(int start) {


        Queue<Integer> queue =
                new LinkedList<>();

        HashSet<Integer> visited =
                new HashSet<>();


        queue.add(start);
        visited.add(start);


        System.out.println(
                "Related Document Cluster:"
        );


        while(!queue.isEmpty()) {


            int current = queue.remove();


            System.out.println(
                    "Document ID: " + current
            );


            for(int neighbour :
                    graph.get(current)) {


                if(!visited.contains(neighbour)) {


                    visited.add(neighbour);
                    queue.add(neighbour);
                }
            }
        }
    }
}