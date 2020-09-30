package DirectedWeightedGraph;

public class Vertex {
	private char label;
	private int index;
	private boolean isInS;
	
	public Vertex(char label) {
		// TODO Auto-generated constructor stub
		this.label = label;
		this.index = -1;
		this.isInS = false;
	}

	public boolean isInS() {
		return isInS;
	}

	public void setInS(boolean isInS) {
		this.isInS = isInS;
	}

	public char getLabel() {
		return label;
	}

	public void setLabel(char label) {
		this.label = label;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}
