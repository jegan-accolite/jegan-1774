/****************************************************************************
* Copyright (c) 2016 by Accolite.com. All rights reserved
*
* Created date :: Jul 9, 2016
*
*  @author :: Jegan Muthaiah
* ***************************************************************************
*/
package com.accolite.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * Implementing ArrayList using Array
 * 
 */
public class UsingArray {
	
	/** The index. */
	int capacity,index=-1;
	
	/** The array. */
	Object array[];
	

	/**
	 * Instantiates a new using array with size of capacity.
	 *
	 * @param capacity the capacity
	 */
	public UsingArray(int capacity) {
		super();
		this.capacity = capacity;
		array = new Object[capacity];
	}
	
	/**
	 * Adds the value in array.
	 *
	 * @param value the value
	 */
	public void add(Object value){
		if(index>=(capacity-1)){
			capacity=capacity*2;
			array=Arrays.copyOf(array, capacity);
		}
		array[++index]=value;
	}
	
	/**
	 * Gets the value @ given index,  else throws exception. 
	 *
	 * @param index the index
	 * @return the object
	 */
	public Object get(int index){
		if(index>=0 && index<=this.index){
			return array[index];
		}
		else
			throw new ArrayIndexOutOfBoundsException("Array Out of Bound");
	}
	
	/**
	 * Removes the value @ given index, else throws exception.
	 *
	 * @param index the index
	 */
	public void remove(int index){
		if(index>=0 && index<=this.index){
			for(;index<=this.index;index++){
				array[index]=array[this.index];
			}
			this.index--;
		}
		else
			throw new ArrayIndexOutOfBoundsException("Array Out of Bound");
	}
	
	/**
	 * Sets the value @ given index, else throws exception.
	 *
	 * @param index the index
	 * @param value the value
	 */
	public void set(int index,Object value){
		if(index>=0 && index<=this.index)
			array[index]=value;
		else
			throw new ArrayIndexOutOfBoundsException("Array Out of Bound");
	}
	
	/**
	 * The main method to check the working..
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args){
		UsingArray arrayList=new UsingArray(10);
		int flag=1,choice,index;
		Object value;
		Scanner sc=new Scanner(System.in);
		while(flag==1){
			System.out.println("Press 1 to Add\t2 to Get\t3 to Remove\t4 to Set:\nEnter Your Choice:");
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
					try{
						System.out.println("Value:"+arrayList.get(sc.nextInt()));
					}
					catch(Exception e){
						System.out.println(e);						
					}
					break;
				}
				case 3:{
					System.out.println("Enter the Index:");
					try{
						arrayList.remove(sc.nextInt());
					}
					catch(Exception e){
						System.out.println(e);						
					}
					break;
				}
				case 4:{
					System.out.println("Enter the Index and Value:");
					index=sc.nextInt();
					value=sc.next();
					try{
						arrayList.set(index, value);
					}
					catch(Exception e){
						System.out.println(e);						
					}
					break;
				}
				default:{
					System.out.println("Not a Valid Option:");
				}
			}
			System.out.println("Continue? yes->1 / No->2:");
			flag=sc.nextInt();
		}
		System.out.println("End");
	}

}
