package DirectedWeightedGraph;

public class Path {
	private int distance;
	private Vertex startVertex;
	private Vertex endVertex;
	private Vertex viaVertex;
	
	public Vertex getViaVertex() {
		return viaVertex;
	}

	public void setViaVertex(Vertex viaVertex) {
		this.viaVertex = viaVertex;
	}

	public Path(int distance, Vertex startVertex, Vertex endVertex, Vertex viaVertex) {
		// TODO Auto-generated constructor stub
		this.distance = distance;
		this.startVertex = startVertex;
		this.endVertex = endVertex;
		this.viaVertex = viaVertex;
	}
	
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public Vertex getStartVertex() {
		return startVertex;
	}
	public void setStartVertex(Vertex startVertex) {
		this.startVertex = startVertex;
	}
	public Vertex getEndVertex() {
		return endVertex;
	}
	public void setEndVertex(Vertex endVertex) {
		this.endVertex = endVertex;
	}
}
