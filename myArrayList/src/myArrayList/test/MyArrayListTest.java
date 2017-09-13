package myArrayList.test;
import myArrayList.MyArrayList;
import myArrayList.util.Results;

public class MyArrayListTest {
	public void testMe(MyArrayList myArrayList, Results results)
	{
		myArrayList.flush();
		testDuplicateValueSort(myArrayList,results);
		
		myArrayList.flush();
		testDeleteAllOccurence(myArrayList,results);
		
		myArrayList.flush();
		testAddZero(myArrayList,results);
		
		myArrayList.flush();
		testCheckSum(myArrayList,results);
		
		myArrayList.flush();
		testCheckSumOnEmptyArray(myArrayList,results);
		
	}
	
	private void testCheckSumOnEmptyArray(MyArrayList myArrayList,
			Results results) {
		// TODO Auto-generated method stub
		boolean isSumCorrect = compareValue(0,myArrayList.sum());
		boolean isTestPassed = isSumCorrect;
		if(isTestPassed)
		{
			results.storeNewResult("Test sum of empty array is passsed");
			//System.out.println("Passed");
		}
		else
		{
			results.storeNewResult("Test sum of empty array is failed");
			//System.out.println("Failed");
		}
	}

	private void testCheckSum(MyArrayList myArrayList, Results results) {
		// TODO Auto-generated method stub
		myArrayList.insertSorted(8);
		myArrayList.insertSorted(10);
		myArrayList.insertSorted(15);
		myArrayList.insertSorted(15);
		
		
		boolean isSumCorrect = compareValue(48,myArrayList.sum());
		boolean isTestPassed = isSumCorrect;
		if(isTestPassed)
		{
			results.storeNewResult("Test sum of all elements is passsed");
			//System.out.println("Passed");
		}
		else
		{
			results.storeNewResult("Test sum of all elements is failed");
			//System.out.println("Failed");
		}
	}

	private void testAddZero(MyArrayList myArrayList, Results results) {
		// TODO Auto-generated method stub
		myArrayList.insertSorted(8);
		myArrayList.insertSorted(10);
		myArrayList.insertSorted(0);
		myArrayList.insertSorted(0);
		
		
		boolean isSizeCorrect = compareValue(4,myArrayList.size());
		boolean isTestPassed = isSizeCorrect;
		if(isTestPassed)
		{
			results.storeNewResult("Test Adding zero element is passsed");
			//System.out.println("Passed");
		}
		else
		{
			results.storeNewResult("Test Adding zero element is failed");
			//System.out.println("Failed");
		}
	}


	
	private void testDeleteAllOccurence(MyArrayList myArrayList, Results results) {
		// TODO Auto-generated method stub
		myArrayList.insertSorted(8);
		myArrayList.insertSorted(10);
		myArrayList.insertSorted(15);
		myArrayList.insertSorted(15);
		myArrayList.insertSorted(22);
		myArrayList.insertSorted(36);
		myArrayList.removeValue(15);
		int[] expectedResult = {8,10,22,36};
		boolean isTestPassed = comparrArray(expectedResult,myArrayList.copyArray());
		if(isTestPassed)
		{
			results.storeNewResult("Test Delete all occurence value sort is passsed");			
		}
		else
		{
			results.storeNewResult("Test Delete all occurence is failed");
		}
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
			
			results.storeNewResult("Test Duplicate value sort is passsed");
			//System.out.println("Passed");
		}
		else
		{
			
			results.storeNewResult("Test Duplicate value sort is failed");
			//System.out.println("Failed");
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

