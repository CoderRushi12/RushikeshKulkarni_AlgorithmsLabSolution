		package com.lab2.practice2;

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Nummber of currency denominations ");
		int size =scan.nextInt() ;
		
		int[] denominations =new int[size] ;
		for(int i=0 ;i<size ;i++) {
			System.out.println("Enter the currency denomination "+(i+1));
			denominations[i]=scan.nextInt() ;
			if(denominations[i]<=0) {
				System.out.println("Please Enter positive denomination");
				i=i-1 ;
			}
		}
		
        sortArray(denominations);
	
		System.out.println("Enter payable ammout");
		int ammount =scan.nextInt() ;
		
		calculateMinDenominations(ammount, denominations);
				
	}
	
	
	
	public static void calculateMinDenominations(int ammount,int[] denominations) {
		int size =denominations.length ;
		int[] notesNumber =new int[size] ;
		
		try {
			for(int i=0 ;i<size;i++) {
				if(denominations[i]<=ammount) {
				    notesNumber[i]=ammount/denominations[i];
					ammount= ammount % denominations[i] ;
					
					if(ammount==0) {
						break ;
					}		
				}
			}
			if(ammount>0) {
				System.out.println("Ammount cannot be paid with these currency denominations ");
			}else {
				System.out.println("Your payment approach in order to give min no of notes will be");
				for(int i=0 ;i<denominations.length ;i++) {
					if(notesNumber[i]>0) {
						System.out.println(denominations[i]+" : "+notesNumber[i]);
					}
				}
			}
	     }catch (ArithmeticException e) {
	    	 System.out.println(e+" Notes of denomination 0 is invalid ");
	     }
}
	
	public static void sortArray(int[] array) {
		int i, temp,j ;
		int num=array.length ;
		for (i = 0; i < ( num - 1 ); i++) {
		      for (j = 0; j < num - i - 1; j++) {
		        if (array[j] < array[j+1]) 
		        {
		          temp = array[j];
		          array[j] = array[j+1];
		          array[j+1] = temp;
		        }
		      }
		    }
	}
		
}
