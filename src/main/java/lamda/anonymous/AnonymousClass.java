package lamda.anonymous;

import java.io.File;
import java.io.FileFilter;

public class AnonymousClass {
	
	public void printFiles(File dir)
    {
        FileFilter filter = new FileFilter() {
			
			public boolean accept(File pathname) {
				
				return pathname.getName().endsWith(".java");
			}
		};
		
		
		
		File [] files = dir.listFiles(filter);
		
		for(File file : files){
			System.out.println(this.getClass().getSimpleName() + " - File: " + file);
		}
		
		
    }

}
