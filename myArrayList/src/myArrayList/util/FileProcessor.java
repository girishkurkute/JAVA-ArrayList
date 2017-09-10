package myArrayList.util;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileProcessor {

private Scanner scn = null;
	

	
	public FileProcessor(String inputfile)throws Exception {
		// TODO Auto-generated constructor stub
		scn = new Scanner(new File(inputfile));
	}

	public String readLine() throws FileNotFoundException
	{
		try
		{
			String currLine;
			if(scn == null)
			{
				throw new RuntimeException("File closed");
				
			}
			while(scn.hasNext())
			{
				currLine = scn.next();
				return currLine;
			}
			currLine = null;
			disposeScanner();
			return currLine;
		}
		catch(Exception e)
		{
			disposeScanner();
			throw e;
		}
	}

	public void disposeScanner() 
	{
		if(scn != null)
		{
			scn.close();
			scn = null;
		}
		
	}

}
