package myArrayList.driver;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;

import myArrayList.MyArrayList;
import myArrayList.test.MyArrayListTest;
import myArrayList.util.FileProcessor;
import myArrayList.util.Results;

public class Driver {

	public static void main(String[] args) throws Exception {
		String inputfile,outputfile;
		String currNumber;
		
		if(args.length !=2)
		{
			
			throw new RuntimeException("Please provide 2 arguments");
		}
		else
		{
			inputfile = args[0];
			outputfile = args[1];
			
		}
		
		MyArrayList arrObj = new MyArrayList();
		FileProcessor fpObj = new FileProcessor(inputfile);
		Results rObj = new Results(outputfile);

		MyArrayListTest tObj = new MyArrayListTest();
		try
		{
		while((currNumber = fpObj.readLine())!= null)
		{
			int number = Integer.parseInt(currNumber);
			//checking file elements between 0 to 10000
			if(number < 0 || number > 10000)
			{
				continue;				
			}
			else
			{
				arrObj.insertSorted(number);
			}
			
		
		}
		
		int sum = arrObj.sum();
	
		String strSum = Integer.toString(sum);
		
		tObj.testMe(arrObj, rObj);
		rObj.writeToFile(strSum);
		rObj.writeToStdout();
		
		}
		catch(FileNotFoundException e)
		{
			System.err.println("Exception");
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.err.println("Exception");
			e.printStackTrace();
		}
	}

}
