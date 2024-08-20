public class recursion1a {
  // public static void print_allsubseq(String str, int idx, String newString, HashSet<String> allsubseq) {
  //   if(idx == str.length()) {
  //     if(allsubseq.contains(newString)) {
  //       return;
  //     }
  //     allsubseq.add(newString);
  //     System.out.print(newString+" ");
  //   return;
  //   }
  //   // choose
  //     print_allsubseq(str, idx+1, newString+str.charAt(idx), allsubseq);
  //     // don't choose
  //     print_allsubseq(str, idx+1, newString, allsubseq);
    // }
      public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vws", "yz"};
      public static void printComb(String str, int idx, String Combination) {
          if(idx == str.length()) {
            System.out.print(Combination+" ");
            return;
          }
          char currChar = str.charAt(idx);
          String mapping = keypad[currChar - '0'];
          for(int i=0; i<mapping.length(); i++) {
               printComb(str, idx+1, Combination+mapping.charAt(i));
          }
  }
  public static void main(String[] args) {
    // String str1 = "aaa";
    // HashSet <String> allsubSeq = new HashSet<>();
    // print_allsubseq(str1, 0, " ", allsubSeq);
  String str = "123";
    printComb(str, 0, " ");
  }
}
