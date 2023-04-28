package javaBasics;

import java.util.Scanner;

public class EmpDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner x=new Scanner(System.in);
	  int eno=1;
      String ename="Sam";
      float sal=5000.58f;
      System.out.println("Enter eno=");
      eno=x.nextInt();
      System.out.println("Enter ename=");
      ename=x.next();
      System.out.println("Enter sal=");
      sal=x.nextFloat();
      System.out.println("eno="+eno);
      System.out.println("ename="+ename);
      System.out.println("sal="+sal);
	}

}
