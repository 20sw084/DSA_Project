import java.util.*;

public class Main {
	static HashTable passwords=new HashTable(20);
	
	public static void main(String[] args) {
		System.out.println("!!!Secure Password Manager!!!");
		System.out.println("\t!!!Welcome!!!");
		System.out.println("You must have to provide Username "
				+ "and Password to encrypt "
				+ "and decrypt the password.");
		System.out.println("Enter Username");
		String username=(new Scanner(System.in)).next();
		System.out.println("Enter Password");
		String password=(new Scanner(System.in)).next();
		System.out.println("Connection Established...");
		if(username.equalsIgnoreCase("Admin")&&username.equalsIgnoreCase("Admin")) {
		int choice=3;
		while(choice!=0) {
			System.out.println("------------------------------------------------");
			System.out.println("Enter 1, If you want to encrypt the password");
			System.out.println("Enter 2, If you want to decrypt any account password");
			System.out.println("Enter 0, If you want to Quit the program");
			
			choice=(new Scanner(System.in)).nextInt();
			if(choice==1) {
				System.out.println("Enter your account name");
				String name=(new Scanner(System.in)).next();
				System.out.println("Enter your account password to be encrypt");
				String pass=(new Scanner(System.in)).next();
				passwords.put(name,pass);
				
			}
			else if(choice==2) {
				System.out.println("Enter the account name for which you wants to decrypt the password");
				String acc=(new Scanner(System.in).next());
				Object pass=passwords.get(acc);
				if(pass==null)
					System.out.println("No Such Account Exists");
				else {
					System.out.println("Account : "+acc+", Password : "+pass);
				System.out.println("Enter 1, to show decryted password, "
						+ "\n OR Enter any number to continue");
//						+ " you must have to enter your password.");
				int ch=(new Scanner(System.in)).nextInt();
				if(ch==1) {
					System.out.println("Enter your Password to show decrypted password");
					String pas=(new Scanner(System.in)).next();
					if(pas.equalsIgnoreCase("admin")) {
						pass=passwords.getDecrypted(acc);
						System.out.println("Account : "+acc+", Password : "+pass);
					
					}
				}
				else {}					
				}
			}	
		}
		
		}
		else {
			System.out.println("Invalid Username or Password");
		}
	}
}
