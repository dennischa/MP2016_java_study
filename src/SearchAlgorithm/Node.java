package SearchAlgorithm;
import java.util.Vector;
public class Node {
	public int childCount;
	public Vector<Node> children;
	private String vertex;
	public State state;
	
	public Node(String v){
		vertex = v;
		childCount = 0;
		children = new Vector<Node>();	
	}
	
	public void addChildNode(Node obj)
	{
		obj.state = State.Unvisited;
		children.add(obj);
		childCount++;
	}
	
	public Vector<Node> getChild()
	{
		return children;
	}
	
	public String getVertex()
	{
		return vertex;
	}

}
