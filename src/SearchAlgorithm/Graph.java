package SearchAlgorithm;
import java.util.Vector;
import java.util.Collections;

public class Graph {
	public int count;
	public Vector<Node> G;
	
	//생성자
	Graph(){
		count = 0;
		G = new Vector<Node>();
	}
	Graph(int a){
		count = 0;
		G = new Vector<Node>();
		G.setSize(a);
	}
	
	//간선 추가 함수
	public void addNode(Node n){		
		G.addElement(n);
		count++;		
	}
	
	public Vector<Node> getG()
	{
		return G;
	}
	
}
