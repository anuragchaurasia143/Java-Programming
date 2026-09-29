package graph;
public class weighted {
    public static void main(String[] args) {
        int v = 4;
        int [][] graph = new int [v][v];
        graph[0][1]= 4;
        graph[1][0]= 4;
        graph[0][2]= 8;
        graph[2][0]= 8;
        graph[1][3]= 6;
        graph[3][1]= 6;

        for(int i = 0 ; i<v; i++){
            for(int j = 0; j<v; j++){
                System.out.print(graph[i][j] + " ");
            }
             System.out.println();
        }

    }
}
