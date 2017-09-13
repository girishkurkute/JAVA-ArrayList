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
	
	public void removeValue(int Value)
	{
		int[] tempRemovedArrayList = new int[arrfilledSize];
		int z = arrfilledSize - 1;
		int p=0;
		int index = 0;
		
		
		for(int k=0;k<=z;k++)
		{
			if(MyArrayList[k] == Value)
			{
				//removing element at position
				/*for(int j = k;j<arrfilledSize-1;j++)
				{
					MyArrayList[j] = MyArrayList[j+1];
					if(j == arrfilledSize-1)
					{
						MyArrayList[j+1]=0;
					}
				}*/
				arrfilledSize--;
			}
			else
			{
				tempRemovedArrayList[p]=MyArrayList[k];
				p++;
			}
			//7z--;
			
		}
		
		
		System.out.println("--------");
		for(int k=0;k<tempRemovedArrayList.length;k++) {
	         System.out.println(tempRemovedArrayList[k]);
	      }						
		
		
	}
	
	
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
	
	public int size()
	{
		return arrfilledSize;
	}
	
	public int sum()
	{
		int total = 0;
		for(int m=0;m<arrfilledSize;m++)
		{
			total = total + MyArrayList[m];
		}
		return total;
	}
	
	public void flush()
	{
		this.arrfilledSize=0;
		this.MyArrayList = new int [50];
	}
	
	public int[] copyArray()
	{
		return Arrays.copyOf(MyArrayList, arrfilledSize);
	}

}
