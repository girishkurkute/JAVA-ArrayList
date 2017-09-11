package myArrayList.driver;

import java.util.InputMismatchException;

import myArrayList.MyArrayList;
import myArrayList.util.FileProcessor;

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
		
		FileProcessor fpObj = new FileProcessor(inputfile);
		MyArrayList arrObj = new MyArrayList();
		
		while((currNumber = fpObj.readLine())!= null)
		{
			int number = Integer.parseInt(currNumber);
			System.out.println(currNumber);
			if(number < 0 || number > 10000)
			{
				
				fpObj.disposeScanner();
				throw new InputMismatchException("Invalid number "+number);
			}
			else
			{
				arrObj.insertSorted(number);
			}				
		}
		arrObj.removeValue(5);
		int a=arrObj.indexOf(6);
		System.out.println("index of 6:"+a);
		int size = arrObj.size();
		System.out.println("Total elements in array is "+size);
		int sum = arrObj.sum();
		System.out.println("The sum of all the values in the array list is:"+sum);
		
	}

}
