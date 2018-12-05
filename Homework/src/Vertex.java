import java.util.LinkedList;

public class Vertex {

	int vertexId;
	LinkedList<Edge> edges = new LinkedList<Edge>();
	
	public Vertex () {
		vertexId = 0;
		edges = null;
	}
	
	public Vertex (int vertexId, LinkedList<Edge> edges) {
		this.vertexId = vertexId;
		this.edges = edges;
	}
	
	
//	Add edges
	public void addEdges(Edge newEdge) {
		edges.add(newEdge);
	}
	
// Remove edges	
	public void removeEdges(Edge newEdge ) {
		edges.remove(newEdge);
	}
	
	
// Setters
	
	public void setVertexId(int newVertexId) {
		vertexId = newVertexId;
	}

	public void setEdges( LinkedList<Edge> newEdges) {
		edges = newEdges;
	}
	
// Getters	
	
	public int getVertexID( ) {
		return vertexId;
	}

	public LinkedList<Edge> getEdges() {
		return edges;
	}
	
}