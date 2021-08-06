package fileProblems;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
 class Customer
{
	
	private int custID;
	private int accNo;
	private String name;
	//Default balance
	private Double balance = 1000.0;
	private String encryptedPwd;
	public Customer(int custID, int accNo, String name, Double balance, String encryptedPwd) {
		super();
		this.custID = custID;
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		this.encryptedPwd = encryptedPwd;
	}
	public Customer(int custID, int accNo, String name, String encryptedPwd) {
		super();
		this.custID = custID;
		this.accNo = accNo;
		this.name = name;
		this.encryptedPwd = encryptedPwd;
	}
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public String getEncryptedPwd() {
		return encryptedPwd;
	}
	public void setEncryptedPwd(String encryptedPwd) {
		this.encryptedPwd = encryptedPwd;
	}
	@Override
	public String toString() {
		return "Customer [custID=" + custID + ", accNo=" + accNo + ", name=" + name + ", balance=" + balance
				+ ", encryptedPwd=" + encryptedPwd + "]";
	}
	
	
		
}
public class bankZoho {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Customer> customerList = new ArrayList<Customer>();
    static int custIdRandom = 15;
	static int accNoRandom = 44045;
	
	public void starter()
	{
		System.out.println("Enter your choice:");
		System.out.println("1.Add new Customer.");
		System.out.println("2.Print all Customer.");
	    int choice = sc.nextInt();
	    sc.nextLine();
	    switch(choice)
	    {
	    case 1:
	    {
	    	addCustomer();
	    	starter();
	    	break;
	    }
	    case 2:
	    {
	    	printAllCustomer();
	    	starter();
	    	break;
	    }
	    default:
	    {
	    	starter();
	    }
	    }
	}
	
	public void addCustomer()
	{
		
		System.out.println("Enter your name:");
		String cusName = sc.nextLine();
		System.out.println("Enter new password:");
		String pass = sc.nextLine();
		System.out.println("confirm your password:");
		String confirmPass = sc.nextLine();
		if(pass.equals(confirmPass))
		{
			customerList.add(new Customer(custIdRandom++,accNoRandom++,cusName,encryptPassword(pass)));
			System.out.println("Successfully added!!");
			starter();
		}
		else
		{
			System.out.println("Please enter your password correctly.");
			addCustomer();
		}
	}
	
	
	public void printAllCustomer()
	{
		for(Customer c:customerList)
		{
			System.out.println(c);
		}
	}
	
	public String encryptPassword(String pass)
	{
		char[] arr = pass.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(char) (arr[i] + 1);
		}
		return new String(arr);
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//TASK 1
		customerList.add(new Customer(11,11011,"Kumar",10000.0,"ApipNbjm"));
		customerList.add(new Customer(12,22022,"Madhu",20000.0,"Cboljoj"));
		customerList.add(new Customer(13,33033,"Rahul",30000.0,"dbnqt"));	
		customerList.add(new Customer(14,44044,"Robin",40000.0,"kbwb22"));
		
		bankZoho obj = new bankZoho();
		obj.starter();
		
		

	}   
	

}
