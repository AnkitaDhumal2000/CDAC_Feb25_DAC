import java.io.*;  // all uncked exception is only in this package
class ChDemo4{
    public static void main(String[] args){
	     File f = new File("abc.txt"); //filenot found exception
		 
		 FileReader fr = new FileReader(f);// Checked Exception
	 }catch(FileNotFoundException e){
     }

	 
	}
	
}