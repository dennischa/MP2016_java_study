package SearchAlgorithm;
import java.util.*;

public class GraphSearch {
	
	public void bfs(Node root)
	{
		Queue<Node> queue = new LinkedList<Node>();
		
		root.state = State.Visited;
		
		queue.add(root);
		
		while(!queue.isEmpty())
		{
			Node r = queue.remove();
			System.out.println(r.getVertex());
			
			for(Node n: r.getChild())
			{
				if(n.state == State.Unvisited)
				{
					queue.add(n);
					n.state = State.Visited;
				}				
			}
			
						
		}		
	}
	
	public void dfs(Node root)
	{
		if(root == null) 
			return;
		
		System.out.println(root.getVertex());
		root.state = State.Visited;
		
		for(Node n: root.getChild())
		{
			if(n.state == State.Unvisited)
				dfs(n);
		}
	}
	
	public void init(Graph g)
	{
		for(Node n: g.getG())
		{
			//System.out.println(n.getVertex());
			n.state = State.Unvisited;
		}
	}

}
