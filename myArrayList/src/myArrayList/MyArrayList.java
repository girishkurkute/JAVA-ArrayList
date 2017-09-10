package myArrayList;

import java.util.Arrays;

public class MyArrayList {

	
	private int MyArrayList[] = null;
	private int arrfilledSize = 0;

	public MyArrayList() {
		
		MyArrayList = new int[50];
	}
	 
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
	
}
