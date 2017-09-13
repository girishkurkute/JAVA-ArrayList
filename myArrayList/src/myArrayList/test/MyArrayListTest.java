package myArrayList.test;
import myArrayList.MyArrayList;
import myArrayList.util.Results;

public class MyArrayListTest {
	public void testMe(MyArrayList myArrayList, Results results)
	{
		myArrayList.flush();
		testDuplicateValueSort(myArrayList,results);
	}
	
	
	private void testDuplicateValueSort(MyArrayList myArrayList, Results results) {
		// TODO Auto-generated method stub
		myArrayList.insertSorted(8);
		myArrayList.insertSorted(10);
		myArrayList.insertSorted(15);
		myArrayList.insertSorted(15);
		myArrayList.insertSorted(22);
		myArrayList.insertSorted(36);
		int[] expectedResult = {8,10,15,15,22,36};
		boolean isTestPassed = comparrArray(expectedResult,myArrayList.copyArray());
		if(isTestPassed)
		{
			
			System.out.println("Passed");
		}
		else
		{
			
			System.out.println("Failed");
		}
	}

	private boolean comparrArray(int[] expectedResult, int[] copyArray) {
		// TODO Auto-generated method stub
		if(compareValue(expectedResult.length,copyArray.length))
		{
			for(int i=0;i<copyArray.length-1;i++)
			{
				if(!compareValue(expectedResult[i],copyArray[i]))
				{
					return false;
				}
			}
			return true;
		}
		return false;
	}

	private boolean compareValue(int expectedResultlength, int copyArraylength) {
		// TODO Auto-generated method stub
		return expectedResultlength==copyArraylength;
	}
}

