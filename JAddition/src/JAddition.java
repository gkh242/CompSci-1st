import java.util.Scanner;

public class  JAddition
{
public static void main(String [] args) 
{
System.out.println("Hello idiot.");
System.out.println("I will add three numbers for you because you failed elementary school.");
System.out.println("Enter three whole numbers on a line:");

int n1, n2, n3;


Scanner keyboard = new Scanner(System.in);
n1 = keyboard.nextInt();
n2 = keyboard.nextInt();
n3 = keyboard.nextInt();


System.out.println("The sum of those three numbers is");
System.out.println(n1 * n2 * n3);
}
}