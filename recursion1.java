import java.util.HashSet;

public class recursion1 {
  // public static void printNum(int n){
  //   if(n==0){
  //     return;
  //   }
  //   System.out.print(n+" ");
  //   printNum(n-1);
  // } 
  // public static void printNumb(int n){
  //   if(n == 6) {
  //     return;
  //   }
  //   System.err.print(n+" ");
  //   printNumb(n+1);
  // }


  //   public static void printSum(int i, int n, int Sum) {
  //     if(i==n){
  //       Sum += i;
  //       System.out.println(Sum);
  //       return;
  //     }
  //     Sum += i;
  //     // System.out.println(i);
  //     printSum(i+1, n, Sum);
  //   }
  //     // Factorial:-
  //     public static int calcfactoial(int n) {
  //       if(n == 1) {
  //         return 1;
  //       }

  //       int fact1 = calcfactoial(n-1);
  //       int fact2 = n*fact1;
  //       return fact2;
  //     }

  //     public static void printFib(int a, int b, int n){
  //       if(n==0) {
  //         return; 
  //       }
  //       int c = a+b;
  //       System.out.print(c+" ");
  //       printFib(b, c, n-1);
  //     }

      // X^n
      // public static int calcPower(int x, int n) {
      //   if(x == 0){
      //     return 0;
      //   }
      //   if(n == 0){
      //     return 1;
      //   }  
      //   // even
      //   if(n%2 == 0) {
      //     return calcPower(x, n/2)*calcPower(x, n/2);
      //   }else{
      //      return calcPower(x, n/2)*calcPower(x, n/2)*x;
      //   }
       
      // }

      // public static int calPower(int x, int n) {
      //   if(x==0){
      //     return 0;
      //   }
      //   if(n==0) {
      //     return 1;
      //   }
        
      //   int xpowm1 = calPower(x, n-1);
      //   int xpown = xpowm1*x;
      //   return xpown;
      // }

      // tower of honoi:

      // public static void towerofHonoi(int n, String S, String H, String D) {
      //   if(n == 1){
      //    System.out.println("transfer disk "+n+" from "+S+" to "+D);
      //    return;
      //   }
      //   towerofHonoi(n-1, S, D, H);
      //   System.out.println("transfer disk "+n+" from "+S+" to "+D);
      //   towerofHonoi(n-1, H, S, D);
      // }

      // public static void printrev(String str, int idx){
      //   if(idx == 0) {
      //     System.out.print(str.charAt(idx)+" ");
      //     return;
      //   }
      //   System.out.print(str.charAt(idx)+" ");
      //   printrev(str, idx-1);
      // }

      // Occurence

      // public static int first = -1;
      // public static int last = -1;
      // public static void findOccurance(String str, int idx, char element) {
      //   if(idx==str.length()){
      //     System.out.println(first);
      //     System.out.println(last);
      //     return;
      //   }

      //   char currChar = str.charAt(idx);
      //     if(currChar == element) {
      //       if(first == -1){
      //     first = idx;
      //   }else{
      //     last = idx;
      //   }
      // }
      // findOccurance(str, idx+1, element);
      // }

      // sorted check:
//       public static boolean isSorted(int arr[], int idx) {
// if(idx == arr.length-1){
//   return true;
// }


//         if(arr[idx] >= arr[idx+1]) {
//           return false;
//         }
//         return isSorted(arr, idx+1);
//       }


// move all x to the end of the string:
// public static void  moveAllx(String str, int idx, int count, String newString) {
//   if(idx == str.length()){
//     for(int i=0; i<count; i++) {
//       newString += 'x';
//     }
//     System.out.println(newString);
//     return;
//   }
// char currChar = str.charAt(idx);
// if(currChar == 'x') {
//   count++;

//   moveAllx(str, idx+1, count, newString);
// }else{
//   newString += currChar;
//   moveAllx(str, idx+1, count, newString);
// }
// }

// remove duplicates words from the string:>
// public static boolean map[] = new boolean[26];
// public static void remove_duplicates(String str, int idx, String newString) {
//   if(idx == str.length()) {
//     System.out.println(str+" is in word duplicates word are all remove equal to => "+newString);
//     return;
//   }
// char currChar = str.charAt(idx);
// if(map[currChar-'a']) {
//   remove_duplicates(str, idx+1, newString);
// }else{
// newString += currChar;
// map[currChar-'a'] = true;
// remove_duplicates(str, idx+1, newString);
// }
   
// }

// Print all subsequence of a string :-

// public static void Print_subsequence(String str, int idx, String newsString) {
//   if(idx == str.length()) {
//     System.out.print(newsString+ " ");
//     return;
//   }
//   char currChar = str.charAt(idx);
//   // to be
//   Print_subsequence(str, idx+1, newsString+currChar);

//   //or Not to be
//   Print_subsequence(str, idx+1, newsString);
// }

  public static void Print_subseq(String str, int idx, String newString, HashSet<String> allsubseq) {
    if(idx == str.length()) {
      if(allsubseq.contains(newString)){
        return;
      }
      allsubseq.add(newString);
      System.out.print(newString);
    }
    //choose
    Print_subseq(str, idx+1, newString+str.charAt(idx), allsubseq);
    
    //don't choose
    Print_subseq(str, idx+1, newString, allsubseq); 
  }
  public static void main(String[] args) {
    // printNumb(1);
    // printSum(1, 5, 0);

    // System.out.print(calcfactoial(8)+" ");

    // int a=0, b=1;
    // System.out.print(a+" ");
    // System.out.print(b+" ");
    // int n = 7;
    // printFib(a, b, n-2); 
    // System.out.print(calcPower(5, 2));


   // System.out.println(calPower(2, 4));
  // int n=2;
  //  towerofHonoi(n, "S", "H", "D");

  
  //  String str = "abcd";
  //  printrev(str, str.length()-1);

  // occurence:
      // String str = "abaacdaefaah";
      // findOccurance(str, 0, 'a');

      // cheeck String:
  //    int arr[] = {4, 5, 6};
  //  System.out.println(isSorted(arr, 0));
  
  // moveAll x end of the string

  // String str = "abcxxkxxhdxx";
  // moveAllx(str, 0, 0, " ");
  // String str = "abbcddef";
  // remove_duplicates(str, 0, " ");

  // String str = "abc";
  // Print_subsequence(str, 0, " ");
String str1 = "aaa";
// String str2 = "abc";
HashSet<String> allsubSeq = new HashSet<>();
Print_subseq(str1, 0, " ", allsubSeq);
}                 
}
