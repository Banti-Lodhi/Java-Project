import java.util.ArrayList;

public class recursion2 {
  // public static int countPath(int i, int j, int n, int m) {
  //   if(i == n || j == m) {
  //     return 0;
  //   }
  //   if(i==n-1 && j==m-1) {
  //     return 1;
  //   }
  //   int down_move = countPath(i+1, j, n, m);
  //   int right_move = countPath(i, j+1, n, m);
  //   return down_move+right_move;
  // }

  // public static int place_tiles(int n, int m){
  //   if(n==m){
  //     return 2;
  //   }
  //   if(n<m){
  //     return 1;
  //   }
  //   int vertplace=place_tiles(n- m, m);
  //   int horiplace=place_tiles(n-1, m);
  //   return vertplace+horiplace; 
  // }

  // call guest program:-
  // public static int call_guest(int n) {
  //   if(n <= 1) {
  //     return 1;
  //   }
  //   int ways1 = call_guest(n-1);
  //   int ways2 = (n-1) * call_guest(n-2);
  //   return ways1+ways2;
  // }

  public static void printsubset(ArrayList<Integer> subset) {
    for(int i=0; i<subset.size(); i++) {
      System.err.print(subset.get(i)+" ");
    }
    System.out.println();
   }
   public static void findsubsets(int n, ArrayList<Integer> subset) {
    if(n==0) {
      printsubset(subset);
      return;
      // add to
      subset.add(n);
      findsubsets(n-1, subset);
      // not add to
      subset.remove(subset.size()-1);
      findsubsets(n-1, subset);
    }
   }
  public static void main(String[] args) {
// int n=3;
// int m=3;
// int result = countPath(0, 0, n, m);
// System.out.print("total path of str => "+ result);

// System.out.println(place_tiles(4, 2));
// System.out.println(call_guest(2));
  
int n=3;
ArrayList<Integer> subset = new ArrayList<>();
findsubsets(n, subset);
}
}


