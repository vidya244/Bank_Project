import java.util.*;
import java.io.*;

class Bank{

	private String accountNum;

	int amount;
	int shared;
    boolean sharedUserId;
	String bankName;

	private int bankId;


	ArrayList<Bank> bankinfo = new ArrayList<Bank>();

	Bank(){

	}

	private void createBank(String accountNum, int amount, int shared, boolean sharedUserId, String bankName, int bankId){
		this.accountNum = accountNum;
		this.amount = amount;
		this.shared = shared;
		this.sharedUserId = sharedUserId;
		this.bankName = bankName;
		this.bankId = bankId;

		bankinfo.add(this);
	}

	public String getAccNum(){
		return this.accountNum;
	}

	public int getBankId(){
		return this.bankId;
	}

	public ArrayList<Bank> getBankInfo(){
		return this.bankinfo;
	}

	public String toString(){
		return this.bankName + " " + this.bankId;
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

		this.createBank(accountNum,amount,shared,sharedUserId,bankName,bankId);

	}

}