import java.util.*;
import java.io.*;

class Bank_project{

	ArrayList<User> users = new ArrayList<User>();

public static ArrayList<User> getUsers(){
		return this.users;
	}
	
	
			
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

		User u = new User(firstName, lastName, age, ssn, id, email);
	}

	public static void main(String[] args){

		

		boolean isExit = true;	
		Bank b = new Bank();
	

		
		while(isExit){

			System.out.println("Please Enter your Cjoice:\n 1)USER\n2)BANK\n3)EXIT");
			Scanner read = new Scanner(System.in);
			int option = read.nextInt();
			

			switch(option){
				case 1:

					System.out.println("Please enter your choice: \n 1) CREATE USER\n 2)UPDATE USER\n 3)DELETE USER\n4)EXIT");

					int choiceU = read.nextInt();

					switch(choiceU){
						case 1:
							createUser();					
							System.out.println("SHOW USERS");
							ArrayList<User> users = new ArrayList<User>();
							users = getUsers();
							users.forEach(user->System.out.println(user.toString()));
							// users.add(u);
							System.out.println("First Name:  "+ users.firstName);
							break;
						case 2:
							// System.out.println("Please enter new firstName to update");
							// String firstNameUpdate = read.nextLine();
							// String newFirstName = u.updateUser(firstNameUpdate);


							// String updateFirstName = u.updateUser();
							// System.out.println("Your Updated First name is : " + updateFirstName);
							// System.out.println("SHOW USERS");
							// u.getUsers();
							// users.forEach(newUser->System.out.println(newUser.toString()));
				

							// u.updateUser();

							break;
						case 3:
							System.out.println("DELETE");
							break;
						case 4:
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
								b.createBank();
								System.out.println("SHOW BANK INFO");
								ArrayList<Bank> bankinfo = b.getBankInfo();
								bankinfo.forEach(info->System.out.println(info.toString()));
								break;
							case 2:
								System.out.println("UPDATE");
								break;
							case 3:
								System.out.println("DELETE");
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

