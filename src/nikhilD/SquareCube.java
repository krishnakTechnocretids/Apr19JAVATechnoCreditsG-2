package nikhilD;

import java.util.Scanner;

/*Java Program to find square, square root and cube of a given number*/
public class SquareCube {
 
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num;
	
		System.out.print("Enter an integer number: ");
		num=sc.nextInt();

		System.out.println("Square of "+ num + " is: "+ Math.pow(num, 2));
		System.out.println("Cube of "+ num + " is: "+ Math.pow(num, 3));
		}
}

