package DirectedWeightedGraph;

public class TestDirectedWeightedGraph {
	public static void main(String[] args) {
		DirectedWeightedGraph graph = new DirectedWeightedGraph();
		graph.addVertex('A');
		graph.addVertex('B');
		graph.addVertex('C');
		graph.addVertex('D');
		graph.addVertex('E');
		
		graph.addEdge('A', 'B', 50);
		graph.addEdge('A', 'D', 80);
		graph.addEdge('B', 'D', 90);
		graph.addEdge('B', 'C', 60);
		graph.addEdge('C', 'E', 40);
		graph.addEdge('D', 'C', 20);
		graph.addEdge('D', 'E', 70);
		graph.addEdge('E', 'B', 50);
		
		graph.display();
		
		graph.calShortestPath();
	}
}
