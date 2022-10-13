package com.greatlearning.pay.driver;

import java.util.Scanner;

import com.greatlearning.pay.service.AmountSort;

public class Driver {

	public static void main(String[] args) {

		AmountSort amountSort = new AmountSort();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of currency denminations:");
		int size=s.nextInt();
		System.out.println("Enter the currency denominations value:");
		int denominations[]=new int[size];
		for(int i=0;i<size;i++){
			denominations[i]=s.nextInt();
		}
		System.out.println("Enter the amount to be payed");
		int amount=s.nextInt();
		amountSort.sortingAlgorithm(denominations, size);
		int notes[]=new int[size];
		int count=0;
		for(int i=0;i<size;i++){
			count=0;
			while(amount>0 && amount>=denominations[i]){
				amount=amount-denominations[i];
				count++;
			}
			notes[i]=count;
		}
		for(int i=0;i<size;i++){
			if(notes[i]>0)
			System.out.println(denominations[i]+":"+notes[i]);
		}
		s.close();
	}

}