import java.util.LinkedList;
import java.util.Queue;

public class BFS_class {
    //no of index
    private int vertex;

    //adjacency list
    private LinkedList<Integer> aj[];

    //maintaining a queue
    private Queue<Integer> que;

    //creating constructor
    BFS_class(int v){

        vertex = v;
        aj = new LinkedList[vertex];
        for (int i=0;i<v;i++){
            aj[i]=new LinkedList<>();
        }

        que = new LinkedList<Integer>();
    }

    //function to ad edge in the graph
    void addedge(int v,int w) {

        //adding the edges to adjacency
        aj[v].add(w);
    }
        //print the BFS traversal
        void BFS(int n){
            boolean nodes[] = new boolean[vertex];
            int b = 0;
            nodes[n] = true;

            //adding the root node to the top
            que.add(n);


            while (que.size() != 0) {

                //removin the top element
                n = que.poll();
                System.out.println(n + " ");

                //iterate through the linked list and pushing all into the queue

                for (int i = 0; i < aj[n].size(); i++) {

                    b = aj[n].get(i);
                    if(!nodes[b]){
                        nodes[b]=true;
                        que.add(b);
                    }
                }
            }
        }


    public static void main( String[] args ) {
        BFS_class graph =new BFS_class(17);
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
        System.out.println("Breadth first traversal for graph is :" );

        graph.BFS(0);




    }
}
