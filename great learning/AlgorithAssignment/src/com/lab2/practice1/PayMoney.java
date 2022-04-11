package com.lab2.practice1;

import java.util.Scanner;

public class PayMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number of Transactions");
		int size =scan.nextInt() ;
		
		int[] transactions =new int[size] ;
		
		for(int i=0 ;i<size ;i++) {
			System.out.println("Enter the ammount of transaction "+(i+1));
			transactions[i]=scan.nextInt() ;
		}
		System.out.println("Enter Number of targets to be acheived");
		int tarsize =scan.nextInt() ;
		
		for(int i=0 ;i<tarsize ;i++) {
			System.out.println("Enter value of target "+(i+1));
			int target=scan.nextInt() ;
		
		    int sum=0 ;
			int j ;
			for( j=0 ;j<size ;j++) {
				sum=sum+transactions[j] ;
				if(sum>=target) {
					break ;
				}
				
			}
			if(sum<target) {	
				System.out.println("Given target is not achieved");
			}
			else	
				System.out.println("Target is acheived after " +(j+1)+" Transactions");
		}

		
	}

}
