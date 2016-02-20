import java.io.File;
import java.io.FileFilter;

import lamda.anonymous.AnonymousClass;
import lamda.lamda.Lambda;


public class App {
	
	
	public static void main( String[] args )
    {
		File dir = new File("C:\\logs");
		
		AnonymousClass anonymous = new AnonymousClass();
		anonymous.printFiles(dir);
		
		Lambda lambda = new Lambda();
		lambda.printFiles(dir);
		
    }

}
