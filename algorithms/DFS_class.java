import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class DFS_class {
    private LinkedList<Integer> adj[];
    private boolean visited[];

    //creating constructor
    // vertices of the graph
    DFS_class (int v)
    {
        adj = new LinkedList[v];
        visited = new boolean[v];

        for(int i=0; i<v; i++)
            adj[i]= new LinkedList<>();
        }

        //adding to the edge
        void addedge(int src, int dst){
            adj[src].add(dst);
        }



        // visited the vertex
        void DFS(int vertex){
            visited[vertex]=true;


        System.out.println(vertex + " ");

        Iterator<Integer> it = adj[vertex].listIterator();
        while (it.hasNext()){
            int n=it.next();
            if(!visited[n]);
            DFS(n);
        }
        }




    public static void main( String[] args ) {
            DFS_class graph =new DFS_class(17);
            graph.addedge(0,1);
            graph.addedge(0,2);
            graph.addedge(0,3);
            graph.addedge(1,5);
            graph.addedge(1,4);
            graph.addedge(2,7);
            graph.addedge(2,8);
            graph.addedge(3,10);
            graph.addedge(3,11);
            graph.addedge(5,6);
            graph.addedge(7,6);
            graph.addedge(7,9);
            graph.addedge(8,9);
            graph.addedge(8,9);
            graph.addedge(10,12);
            graph.addedge(11,13);
            graph.addedge(6,4);
            graph.addedge(9,12);
            System.out.println("Depth first traversal for graph is :" );

            graph.DFS(0);
        }

    }

