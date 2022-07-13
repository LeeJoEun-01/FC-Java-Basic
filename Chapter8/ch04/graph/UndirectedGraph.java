package ch04.graph;

public class UndirectedGraph {
  

  private int count; // 그래프 요소의 개수 
  private int[][] vertexMatrix; //2차원 배열

  // 2차원 배열 만들기
  public UndirectedGraph(int count) {
    this.count = count;
    vertexMatrix = new int[count][count];
  }

  // 간선의 유무 또는 간선의 가중치
  public void addEdges(int from, int to, int weight) {
    vertexMatrix[from][to] = weight;
    vertexMatrix[to][from] = weight;
  }

  public int[][] getMatrix(){
    return vertexMatrix;
  }
}
