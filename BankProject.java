import java.util.*;
import java.io.*;

class BankProject{
	
	private static ArrayList<User> users = new ArrayList<User>();

	public static void createUser(){

		System.out.println("Enter First Name");
		Scanner read = new Scanner(System.in);
		String firstName = read.nextLine();

		System.out.println("Enter Last Name");
		String lastName = read.nextLine();

		System.out.println("Enter your Age");
		int age = read.nextInt();
		read.nextLine();

		System.out.println("Enter your SSN Number");
		String ssn = read.nextLine();

		System.out.println("Enter your ID");
		int id = read.nextInt();
		read.nextLine();

		System.out.println("Enter your Email");
		String email = read.nextLine();

		User user = new User(firstName, lastName, age, ssn, id, email);
		users.add(user);
		
	}
public void createBank(){

		System.out.println("Enter Account Number");
		Scanner read = new Scanner(System.in);
		String accountNum = read.nextLine();

		System.out.println("Enter Balance Amount");
		int amount = read.nextInt();
		read.nextLine();

		System.out.println("Enter How many users are shared");
		int shared = read.nextInt();
		read.nextLine();

		System.out.println("Is your account shared?");
		boolean sharedUserId = read.nextBoolean();

		System.out.println("Enter your Bank Name");
		String bankName = read.nextLine();
		read.nextLine();

		System.out.println("Enter Bank Id");
		int bankId = read.nextInt();
		read.nextLine();

		Bank bank = new Bank(accountNum,amount,shared,sharedUserId,bankName,bankId);
		
	}


	public static void showUser(){
		if(users.size() >= 1){
			System.out.println("PLEASE ENTER ID TO ACCESS INFO");
			Scanner read = new Scanner(System.in);
			int id = read.nextInt();
			User user = getUserById(id);
			System.out.println(user.toString());
		}
		else{
			System.out.println("NO USERS AVAILABLE");
		}
		
	}

	public static User getUserById(int id){
		return users.stream()
					.filter(user -> user.id == id)
					.findAny()
					.orElse(null);
	}

	public static void main(String[] args){

		Bank bankObj = new Bank();
		boolean isExit = true;	
		
		while(isExit){

			System.out.println("Please Enter your Choice:\n 1)USER\n2)BANK\n3)EXIT");
			Scanner read = new Scanner(System.in);		
			int option = read.nextInt();

			switch(option){
				case 1:

					System.out.println("Please enter your choice: \n 1) CREATE USER\n 2)UPDATE USER\n 3)DELETE USER\n4)SHOW USER\n5)EXIT");
					int choiceU = read.nextInt();

					switch (choiceU) {
						// Create User
						case 1: 
							createUser();	
							System.out.println("User details are: ");				
							users.forEach(user->System.out.println( user.toString()));
							break;
						// Update User
						case 2:
							System.out.println("Please enter ID to update record");
							int idToUpdate = read.nextInt();
							read.nextLine();

							if(users.size() >= 1) {
								for(User userToUpdate : users){
									if(userToUpdate.id == idToUpdate){
										System.out.println("First Name: ");
										userToUpdate.firstName = read.nextLine();
										System.out.println("Last Name: ");
										userToUpdate.lastName = read.nextLine();
										System.out.println("Age: ");
										userToUpdate.age = read.nextInt();
										read.nextLine();
										System.out.println("Email: ");
										userToUpdate.email = read.nextLine();
									}
								}
							}
							showUser();
							break;
						case 3:
							System.out.println("Enter ID to DELETE User record");
							int idToDelete = read.nextInt();
							read.nextLine();
							if(users.size() >= 1) {
								for (User user : users ) {
									if(user.id == idToDelete) {
										users.remove(idToDelete);										
									}
								}
							} else {
								System.out.println("NO USERS AVAILABLE");
							}
							break;
						case 4: 
							System.out.println("User Information: ");
							showUser();
						case 5:
							isExit = !isExit;
							break;
						default: 
							System.out.println("Please Enter Valid input");
							break;
					}
					break;

				case 2:
					System.out.println("Please enter your choice: 1) CREATE BANK ACCOUNT\n 2)UPDATE BANK ACCOUNT\n 3)DELETE BANK ACCOUNT\n4)EXIT");
					int choiceB = read.nextInt();

					switch(choiceB){
						case 1:
							bankObj.createBank();
							System.out.println("SHOW BANK INFO");
							ArrayList<Bank> bankinfo = bankObj.getBankInfo();
							bankinfo.forEach(info->System.out.println(info.toString()));
							break;
						case 2:
							System.out.println("UPDATE");
							break;
						case 3:
							System.out.println("DELETING THE RECORD");
							



							break;
						case 4:
							isExit = !isExit;
							break;
						default: 
							System.out.println("Please Enter Valid input");
							break;
					}
					break;
				case 3: 
					isExit = !isExit;
					break;
			}

		}
	}
}



