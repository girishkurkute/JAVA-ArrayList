package myArrayList;

import java.util.Arrays;

public class MyArrayList {

	
	private int MyArrayList[] = null;
	private int arrfilledSize = 0;
	
	//constructor
	public MyArrayList() {
		
		MyArrayList = new int[50];
	}
	 
	//Inserting elements in array and sorting array
	public void insertSorted(int newValue)
	{
		
		if(arrfilledSize >=MyArrayList.length)
		{
			int[] newMyArrayList = new int[MyArrayList.length + Math.abs(MyArrayList.length/2)];
			for(int k=0;k<MyArrayList.length;k++)
			{
				newMyArrayList[k]=MyArrayList[k];
			}
			MyArrayList=newMyArrayList;
			MyArrayList[arrfilledSize]=newValue;
			Arrays.sort(MyArrayList,0,arrfilledSize+1);
			arrfilledSize++;
		}
		else
		{
			MyArrayList[arrfilledSize]=newValue;
			Arrays.sort(MyArrayList,0,arrfilledSize+1);
			arrfilledSize++;
		}
		 
	}
	
	//Function to remove element from array
	public void removeValue(int Value)
	{
		int[] tempRemovedArrayList = new int[arrfilledSize];
		int z = arrfilledSize - 1;
		int p=0;
		int index = 0;
		
		index = indexOf(Value);
		
		//checking element is present in array or not
		if(index != -1)
		{
		for(int k=0;k<=z;k++)
		{
			if(MyArrayList[k] == Value)
			{

				arrfilledSize--;
			}
			else
			{
				tempRemovedArrayList[p]=MyArrayList[k];
				p++;
			}
			
		}
		MyArrayList = tempRemovedArrayList;
		}
		else
		{
			//System.out.println("Value "+Value+" not present in array");
		}
		
		
		}

	//Function to provide first index of element in array
	public int indexOf(int Value)
	{
		for(int z=0;z<arrfilledSize;z++)
		{
			if(MyArrayList[z] == Value)
			{
				return z+1;
			}
		}
		return -1;
	}
	
	//Function to get size of array
	public int size()
	{
		return arrfilledSize;
	}
	
	//Function to get sum of all elements in array
	public int sum()
	{
		int total = 0;
		for(int m=0;m<arrfilledSize;m++)
		{
			total = total + MyArrayList[m];
		}
		return total;
	}
	
	//Function to clear the array elements
	public void flush()
	{
		this.arrfilledSize=0;
		this.MyArrayList = new int [50];
	}
	
	//Function to copy array	
	public int[] copyArray()
	{
		return Arrays.copyOf(MyArrayList, arrfilledSize);
	}

}
