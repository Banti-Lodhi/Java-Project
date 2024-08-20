public class project4 {

public static void checkNumber(int n) {
  double x = Math.ceil(Math.log(n)/Math.log(2));
  double y = Math.floor(Math.log(n)/Math.log(2));
if(x == y) {
  System.out.println("Given number " + n + " is power of 2");
 } else{
  System.out.println("Given number " + n + " is not power of 2");
}
}
  public static void main(String[] args) {
//  StringBuilder sb = new StringBuilder("Preetam");
    // System.out.println(sb);
    // System.out.println(sb.length());
    // System.out.println(sb.charAt(0));
   
// StringBuilder sb = new StringBuilder(".com");
// System.out.println(sb);
    // Char at index 0
    // System.out.println(sb.charAt(0));
    // set char at index 0
    // sb.setCharAt(0, 'H');
    // System.out.println(sb);

    // // insert Function
    // sb.insert(0, 'S');
    // sb.insert(1, 'o');
    // sb.insert(2, 'n');
    // sb.insert(3, 'y');
    // System.out.println(sb);


    // // // delete function:-
    // sb.delete(3, 4);
    
   // System.out.println(sb);

// Append Function to add the string in end of the insert string:-
// StringBuilder sb = new StringBuilder("Preetam Singh");
// sb.append("_data scientist");
// System.out.println(sb);

// Print length of string
// System.out.println(sb.length());

// Reverse the string number:-
// StringBuilder sb = new StringBuilder("Preetam Singh_data scientist");
// for(int i=0; i<sb.length()/2; i++){
//   int front = i;
//   int back = sb.length()-1-i;

//   char frontchar = sb.charAt(front);
//   char backchar = sb.charAt(back);

//   sb.setCharAt(front, backchar);
//   sb.setCharAt(back, frontchar);
// }
// System.out.println(sb);

// Operators:-
// // pre increment:-
// int a=10;
// int b = 0;
// b = ++a;
// System.out.println(a);
// System.out.println(b);

// // post increment:-
// System.out.println("post increment:-");
// a=10;
// b = 0;
// b = a++;
// System.out.println(a);
// System.out.println(b);

// // pre increment:-
// System.out.println("pre decrement:-");
// a=10;
// b = 0;
// b = --a;
// System.out.println(a);
// System.out.println(b);

// // pre increment:-
/*System.out.println("post decrement:-");
a=10;
b = 0;
b = a--;
System.out.println(a);
System.out.println(b);
*/

// Bit Operator:-
// int n=5;
// int pos = 2;
// int bitmask = 1 << pos;
// if((bitmask & n) == 0) {
//   System.out.println("Bit was zero");
// }else{
//   System.out.println("bit was not zero");
// }

// set bit Operator:-
// int n = 5;
// int pos = 1;
// int bitmask = 1 << pos;

// int newbitmask = bitmask | n;
// System.out.println(newbitmask);

// clear() bit Operator:-
// int n = 5;
// int pos = 2;
// int bitmask = 1 << pos;
// int notbitmask = ~(bitmask);

// int clearbitmask = notbitmask & n;
// System.out.println(clearbitmask);

// Combination Operator:-
// Scanner sc = new Scanner(System.in);
// int oper = sc.nextInt();

// int n = 5;
// int pos = 1;
// int bitmask = 1 << pos;
// if(oper == 1) {
//   int newbitmask = bitmask | n;
//   System.out.println(newbitmask);
// }else{
//   // Clear ststement:-
//   int newbit = ~(bitmask);
//   int newbitmask = newbit & n;
//   System.out.println(newbitmask);
// }


int n=6;
checkNumber(n);
n=8;
checkNumber(n);
n=24;
checkNumber(n);
n=512;
checkNumber(n);
  }  

}
