import java.util.*;
import java.io.*;

class User{

	String firstName;
	String lastName;
	int age;
	
	private String ssn;
	int id;
	String email;

	ArrayList<User> users = new ArrayList<User>();

	User(String firstName, String lastName, int age, String ssn, int id, String email){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.id = id;
		this.email = email;

		users.add(this);
	}

	public String getSsn(){
		return this.ssn;
	}

	public ArrayList<User> getUsers(){
		return this.users;
	}

	public User getUserById(int id){
		return users.stream()
					.filter(user -> user.id == id)
					.findAny()
					.orElse(null);
	}

	public String toString(){
		return this.firstName + " " + this.lastName;
	}

	// public void createUser(){

	// 	System.out.println("Enter First Name");
	// 	Scanner read = new Scanner(System.in);
	// 	String firstName = read.nextLine();

	// 	System.out.println("Enter Last Name");
	// 	String lastName = read.nextLine();

	// 	System.out.println("Enter your Age");
	// 	int age = read.nextInt();
	// 	read.nextLine();

	// 	System.out.println("Enter your SSN Number");
	// 	String ssn = read.nextLine();

	// 	System.out.println("Enter your ID");
	// 	int id = read.nextInt();
	// 	read.nextLine();

	// 	System.out.println("Enter your Email");
	// 	String email = read.nextLine();

	// 	this.createUserWithDetails(firstName, lastName, age, ssn, id, email);
	// }

	// public void updateUser(){

	// 	public void setFirstName(String firstName){
	// 	this.firstName = firstName;

	// 	public void setLastName(String lastName){
	// 	this.lastName = lastName;

	// 	public void setAge(int age){
	// 	this.age = age;

	// 	public void setSSN(String ssn){
	// 	this.ssn = ssn;

	// 	public void setId(int id){
	// 	this.id = id;

	// 	public void setEmail(String email){
	// 	this.email = email;

	// }


// public void updateUser(String firstName,String lastName,int age,String email){

// 	System.out.println("Enter new First Name");
// 		Scanner read = new Scanner(System.in);
// 		this.firstName = read.nextLine();

// 		System.out.println("Enter new Last Name");
// 		this.lastName = read.nextLine();

// 		System.out.println("Enter your new Age");
// 		this.age = read.nextInt();
// 		read.nextLine();


// 		System.out.println("Enter your new Email");
// 		this.email = read.nextLine();


// }

	// public String updateUser(){
	// 	System.out.println("Please enter new firstName to update");
	// 	Scanner read = new Scanner(System.in);
	// 	String name = read.nextLine();

	// 	// User user = users.find(user->user.firstName.equals(name));
	// 	return this.firstName;

		// System.out.println("Please enter new lastName to update");
		// this.lastName = read.nextLine();
		// return lastName;
		

	// }
	
}
