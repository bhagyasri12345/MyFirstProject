package com.ManageCourse;
import java.sql.SQLException;
import java.util.Scanner;
public class course {
	public static void main(String[] args) throws SQLException 
	{
			Scanner sc= new Scanner(System.in);
			String loop="y";
			while(loop.equals("y")) 
			{
				System.out.println("***************************************************");
				System.out.println("                                                   ");
				System.out.println("-------------COURSE MANAGEMENT---------------------");
				System.out.println("                                                   ");
				System.out.println("***************************************************");
				System.out.println("1. Registration For Student");
				System.out.println("2. Student Login");
				System.out.println("3. Enter Course Deatils");
				System.out.println("4.  View Course Details");
				System.out.println("\n Enter your choice: ");
main m=new main();
				
				int a = sc.nextInt();
				switch(a) {
				case 1:m.student_registration();
					break;
				case 2:m.student_login();
					
					break;
				case 3:m.details();
				break;
				case 4:m.course_details();
				break;
				default:
					System.out.println("Enter valid choice");
				}
				System.out.println("Do you wish to continue: y/n");
				loop = sc.next();
			}
			sc.close();
			
			
			
	}
	}
