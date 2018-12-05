import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

	LinkedList<Vertex> vertices = new LinkedList<Vertex>();
	
	public Graph()
	{
		vertices = null;
	}
	
	public Graph(LinkedList<Vertex> vertices) {
		this.vertices = vertices;
	}

//	Add Vertices
	public void addVertices(Vertex newVertex) {
		vertices.add(newVertex);
	}

//	Remove vertices
	public void removeVertices(Vertex newVertex) {
		vertices.remove(newVertex);
	}

// Given a vertexId search the list of Vertices and if found with vertexId then return
//	list of edges.  Otherwise return null
	public LinkedList<Edge> retrieveEdges(LinkedList<Vertex> newVertex, int vertexId) {
		LinkedList<Edge> returnEdges = null;
		Iterator<Vertex> iterator = null;
		boolean found = false;
	
		iterator = newVertex.iterator();
		while (iterator.hasNext()) {
			Vertex elementVertex = iterator.next();
			int vertexKey = elementVertex.getVertexID();
			if (vertexKey == vertexId) {
				returnEdges = elementVertex.getEdges();
			}
		}
		return returnEdges;
	}
	

	public LinkedList<Vertex> getVertices() {
		return vertices;
	}
}
