import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class GraphTests {

	@Test
	public void testVertex() {

		LinkedList<Edge> edges = new LinkedList<Edge>();
		LinkedList<Edge> returnEdges = new LinkedList<Edge>();
		Vertex newVertex = new Vertex(50, edges);
		Vertex foundVertex = new Vertex(15, edges);
		Edge testEdge = new Edge(8);
		newVertex.setVertexId(1);
		int key = 51;
		
//		testing Edges list
		assertTrue(newVertex.getEdges().isEmpty());
		
//		Testing adding edges (5,8,0)
		newVertex.addEdges(new Edge (5));
		newVertex.addEdges(testEdge);
		newVertex.addEdges(new Edge(0));
		assertEquals(3, newVertex.getEdges().size());
		
//		Testing removing edge 8
		newVertex.removeEdges(testEdge);
		
//		edges are now (5,0)
		assertEquals(2, newVertex.getEdges().size());

//		testing List of Vertices
		LinkedList<Vertex> testVertices = new LinkedList<Vertex>();
		testVertices.add(newVertex);

		Graph myGraph = new Graph(testVertices);

		assertEquals(1, myGraph.getVertices().size());
		
		Vertex sampleVertex = new Vertex(51, edges);
		myGraph.addVertices(sampleVertex);
		
		assertEquals(2, myGraph.getVertices().size());

//		retrieve edges for vertex query with a vertexID of 51
		returnEdges = myGraph.retrieveEdges(testVertices, key);
		
		assertNotNull(returnEdges);

//		retrieve with a vertexId of 16 which will return null
		key = 16;
		
		returnEdges = myGraph.retrieveEdges(testVertices, key);
		
		assertNull(returnEdges);
		
//		removing Vertice from list		
		myGraph.removeVertices(sampleVertex);
		
		assertEquals(1, myGraph.getVertices().size());
		
//		removing final Vertice from list
		myGraph.removeVertices(newVertex);
		
		assertTrue(myGraph.getVertices().isEmpty());
	}
}
