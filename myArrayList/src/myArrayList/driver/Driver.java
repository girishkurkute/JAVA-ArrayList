package myArrayList.driver;

import java.util.InputMismatchException;

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
				//method to insert element
			}
			
		
		}

	}

}
