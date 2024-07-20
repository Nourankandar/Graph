public class Main {
    public static void main(String[] args) {
        ;
        GraphList graphList = new GraphList();

        graphList.addNode(new Node('A'));
        graphList.addNode(new Node('B'));
        graphList.addNode(new Node('C'));
        graphList.addNode(new Node('D'));
        graphList.addNode(new Node('E'));

       

        graphList.addEdge(0, 1);
        graphList.addEdge(1, 2);
        graphList.addEdge(1, 4);
        graphList.addEdge(2, 3);
        graphList.addEdge(2, 4);
        graphList.addEdge(4, 0);
        graphList.addEdge(4, 2);
        
       

        System.out.println();

        graphList.print();

        
       // System.out.println(graph.checkEdge(2, 2));
    }
}
