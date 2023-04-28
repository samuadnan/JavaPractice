package javaBasics;
import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
		int ch;
		String ch1;
		do
		{
		System.out.println("1. Natural 2. Reverse 3. Even 4. Odd enter your choice");
		ch=x.nextInt();
		
		switch(ch)
		{
		case 1:		
		System.out.println("Natural Numbers");
		for(int i=1;i<=10;i++) //11<=10
		{
			System.out.println(i);  //1  2
		}
		break;
		case 2:
		System.out.println("Reverse Numbers");
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		break;
		case 3:
		System.out.println("Even Numbers");
		int j=2;
		while(j<=10)
		{
			System.out.println(j);
			j=j+2;
		}
		break;
		case 4:
		System.out.println("Odd Numbers");
		int k=1;
		do
		{
			System.out.println(k);
			k=k+2;
		}while(k<=10);
		break;
		default:
			System.out.println("Invalid choice entered...");
		}
		System.out.println("Do you want to continue Y/N?");
		ch1=x.next();
		}while(ch1.toUpperCase().equals("Y"));
	}



	}


