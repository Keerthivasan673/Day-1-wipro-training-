//Write a program to accept a number N and print whether it is positive, negative or zero
package day1;
import java.util.*;


public class Project1 {

public static void main(String[] args) {
System.out.print("Enter number :");
Scanner sc= new Scanner(System.in);
int inp=sc.nextInt();
if(inp<0) {
System.out.println("Negative");
}
else {
System.out.println("Positive");
}

}

}
