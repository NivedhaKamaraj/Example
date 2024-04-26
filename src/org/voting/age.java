package org.voting;

import java.util.Scanner;

public class age {
public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  System.out.println("What is Your age");
  int Age = s.nextInt();
  if (Age>=18) {
	  System.out.println("You are Eligible to Vote");
	
} else {
	System.out.println("You are Not Eligible to Vote");

}
	
}
}

