package org.test;

import java.util.Scanner;

public class CountofNum {
	public static void main(String[] args) {
		System.out.println("enter the num");
         Scanner s=new Scanner(System.in);

         int num=s.nextInt();
         int count=0;
         while(num>0) {
        	 num=num/10;
        	 count++;
}
   System.out.println(count);

	}

}
