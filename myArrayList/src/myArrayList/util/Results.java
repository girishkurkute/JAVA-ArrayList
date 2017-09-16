package myArrayList.util;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Results implements FileDisplayInterface, StdoutDisplayInterface{

	private String outputFileName;
	private ArrayList<String> FinalResults= new ArrayList<String>();
	public Results(String filename)
	{
		this.outputFileName=filename;
	}
	
	//Function to write print result stored in data structure 
	@Override
	public void writeToStdout() {
		// TODO Auto-generated method stub
		for(String temp : FinalResults)
		{
			System.out.println(temp);
		}
	}
	
	//Function to write result stored in data structure into text file
	@Override
	public void writeToFile(String temp) throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintWriter wrt = null;
		try
		{
			wrt = new PrintWriter(this.outputFileName);
		}
		catch(FileNotFoundException e)
		{
			throw new RuntimeException(e);
		}
		int sum = Integer.parseInt(temp);
		this.FinalResults.add("The sum of all the values in the array list is "+sum );
		
		for(String currentLine : FinalResults)
		{
			wrt.printf(currentLine);
			wrt.println();
		}

		wrt.close();
	}
	
	//Function to store result into data structure
	public void storeNewResult(String result)
	{
		this.FinalResults.add(result);
	}
}
