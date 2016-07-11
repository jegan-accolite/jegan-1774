package com.accolite.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class DefaultArrayList {
	public static void main(String[] args){
		ArrayList<Object> arrayList=new ArrayList<Object>();
		int flag=1,choice,index;
		Object value;
		Scanner sc=new Scanner(System.in);
		while(flag==1){
			System.out.println("Press 1 to Add\t2 to Get,3 to Remove\t4 to Set:\nEnter Your Choice:");
			choice=sc.nextInt();
			switch(choice){
				case 1:{
					System.out.println("Enter the Value:");
					value=sc.next();
					arrayList.add(value);
					break;
				}
				case 2:{
					System.out.println("Enter the Index:");
					System.out.println("Value:"+arrayList.get(sc.nextInt()));
					break;
				}
				case 3:{
					System.out.println("Enter the Index:");
					arrayList.remove(sc.nextInt());
					break;
				}
				case 4:{
					System.out.println("Enter the Index and Value:");
					index=sc.nextInt();
					value=sc.next();
					arrayList.set(index, value);
					break;
				}
				default:{
					System.out.println("Not a Valid Option:");
				}
			}
			System.out.println("Continue? yes->1 / No->2:");
			flag=sc.nextInt();
		}
	}
}
