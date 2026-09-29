package graph;

import java.util.ArrayList; 
import java.util.Arrays;
import java.util.PriorityQueue;

public class dijkstraAlgorithm {
      static void dijkstra(int v , ArrayList<ArrayList<Edge>>graph , int source){
        int [] distance = new int[v];
        Arrays.fill(distance , Integer.MAX_VALUE);
        PriorityQueue<int []> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        distance[source] = 0;
        pq.add(new int[]{0,source});
        while(!pq.isEmpty()){
            int [] current = pq.poll();
            int currentDistance = current[0];
            int currentnode = current[1];
            //check neighbour

            for(Edge edge : graph.get(currentnode)){
                int neighbour = edge.to;
                int weight = edge.weight;
                int newdistance = currentDistance + weight;
                if(currentDistance + weight < distance[neighbour]){
                    distance[neighbour] = newdistance;
                    pq.add(new int[]{newdistance, neighbour});
                }
            }
           
        }
      }

    static class Edge{
        int to;
        int weight;
        Edge(int to, int weight){
            this.to = to;
            this.weight = weight;
        }

    }
    static void addedge (ArrayList<ArrayList<Edge>> graph , int u , int v , int weight){
        graph.get(u).add(new Edge(v,weight));
        //undirected weight
        graph.get(v).add(new Edge(u,weight));
    }
    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>(v);
        for(int i = 0; i < v; i++){
            graph.add(new ArrayList<>());
        }
        addedge(graph , 0 , 1 , 4);
        addedge(graph , 0 , 2 , 2);
        addedge(graph , 1 , 2 , 1);
        addedge(graph , 1 , 3 , 5);
        addedge(graph , 2 , 3 , 8);
        addedge(graph , 2 , 4 , 10);
        addedge(graph , 3 , 4 , 2);
        dijkstra( v, graph , 0);
        
    }
}
