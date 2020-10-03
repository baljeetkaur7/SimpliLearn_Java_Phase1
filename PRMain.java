package assessment;

import java.util.Scanner;

public class PRMain {

	public static void main(String[] args) {
		
		int choiceM = 0;
		PRMenus pr1 = new PRMenus();
		BLdirectory bl = new BLdirectory();
		pr1.menuDisplay();
		
		do {
			Scanner s1 = new Scanner(System.in);
			try {
				choiceM = Integer.parseInt(s1.nextLine());
			}
			catch (NumberFormatException e){
				System.out.println("Select from the valid options listed above - 1, 2 or 3 ...\n");
				choiceM = 0;
				}
			
			switch (choiceM) {
			case 1:
				bl.displayFiles();
				break;	
				
			case 2:
				int schoiceM = 0;
				pr1.submenuDisplay();
				do {
				Scanner s2 = new Scanner(System.in);
				try {
					schoiceM = Integer.parseInt(s2.nextLine());
				} 
				catch(NumberFormatException e1) {
					System.out.println("Select from the valid options listed above - 1, 2, 3 or 4 ...\n");
					schoiceM = 0;
				}
				switch (schoiceM) {
				case 1:
					bl.addFiles();
					break;
				case 2:
					bl.deleteFiles();
					break;
				case 3:
					bl.searchFiles();
					break;
				}
				
				if (schoiceM == 1 | schoiceM == 2 | schoiceM == 3) {
					pr1.submenuDisplay();
					}
				}
				while (schoiceM != 4);
				break;
			}
			
			if (choiceM == 1 | choiceM == 2) {
				pr1.menuDisplay2();
			}
			
		} while (choiceM != 3);
	
		System.out.println("~~~ Closing the application ~~~");

	}

}
