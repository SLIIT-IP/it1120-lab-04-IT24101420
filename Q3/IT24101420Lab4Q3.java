import java.util.Scanner;
public class IT24101420Lab4Q3 {
public static void main (String[]args){
Scanner scn = new Scanner(System.in);
System.out.print("Enter a number : ");
int number = scn.nextInt();
String result = (number > 0) ? "positive " : (number < 0) ?  "negative" : " Zero" ;
System.out.println(" The number is : " + result);
}
}