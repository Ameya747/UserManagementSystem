package USM;

import java.util.Scanner;

public class UserController {
	
	public static void main(String[] args) {
		try {
		boolean Flag = true;
		UserServices U = new UserServiceImpl();
		Scanner Sc = new Scanner(System.in);
		int choice;
		System.out.println("----------Welcome To User Management System----------");
		while (Flag) {
			System.out.println("1.Create New User");
			System.out.println("2.Display Details Of the User");
			System.out.println("3.Update User");
			System.out.println("4.Delete User");
			System.out.println("5.Exit");
			System.out.print("Enter Your Choice 1-5 :"); 
				choice=Sc.nextInt();
				
				switch (choice) {
				case 1:
					U.createUser();

					break;
				case 2:
					U.displayuser();

					break;
				case 3:
					U.updateUser();

					break;
				case 4:
					U.deleteUser();

					break;
				case 5:
					System.out.println("Exiting....");
					Flag = false;
					break;

				default:
					System.out.println("Please Enter Valid Choice");
					break;

				}
			
		}
		System.out.println("Exited Successfully.....");
		}catch(Exception e) {
			main(args);
		}
	}
}
