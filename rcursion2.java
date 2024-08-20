public class rcursion2 {
// public static void print_Permutation(String str, String Permutation) {
//   if(str.length() == 0) {
//     System.out.print(Permutation+" ");
//     return;
//   }
//     for(int i=0; i<str.length(); i++) {
//     char currChar = str.charAt(i);
//     String newString = str.substring(0, i)+str.substring(i+1);
//     print_Permutation(newString, Permutation+currChar);
//   } 
// } 

// count paths:-
public static int countPath(int i, int j, int n, int m) {
  if(i == n && j == n) {
    return 0;
  }
  if(i==m-1 && j==m-1) {
    return 1;
  }
  int down_move = countPath(i+1, j, n, m);
  int right_move = countPath(i, j+1, n, m);
  return down_move+right_move;
}
public static void main(String[] args) {
  //  String str = "abc";
  //  print_Permutation(str, " ");
int n=3;
int m=3;
int result = countPath(0, 0, n, m);
System.out.print("total path of str => "+ result);
  }
}
