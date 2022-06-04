package mylaptop;

public class Main {
    public static void main(String[] args) {
        AdjacencyList Graph = new AdjacencyList (9);

        Graph.TambahEdge("A", "B");
        Graph.TambahEdge("A", "D");
        Graph.TambahEdge("A", "E");
        Graph.TambahEdge("B", "E");
        Graph.TambahEdge("C", "B");
        Graph.TambahEdge("D", "G");
        Graph.TambahEdge("E", "F");
        Graph.TambahEdge("E", "H");
        Graph.TambahEdge("F", "C");
        Graph.TambahEdge("F", "H");
        Graph.TambahEdge("G", "H");
        Graph.TambahEdge("H", "I");
        Graph.TambahEdge("I", "F");

        Graph.DFS("A");

        System.out.println();
        System.out.println();

        Graph.BFS("A");

    }
}
https://youtu.be/nhtd29drrPQ
