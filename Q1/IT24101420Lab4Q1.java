import java.util.Scanner ;
public class IT24101420Lab4Q1 {
public static void main(String[]args){
Scanner scn = new Scanner (System.in);
System.out.print("Enter a number : ");
int number = scn.nextInt();
    if (number>0){
         System.out.println( " The number is positive ."); }
   else if (number<0){
         System.out.println( " The number is negative ."); }
   else {
        System.out.println( " The number is Zero."); }
}
}