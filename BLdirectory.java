package assessment;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BLdirectory {

	private File dirPath = new File("/home/baljeetkaur7gma/Desktop/Phase1_Java/myFirstJavaProject/");
//	private File dirPath = new File("/home/baljeetkaur7gma/Desktop/Phase1_Java/");

	public void displayFiles() {
			
		File[] filenames = dirPath.listFiles();
		ArrayList<String> arlist = new ArrayList<String>();
					
		for(int i = 0; i < filenames.length; i++)
		{
			if (filenames[i].isFile() && filenames[i].isHidden()==false) {
				arlist.add(filenames[i].getName());
			}
		}
			
		Collections.sort(arlist, String.CASE_INSENSITIVE_ORDER);
		if (arlist.isEmpty()){
			System.out.println("Root: " + dirPath.getAbsolutePath());
			System.out.println("No files in the root directory");
		} 
		else {
			System.out.println("Files in the root directory excluding sub-folders and hidden files - \n");
			System.out.println("Root: " + dirPath.getAbsolutePath());
			int counter = 1;
			for (String str : arlist) {
					
				System.out.println(counter + ". " +str);
				counter = counter+1;
			}
		}
	}
		
	public void addFiles() {
			
		String readInput;
		String addFile;
			
		System.out.println("\n");
		System.out.println("Provide the filename to be added to the root directory - ");
		Scanner s1 = new Scanner(System.in);
		readInput = s1.nextLine();
			
		addFile = dirPath.getAbsolutePath().concat("/").concat(readInput);
		File myCobj = new File(addFile);
			
		try {
			if(myCobj.createNewFile()) {
				System.out.println("File " + readInput + " added to the root directory\n");
			}
			else {
				System.out.println("File " +readInput + " already exists in the root directory. "
						+ "Try adding the file with another name\n");
			}
		} catch (IOException e) {
			System.out.println("File " + readInput + " could not be added. Please try again\n");
		}
					
	}

	public void deleteFiles() {
			
		String readInput;
		String delFile;
		System.out.println("\n");
		System.out.println("Provide the filename to be deleted from the root directory - ");
		Scanner s1 = new Scanner(System.in);
		readInput = s1.nextLine();
			
		delFile = dirPath.getAbsolutePath().concat("/").concat(readInput);
		File myDobj = new File(delFile);
		if(myDobj.delete()) {
			System.out.println("File " + readInput + " deleted from the root directory\n");
		}
		else {
			System.out.println("File " + readInput + " not found in the root directory\n");
		}
				
	}
		
	public void searchFiles() {
			
		String readInput;
					
		File[] filenames = dirPath.listFiles();
		ArrayList<String> arlist = new ArrayList<String>();
		for(int i = 0; i < filenames.length; i++)
		{
			if (filenames[i].isFile() && filenames[i].isHidden()==false) {
				arlist.add(filenames[i].getName());
			}
		}
			
		Collections.sort(arlist, String.CASE_INSENSITIVE_ORDER);
			
		System.out.println("\n");
		System.out.println("Provide the filename to be searched in the root directory - ");
		Scanner s1 = new Scanner(System.in);
		readInput = s1.nextLine();
			
		if (arlist.contains(readInput)) {
			System.out.println("File " +readInput + " is present in the root directory\n");
		}
		else {
			System.out.println("File " +readInput + " is NOT present in the root directory\n");
		}
			
	}

	public File getDirPath() {
		return dirPath;
	}

	public void setDirPath(File dirPath) {
		this.dirPath = dirPath;
	}

	
}

