public class Main {
    public static void main(String[] args) {
        Graph2D graph = new Graph2D(5);
        GraphList graphList = new GraphList();

        graphList.addNode(new Node('A'));
        graphList.addNode(new Node('B'));
        graphList.addNode(new Node('C'));
        graphList.addNode(new Node('D'));
        graphList.addNode(new Node('E'));

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));


        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graphList.addEdge(0, 1);
        graphList.addEdge(1, 2);
        graphList.addEdge(1, 4);
        graphList.addEdge(2, 3);
        graphList.addEdge(2, 4);
        graphList.addEdge(4, 0);
        graphList.addEdge(4, 2);
        
        graph.print();

        System.out.println();

        graphList.print();

        graph.Topological_Sort(graph.matrix, 5);

       // System.out.println(graph.checkEdge(2, 2));
    }
}
