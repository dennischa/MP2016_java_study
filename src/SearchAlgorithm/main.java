package SearchAlgorithm;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graph g = new Graph();
		Node[] temp = new Node[8];
		
		//vertex 정보
        temp[0] = new Node("A");
        temp[1] = new Node("B");
        temp[2] = new Node("C");
        temp[3] = new Node("D");
        temp[4] = new Node("E");
        temp[5] = new Node("F");
        
        //child 정보
        temp[0].addChildNode(temp[1]);
        temp[0].addChildNode(temp[2]);
        temp[0].addChildNode(temp[3]);

        temp[1].addChildNode(temp[0]);
        temp[1].addChildNode(temp[4]);
        temp[1].addChildNode(temp[5]);

        temp[2].addChildNode(temp[0]);
        temp[3].addChildNode(temp[0]);
        temp[4].addChildNode(temp[1]);
        temp[5].addChildNode(temp[1]);
        
        for (int i = 0; i < 6; i++) 
        {
            g.addNode(temp[i]);
        }
        
        GraphSearch GS = new GraphSearch();
        
        System.out.println("--BFS--");
        GS.bfs(temp[0]);
        System.out.println();
        
        GS.init(g);
        System.out.println("--DFS--");
        GS.dfs(temp[0]);
	}

}
