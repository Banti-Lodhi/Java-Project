public class Project5 {
  void convertAndCount(int num) {
    int count = 0;
    String binary = Integer.toBinaryString(num);

    for(int i=0; i<binary.length(); i++) {
      if(binary.charAt(i) == '1') {
        count++;
      }
    }
    System.out.println("The binary equivalent of " + num + " is : " + binary);
    System.out.println("Number of 1s : " + count);
  }  
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter your number :");

    // int n = sc.nextInt();
    
    // System.out.println("Enter the position:");
    // int pos = sc.nextInt();
    // System.out.println("Original number:"+n);
    // // The desired position
    // int mask = 1 << pos;
    // //  Use xor(^)
    // n = n^mask;
    // System.out.println(mask);
    // System.out.println("Number after togglig bit "+pos+":"+n);
 
//  4.:-


// Project5 obj = new Project5();
// obj.convertAndCount(18);  

}                  
}
