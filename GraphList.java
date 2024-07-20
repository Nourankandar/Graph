import java.util.ArrayList;
import java.util.LinkedList;

/**
 * GraphList
 */
public class GraphList {

    
    ArrayList<LinkedList<Node>> alist;
    
    GraphList(){
        alist = new ArrayList<>();
        System.out.println("hhhhhhh");
    }
    public void addNode(Node node){
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);
    }

    public void addEdge(int src , int dst){
        LinkedList<Node> currentList = alist.get(src);
        Node detNode = alist.get(dst).get(0);
        currentList.add(detNode);
    
    }
    public boolean checkEdge1(int src , int dst){
        LinkedList<Node> currentList = alist.get(src);
        Node detNode = alist.get(dst).get(0);

        for (Node node : currentList) {
            if (node == detNode) return true;
        }
        return false;
    }
    
    public void print(){
        
        for (LinkedList<Node> linkedList : alist) {
            for (Node node : linkedList) {
                System.out.print(node.data + "->");
            }
            System.out.println();
        }
    }
}