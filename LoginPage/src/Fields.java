import java.util.Scanner;

public class Fields {
	
	String name;
	String surname;
	String password;
	int mobileNum;
			
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first name:= ");
		
		name=sc.next();
		
		System.out.println("Enter the surname:= ");
		surname=sc.next();
		
		System.out.println("Enter the mobile number:= ");
		mobileNum=sc.nextInt();
		
		System.out.println("Enetr the password:= ");
		password=sc.next();
		
		
	}
	
	public void display()
	{
		System.out.println("LoginPage");
		System.out.println("Name= "+name);
		System.out.println("Surname= "+surname);
		System.out.println("Mobile Number= "+mobileNum);
		System.out.println("Password= **********");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fields f=new Fields();
		
		f.input();
		f.display();
		
		
	
	}

}
