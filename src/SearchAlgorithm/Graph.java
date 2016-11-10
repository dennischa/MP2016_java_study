package SearchAlgorithm;
import java.util.Vector;
import java.util.Collections;

public class Graph {
	public int count;
	public Vector<Node> G;
	
	//������
	Graph(){
		count = 0;
		G = new Vector<Node>();
	}
	Graph(int a){
		count = 0;
		G = new Vector<Node>();
		G.setSize(a);
	}
	
	//���� �߰� �Լ�
	public void addNode(Node n){		
		G.addElement(n);
		count++;		
	}
	
	public Vector<Node> getG()
	{
		return G;
	}
	
}
