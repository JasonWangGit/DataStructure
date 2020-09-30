package DirectedWeightedGraph;

import javax.swing.text.View;

public class DirectedWeightedGraph {
	private final int MAX_VERTEX = 20;
	private final int INFINITY = 999999;
	private Vertex[] vertexs;
	private int[][] adjacentMatrix;
	private int nVertex;
	private int count;
	private Path[] collectionU;
	private Vertex currentVertex;
	private int distanceStartToCurrent;
	
	public DirectedWeightedGraph() {
		// TODO Auto-generated constructor stub
		vertexs = new Vertex[MAX_VERTEX];
		adjacentMatrix = new int[MAX_VERTEX][MAX_VERTEX];
		nVertex = 0;
		for(int i = 0; i < MAX_VERTEX; i++) {
			for(int j = 0; j < MAX_VERTEX; j++) {
				adjacentMatrix[i][j] = INFINITY;
			}
		}
	}
	
	public void addVertex(char label) {
		vertexs[nVertex] = new Vertex(label);
		vertexs[nVertex].setIndex(nVertex);
		nVertex++;
	}
	
	public void addEdge(char labelStart, char labelEnd, int weight) {
		int indexStart = -1;
		int indexEnd = -1;
		for(int i = 0; i < nVertex; i++) {
			if(vertexs[i].getLabel() == labelStart) {
				indexStart = vertexs[i].getIndex();
				break;
			}
		}
		for(int i = 0; i < nVertex; i++) {
			if(vertexs[i].getLabel() == labelEnd) {
				indexEnd = vertexs[i].getIndex();
				break;
			}
		}
		adjacentMatrix[indexStart][indexEnd] = weight;
	}
	
	public void calShortestPath(){
		collectionU = new Path[nVertex];
		
		// step 1: set the start vertex
		Vertex startVertex = vertexs[0];
		
		// step 2: put start vertex in collection S
		startVertex.setInS(true);
		count = 1;
		
		// step 3: initialize collection U
		for(int i = 0; i < nVertex; i++) {
			int tempDistance = adjacentMatrix[startVertex.getIndex()][i];
			collectionU[i] = new Path(tempDistance, startVertex, vertexs[i], vertexs[0]);
		}
		
		// step 4:
		// step 5:
		
		while(count < nVertex) {
			Path minPath = getMinPath();
			if(minPath.getDistance() == INFINITY) {
				System.out.println("There is not any reachable vertexs");
			} else {
				currentVertex = minPath.getEndVertex();
				distanceStartToCurrent = collectionU[currentVertex.getIndex()].getDistance();
			}
			vertexs[currentVertex.getIndex()].setInS(true);
			count++;
			adjustCollectionU();
		}
		
		displayPaths();
		
		count = 0;
		for(int i = 0; i < nVertex; i++) {
			vertexs[i].setInS(false);
		}
	}
	
	public Path getMinPath() {
		int minDistance = INFINITY;
		Path minPath = null;
		for(Path path : collectionU) {
			if(!path.getEndVertex().isInS() && path.getDistance() < minDistance) {
				minDistance = path.getDistance();
				minPath = path;
			}
		}
		return minPath;
	}
	
	
	public void adjustCollectionU() {
		int index = 1;
		while(index < nVertex) {
			if(vertexs[index].isInS()) {
				index++;
				continue;
			}
			
			int distanceCurrentToEnd = adjacentMatrix[currentVertex.getIndex()][index];
			int distanceStartToEnd = distanceStartToCurrent + distanceCurrentToEnd;
			
			if(distanceStartToEnd < collectionU[index].getDistance()) {
				collectionU[index].setViaVertex(currentVertex);
				collectionU[index].setDistance(distanceStartToEnd);
			}
			index++;
		}
	}
	
	public void displayPaths() {
		for(int i = 0; i < nVertex; i++) {
			System.out.print(vertexs[i].getLabel() + "=");
			if(collectionU[i].getDistance() == INFINITY) {
				System.out.print("inf");
			} else {
				System.out.print(collectionU[i].getDistance());
			}
			System.out.print("(" + collectionU[i].getViaVertex().getLabel() + ")");
		}
		System.out.println();
	}
	
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Vertexs in this graph is: ");
		for(int i = 0; i < nVertex; i++) {
			System.out.print(vertexs[i].getLabel() + "\t");
		}
		System.out.println();
		for(int i = 0; i < nVertex; i++) {
			System.out.print(vertexs[i].getIndex() + "\t");
		}
		System.out.println();
		
		System.out.println("Adjacent Matrix in this graph is: ");
		System.out.print("\t");
		for(int i = 0; i < nVertex; i++) {
			System.out.print(vertexs[i].getLabel() + "\t");
		}
		System.out.println();
		for(int i = 0; i < nVertex; i++) {
			System.out.print(vertexs[i].getLabel() + "\t");
			for(int j = 0; j < nVertex; j++) {
				System.out.print(adjacentMatrix[i][j] + "\t");
				if(j == nVertex - 1) {
					System.out.println();
				}
			}
		}
	}
}
