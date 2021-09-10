package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

 class transaction {
	private int transId;
	private String transType;
	private double amount;
	private double balance;
	
	
	public int getTransId() {
		return transId;
	}
	public void setTransId(int transId) {
		this.transId = transId;
	}
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "transaction [transId=" + transId + ", transType=" + transType + ", amount=" + amount + "]";
	}
	
	
	public transaction(int transId, String transType, double amount,double balance) {
		super();
		this.transId = transId;
		this.transType = transType;
		this.amount = amount;
		this.setBalance(balance);
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
 class customer {
	private int custId, accNo;
	private String name, encryptedPwd;
	private double balance;
	private String[] pwds = new String[3];
	

	private List<transaction> transList = new ArrayList<>();
	
	private int transCount=0, pwdCount;

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
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

	public List<transaction> getTransList() {
		return transList;
	}

	public void setTransList(List<transaction> transList) {
		this.transList = transList;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEncryptedPwd() {
		return encryptedPwd;
	}

	public void setEncryptedPwd(String encryptedPwd) {
		this.encryptedPwd = encryptedPwd;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String[] getPwds() {
		return pwds;
	}

	public void setPwds(String[] pwds) {
		this.pwds = pwds;
	}

	public int getTransCount() {
		return transCount;
	}

	public void setTransCount(int transCount) {
		this.transCount = transCount;
	}

	public int getPwdCount() {
		return pwdCount;
	}

	public void setPwdCount(int pwdCount) {
		this.pwdCount = pwdCount;
	}

	@Override
	public String toString() {
		return "customer [custId=" + custId + ", accNo=" + accNo + ", name=" + name + ", encryptedPwd=" + encryptedPwd
				+ ", balance=" + balance + ", pwds=" + Arrays.toString(pwds) + ", transCount=" + transCount
				+ ", pwdCount=" + pwdCount + "]";
	}

	public customer(int custId, int accNo, String name, String encryptedPwd, double balance) {
		this.custId = custId;
		this.accNo = accNo;
		this.name = name;
		this.encryptedPwd = encryptedPwd;
		this.balance = balance;
		this.transList.add(new transaction(1,"Opening"+accNo,10000,10000));
		this.transCount = 1;
	}


	
	
}

public class bankZoho {
	
	static List<customer> custList = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		custList.add(new customer(11,11011,"Kumar","ApipNbjm",10000.0));
		custList.add(new customer(22,22022,"Madhu","Cboljoh",20000.0));
		custList.add(new customer(33,33033,"Rahul","dbnqvt",30000.0));
		custList.add(new customer(44,44044,"Robin","kbwb22",40000.0));
		
		getDetails();
		
	}

	public static boolean authenticate(String uname, String pwd)
	{
		System.out.println(uname+" "+pwd);
		if(uname.equals("admin") && pwd.equals("admin"))
		{
			System.out.println("Welcome admin");
			return true;
		}
		else
		{
			for(customer c : custList)
			{
				if(c.getName().equals(uname) && c.getEncryptedPwd().equals(encryptPwd(pwd)))
				{
					System.out.println("Authentication Success");
					return true;
				}
			}
			System.out.println("NO USER OR PWD FOUND!!!!\n Redirecting.....");
			return false;
		}
	}
	
	
	public static void getDetails()
	{
		
		
		System.out.println("-------------Banking Application-------------------------");
		System.out.println("1. Add new Customer");
		System.out.println("2. Basic Operations");
		System.out.println("3. View Transaction History");
		
		System.out.println("Enter your Choice : ");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			addCustomer();
			break;
		case 2:
			basicOperation();
			break;
		case 3:
			viewTransactions();
			break;
		default:
			System.out.println("Enter proper value!!!");
			getDetails();
			
		}

	}
	
	//TASK 2
	public static void addCustomer()
	{
		String uname ,pwd;
		sc.nextLine();
		uname=sc.nextLine();
		pwd=sc.nextLine();
		if(authenticate(uname,pwd))
		{
			System.out.println("Enter Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			String finale = askPwd();
			int id = generateId();
			int acc = genreateAcc(id);
			
			System.out.println("Customer added..! \nCustomer ID : "+id+"\nAccount no. : "+acc);
			System.out.println(finale);
			custList.add(new customer(id,acc,name,finale,10000.0));
		}
		else
		{
			System.out.println("Wrong Credentials!!!!");
		}
			getDetails();
	}
	
	
	public static String askPwd()
	{
		boolean ask = true;
		String finale="";
		while(ask)
		{
		System.out.println("Enter Password: ");
		String pwd = sc.nextLine();
		if(checkPwd(pwd))
		{
				System.out.println("Re-enter Password: ");
				String rpwd = sc.nextLine();
				if(pwd.equals(rpwd))
				{
					finale = encryptPwd(pwd);
					break;
				}
		}
		else
		{
			System.out.println("WEAK PASSWORD..!!!!!\nPassword must have\ni)2 lower case\nii)2 Upper case\niii)2 Numbers");
		}
		}
		return finale;
	}
	
	//TASK 3
	public static String encryptPwd(String org)
	{
		String ret = "";
		for(int i=0;i<org.length();i++)
		{
			char c = org.charAt(i);
			if(c=='z') c='a';
			else if(c=='Z') c='A';
			else if(c=='9') c='0';
			else c++;
			ret=ret+c+"";
		}
		
		return ret;
	}
	
	public static int generateId()
	{
		int id = 0000;
		for(customer c: custList)
			id = c.getCustId();
		id = id+11;
		return id;
	}
	
	public static int genreateAcc(int id)
	{
		String s = id+"0"+id;
		int acc = Integer.parseInt(s);
		return acc;
	}
	
	
	//TASK 5
	public static void basicOperation()
	{
		System.out.println("Enter the option :\n 1. ATM Withdrawal\n 2. Cash deposit\n 3. Account transfer\n 4.Go Back");
		System.out.println("Enter your Choice : ");
		int ch = sc.nextInt();
		if(ch==1)	atmWithdrawal();
		else if (ch==2)	cashDeposit();
		else if(ch==3) accountTransfer();
		else getDetails();
	}
	
	public static void  atmWithdrawal()
	{
		System.out.println("-------------------ATM WITHDRAWAL-------------------");
		String uname, pwd;
		System.out.println("Enter: \nUsername: ");
		//sc.next();
		sc.nextLine();
		uname = sc.nextLine();
		System.out.println("Password: ");
		//sc.nextLine();
		pwd = sc.nextLine();

		if(authenticate(uname,pwd))
		{
			for(customer c: custList)
			{
				if(uname.equals(c.getName()));
				{
							double amt;
							System.out.println("Enter amount : ");
							amt = sc.nextDouble();
							if(checkBal(uname,amt)==true)
							{
						c.setBalance(c.getBalance()-amt);
						
						c.setTransCount(c.getTransCount()+1);
						List<transaction> transList = c.getTransList();
						transList.add(new transaction(c.getTransCount(),"ATMWithdrawal",amt,c.getBalance()));
						c.setTransList(transList);
						System.out.println("SUCCESS...!!!\nDo you wish to Continue...??!!(Y/N): ");
						char ch = sc.next().charAt(0);
						if(ch=='Y')
							basicOperation();
						else
							getDetails();
					}
					else
						break;
				}
			}
		}
		else
			basicOperation();
	}
	
	public static boolean checkBal(String n,double amt)
	{
		for(customer c: custList)
		{
			if(n.equals(c.getName()));
			{
				System.out.println(c.getBalance());
				if(c.getBalance()-amt > 999)
					return true;
				else
				{
					System.out.println("Insufficient Balance!!!!");
					return false;
				}	
			}
		}
		return false;
	}
	
	public static void cashDeposit()
	{
		String uname, pwd;
		System.out.println("Enter: \nUsername: ");
		sc.nextLine();
		uname = sc.nextLine();
		System.out.println("Password: ");
		pwd = sc.nextLine();
		if(authenticate(uname,pwd))
		{
			for(customer c: custList)
			{
				if(uname.equals(c.getName()));
				{
					double amt;
					System.out.println("Enter amount: ");
					amt=sc.nextDouble();
					c.setBalance(c.getBalance()+amt);
					List<transaction> transList = c.getTransList();
					transList.add(new transaction(c.getTransCount(),"CashDeposit",amt,c.getBalance()));
					c.setTransList(transList);
					System.out.println("SUCCESS...!!!\nDo you wish to Continue...??!!(Y/N): ");
					char ch = sc.next().charAt(0);
					if(ch=='Y')
						basicOperation();
					else
						getDetails();
				}
			}
		}
	}
	
	public static void accountTransfer()
	{
		String uname, pwd;
		System.out.println("Enter: \nUsername: ");
		sc.nextLine();

		uname = sc.nextLine();
		System.out.println("Password: ");
		pwd = sc.nextLine();
		if(authenticate(uname,pwd))
		{
			for(customer c: custList)
			{
				if(uname.equals(c.getName()));
				{
					int acc;
					System.out.println("Enter the Beneficiary's Account nunmber: ");
					acc=sc.nextInt();
					for(customer to : custList)
					{
						System.out.println(acc+" "+to.getAccNo());
						if(acc==to.getAccNo())
						{
							double amt;
							System.out.println("Enter amount to send to "+to.getName());
							amt = sc.nextDouble();
							if(checkBal(uname,amt)==true)
							{
								c.setBalance(c.getBalance()-amt);
								to.setBalance(to.getBalance()+amt);
								
								List<transaction> transList = c.getTransList();
								transList.add(new transaction(c.getTransCount(),"TransferTo "+to.getAccNo(),amt,c.getBalance()));
								c.setTransList(transList);
								
								transList = to.getTransList();
								transList.add(new transaction(c.getTransCount(),"TransferFrom "+c.getAccNo(),amt,to.getBalance()));
								to.setTransList(transList);
								
								
								System.out.println("SUCCESS...!!!\nDo you wish to Continue...??!!(Y/N): ");
								char ch = sc.next().charAt(0);
								if(ch=='Y')
									basicOperation();
								else
									getDetails();
							}
							else basicOperation();
						}
						
					}
					System.out.println("Beneficiary not found");
					basicOperation();
				}
			}
		}
	}
	
	
	//TASK 6
	public static void viewTransactions()
	{
		System.out.println("-------------------View Transactions-------------------");
		String uname, pwd;
		System.out.println("Enter: \nUsername: ");
		sc.nextLine();
		uname = sc.nextLine();
		System.out.println("Password: ");
		pwd = sc.nextLine();
		if(authenticate(uname,pwd))
		{
			for(customer c: custList)
			{
				if(c.getName().equals(uname))
				{
					System.out.println("Account Statement\nName - "+uname+"\nAccount No - "+c.getAccNo()+"\nCustomer Id - "+c.getCustId());
					System.out.println("TransID\tTransType\t\tAmount\tBalance");
					//System.out.println(c.getTransList());
					for(transaction t : c.getTransList())
					{
						
						System.out.println(t.getTransId()+"\t"+t.getTransType()+"\t\t"+t.getAmount()+"\t"+t.getBalance());
					}
				}
			}
		}
		System.out.println("Do you wish to Continue...??!!(Y/N): ");
		char ch = sc.next().charAt(0);
		if(ch=='Y')
			getDetails();
		else
			getDetails();
		
	}
	
	
	//TASK 8
	public static boolean checkPwd(String pwd)
	{
		int l=0,u=0,n=0;
		if(pwd.length()<5)
			return false;
		else
		{
			for(int i=0;i<pwd.length();i++)
			{
				if(pwd.charAt(i) > 64 && pwd.charAt(i) < 91) u++;
				else if(pwd.charAt(i) > 96 && pwd.charAt(i) < 123) l++;
				else if(pwd.charAt(i) > 47 && pwd.charAt(i) < 58) n++;
			}
			if(u>1 && l>1 && n>1) return true;
			else return false;
		}
	}
}