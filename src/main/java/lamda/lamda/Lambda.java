package lamda.lamda;

import java.io.File;
import java.io.FileFilter;

public class Lambda 
{
    

	public void printFiles(File dir)
    {
		
		FileFilter lambdaFilter = (File pathname) -> pathname.getName().endsWith(".java");
		
		File [] files = dir.listFiles(lambdaFilter);
		
		for(File file : files){
			System.out.println(this.getClass().getSimpleName() + " - File: " + file);
		}
		
		
    }
}
