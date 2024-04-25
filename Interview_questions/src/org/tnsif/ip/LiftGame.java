package org.tnsif.ip;
import java.util.Scanner;
public class LiftGame {

	public static void LiftQueries(int a, int b, int n) {
	    int call;
	    Scanner sc = new Scanner(System.in);
	    while (n != 0) {
	      System.out.println("Enter the test case");
	      call = sc.nextInt();

	      if (Math.abs(call - a) <= Math.abs(call - b)) {
	        System.out.println("A");
	        a = call;
	      } else {
	        System.out.println("B");
	        b = call;
	      }
	      n--;
	    }
	  }

	  public static void main(String[] args) {
	    int a = 1, b = 7, n;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number of test case");
	    n = sc.nextInt();
	    LiftQueries(a, b, n);
	  }

}
