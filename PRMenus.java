package assessment;

public class PRMenus {

	public void menuDisplay() 
	{
		System.out.println("\n~~~ Welcome to “LockedMe.com” v1.0! ~~~ \n ");
		System.out.println("This app fetches data from your root directory "
				+ "and assists you to add / delete / search a file from it.");
		System.out.println("It is developed by Baljeet Kaur using Java 8.\n");

		System.out.println("Select one of the options from the below to continue..");
		System.out.println("1. View the list of existing files in ascending order");
		System.out.println("2. Add / Delete / Search file ");
		System.out.println("3. Exit the application\n");
		
	}
	
	public void menuDisplay2() 
	{
		System.out.println("\nSelect one of the options from the below to continue..");
		System.out.println("1. View the list of existing files in ascending order");
		System.out.println("2. Add / Delete / Search file ");
		System.out.println("3. Exit the application\n");
		
	}
	
	public void submenuDisplay() {
		System.out.println("Select one of the options from the below to continue..");
		System.out.println("1. Add file to the existing directory");
		System.out.println("2. Delete file from the existing directory");
		System.out.println("3. Search file in the existing directory");
		System.out.println("4. Return to the main menu\n");
	}
}
