package myArrayList.util;

import java.util.ArrayList;

public class Results {

	private String outputFileName;
	private ArrayList<String> FinalResults= new ArrayList<String>();
	public Results(String filename)
	{
		this.outputFileName=filename;
	}
	
	public void storeNewResult(String result)
	{
		this.FinalResults.add(result);
	}
}
