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
	
	@Override
	public void writeToStdout() {
		// TODO Auto-generated method stub
		for(String temp : FinalResults)
		{
			System.out.println(temp);
		}
	}
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
		//wrt.printf("The sum of all the values in the array list is:%d",sum );
		//wrt.println();
		wrt.close();
	}
	
	public void storeNewResult(String result)
	{
		this.FinalResults.add(result);
	}
}
