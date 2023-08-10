/*
 * There is an undirected star graph consisting of n nodes labeled from 1 to n. 
 * A star graph is a graph where there is one center node and exactly n - 1 edges that connect the center node with every
 * other node.
 * 
 * You are given a 2D integer array edges where each edges[i] = [ui, vi] indicates that there is an edge between the nodes ui and vi. 
 * Return the center of the given star graph.
 * 
 * 
 * Example 1: Input: edges = [[1,2],[2,3],[4,2]] Output: 2 
 * Explanation: As shown in the figure above, node 2 is connected to every other node, so 2 is the center.
 * 
 * Example 2: Input: edges = [[1,2],[5,1],[1,3],[1,4]] Output: 1
 * 
 * Constraints:
 * 
 * 3 <= n <= 105 edges.length == n - 1 .//
 * edges[i].length == 2 .//
 * 1 <= ui, vi <= n ,//
 * ui != vi ,//
 * The given edges represent a valid star graph.
 */

import java.util.HashSet;

public class JavaQuest43 {
  public static void main(String[] args) {
    System.out.println(findCenter(new int[][] {{1, 2}, {2, 3}, {4, 2}})); // output : 2
    System.out.println(findCenter(new int[][] {{1, 2}, {5, 1}, {1, 3},{1,4}})); // output : 1
    System.out.println(findCenter(new int[][] {{4, 3}, {2, 3}, {1, 3},{3,5},{3,6},{3,7}})); // output : 3

  }

  public static int findCenter(int[][] edges) {

    HashSet<Integer> hs = new HashSet<>();

    for (int i = 0; i < edges.length; i++) {
      for (int j = 0; j < 2; j++) { // edges[i].length == 2
        if(!(hs.add(edges[i][j]))) // once find the joint
          return edges[i][j];
      } 
    }
    return 1;
  }

}

  // public static int findCenter(int[][] edges) {

  //   int center = 0;

  //   for (int i = 0; i < edges.length - 1; i++) {
  //     int[] x = new int[]{edges[i][0], edges[i][1]};
  //     int[] y = new int[]{edges[i+1][0], edges[i+1][1]};
  //     if (i != 0 && center != findSame(x, y))
  //       return -1; // somehow if the next point is not connecting to center, return invalid case
  //     center = findSame(x, y);      
  //   }
  //   return center;
  // }

  // public static int findSame(int[] x, int[] y) {
  //   HashSet<Integer> hs = new HashSet<>();
  //   for (int i = 0; i < x.length + y.length; i++) {
  //     if (!hs.add(x[i]))
  //       return x[i];
  //     if (!hs.add(y[i]))
  //       return y[i];
  //   }
  //   return 1;
  // }
