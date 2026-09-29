package graph;
import java.util.ArrayList;

public class listReprentationofGraph {
    public static void main(String[] args) {
       int v = 5;
       ArrayList<ArrayList<Integer>> graph = new ArrayList<>(v);
       //create list for each vertex
       for(int i = 0; i < v; i++){
              graph.add(new ArrayList<>());
         }
         //add edges
            graph.get(0).add(1);
            graph.get(1).add(0);
            graph.get(1).add(3);
            graph.get(3).add(1);
            for(int i = 0; i < v; i++){
                System.out.print(i + "->");
                for(int j = 0; j < graph.get(i).size(); j++){
                    System.out.print(graph.get(i).get(j) + " ");
                }
                System.out.println();
            }

    }
}
