package org.test;

import java.util.Scanner;

public class CountofNum {
	public static void main(String[] args) {
		int a=10, b=20, c;
		c=a+b;
		System.out.println(c);
		System.out.println("enter the num");
         Scanner s=new Scanner(System.in);

         int num=s.nextInt();
         int count=0;
         while(num>0) {
        	 num=num/10;
        	 count++;
}
   System.out.println(count);
   System.out.println("Count of Numbers");

   System.out.println("Count value");
	}
	

}
