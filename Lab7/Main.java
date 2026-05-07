
import java.util.List;



class Main {
  public static void main(String[] args) {
    
    // 1. Define the vertices (buildings) based on the campus map

    String vertices[] = {
      "Liberal Arts",
      "Student Services",
      "Health Careers & Sciences",
      "Health Technologies Center",
      "Recreation Center",
      "Technology Learning Center",
      "Business & Technology",
      "Theatre"
    };

    // 2-Define Edges

    int[][] edges = {
      {0,7},
      {7,0},
      {0,1},
      {1,0},
      {0,6},
      {6,0},
      {7,6},
      {6,7},
      {1,5},
      {5,1},
      {1,4},
      {4,1},
      {1,2},
      {2,1},
      {2,3},
      {3,2},
      {2,4},
      {4,2},
      {6,1},
      {1,6}
    };

    // 3. Create the graph (name "graph") using the vertices and edges

    UnweightedGraph<String> buildings = new UnweightedGraph<String>(vertices, edges);

    // 4. Perform a depth-first search (name "dfs")(DFS) starting from the "Business & Technology" building

    UnweightedGraph.SearchTree result = buildings.dfs(6);

    // 5. Retrieve and print the search order of the DFS traversal

    List<Integer> searchOrder = result.getSearchOrder();

    // 6. Print the parent-child relationships for each vertex during the DFS traversal

    for (int i = 0; i < searchOrder.size(); i++) {
      if (result.getParent(searchOrder.get(i)) == -1) {
        System.out.println(searchOrder.get(i) + " is the root");
      } else {
        System.out.println(searchOrder.get(i) + " is the child of " + result.getParent(searchOrder.get(i)));
      }
    }

    // 7. Call the printPath method (assuming this method exists in the UnweightedGraph class)

    result.printPath(3); // Non-optimal path
    System.out.println();
    result.printPath(2); // Non-optimal path
    System.out.println();
    result.printPath(4); // Non-optimal path
    System.out.println();

    // 8. Call printTree() to print the entire DFS tree (assuming this method exists in the UnweightedGraph class)
    
    result.printTree();

  }
}