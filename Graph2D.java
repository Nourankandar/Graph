import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Graph2D
 */
public class Graph2D {

    ArrayList <Node> nodes;
    int [][] matrix;
    Graph2D(int size){
        nodes = new ArrayList<>();
        matrix = new int[size][size];
        
    }
    public void addNode(Node node){
        nodes.add(node);
    }
    public void addEdge(int src , int dst){
        matrix[src][dst] = 1;
    
    }
    
    public boolean checkEdge(int src , int dst){
        if( matrix[src][dst] == 1){
            return true;
        }
        else{
            return false;
        }
    }
    public void print(){
        System.out.print("  ");
        for (Node node : nodes) {
            System.out.print(node.data + " ");
        }
        System.out.println();

        for(int i = 0 ; i < matrix.length ; i++){
            System.out.print(nodes.get(i).data + " ");
            for(int j = 0 ; j < matrix[i].length ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    void Topological_Sort ( int Graph [ ] [ ] ,int n){
        int Deg [] = new int[n]  ;
        for (int i = 1 ; i < n ; i++ ) {
            for (int j = 1 ; j < n ; j++ ) {
                if ( Graph [i][j] == 1) {
                Deg [j] ++ ; 
                }
            }
        }
        int x = 1 ;
        while (x != n + 1) {
             while ( Deg [x] != 0 && x <= n ) {
                    x++ ; }
            //  if (x = n + 1) {
            //         break ; }
            System.out.print(x);
             Deg [x] = -1 ;
             for (int i = 1 ; i <= n ; i++ ) {
             if ( Graph [x][i] == 1) {
             Deg [i] -- ; }
             }
        }
    }
}