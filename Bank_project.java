import java.util.*;
import java.io.*;

class Bank_project{

	// ArrayList<User> users = new ArrayList<User>();

	public static void main(String[] args){

		// User u = new User("Ananya", "Bogaram",20, 1234567891, "ananya@gmail.com");
		// System.out.println(u.firstName);
		// boolean exit = true;

		User u = new User();
		Bank b = new Bank();
		
		// while(!exit){
			System.out.println("Please Enter your Cjoice:\n 1)USER\n2)BANK\n3)EXIT");
			Scanner read = new Scanner(System.in);
			int option = read.nextInt();
			

			switch(option){
				case 1:

					System.out.println("Please enter your choice: 1) CREATE USER\n 2)UPDATE USER\n 3)DELETE USER\n4)EXIT");

					int choiceU = read.nextInt();

					switch(choiceU){
						case 1:
							u.createUser();
							System.out.println("SHOW USERS");
							ArrayList<User> users = u.getUsers();
							users.forEach(user->System.out.println(user.toString()));
							// users.add(u);
							// System.out.println("First Name:  "+ u.firstName);
							break;
						case 2:
							System.out.println("Please enter new firstName to update");
							String firstNameUpdate = read.nextLine();
							u.setFirstName(firstNameUpdate);
							break;
						case 3:
							System.out.println("DELETE");
							break;
						// case 4:
						// 	exit = false;
						// 	break;
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
							// case 4:
							// 	exit = false;
							// 	break;
							default: 
								System.out.println("Please Enter Valid input");
								break;
						}
						break;
				// case 3: 
				// 	exit = false;
			}
		}

	}		

