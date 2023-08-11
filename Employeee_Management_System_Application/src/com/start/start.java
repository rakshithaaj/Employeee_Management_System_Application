package com.start;

import java.io.BufferedReader;


import java.io.IOException;
import java.io.InputStreamReader;

import com.entity.Employeee;
import com.Dao.EmployeeeDao;


public class start {

	public static void main(String[] args) throws IOException {
		System.out.println("welcome to Employeee Manangement System Application");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go=true;
		while(go)
		{
			System.out.println("press 1 to ADD new Employeee");
			System.out.println("press 2 to delete Employeee");
			System.out.println("press 3 to display Employeee");
			System.out.println("press 4 to Update Employeee");
			System.out.println("press 5 to search Employeee");
			System.out.println("press 6 to count total records ");
			System.out.println("press 7 to display records  in decending order");
			System.out.println("press 8 for like operator");
			System.out.println("press 9 to exit Application");

			int c=Integer.parseInt(br.readLine());

			switch (c) 
			{
			case 1: //add student
				System.out.println("enter Employeee id :");
				int id = Integer.parseInt(br.readLine());

				System.out.println("Enter Employeee name :");
				String name= br.readLine();

				System.out.println("Enter Employeee phone no :");
				String phone= br.readLine();

				System.out.println("Enter Employeee city :");
				String city= br.readLine();

				//create student object to store the data 
				Employeee st = new Employeee(id,name, phone,city);


				boolean ans = EmployeeeDao.insertEmployeee(st);

				if(ans)
				{
					System.out.println("Employeee is added successfully");
				}
				else
				{
					System.out.println("Something went wrong");
				}
				System.out.println(st);
				break;

			case 2: // delete Employeee
				System.out.println("enter Employeee id which you want to delete");
				int userId = Integer.parseInt(br.readLine());
				boolean f= EmployeeeDao.deleteEmployeee(userId);
				if(f)
				{
					System.out.println("Employeee data deleted successfully");
				}
				else
				{
					System.out.println("Something went wrong..!!");
				}
				break;

			case 3: // display Employeee
				EmployeeeDao.showAllEmployeee();
				break;

			case 4: // update Employeee
				System.out.println("enter Employeee id whose data you want to update");
				int userId2 = Integer.parseInt(br.readLine());

				System.out.println("enter Employeee id :");
				int id2 = Integer.parseInt(br.readLine());

				System.out.println("Enter Employeee name :");
				String name2= br.readLine();

				System.out.println("Enter Employeee phone no :");
				String phone2= br.readLine();

				System.out.println("Enter Employeee city :");
				String city2= br.readLine();

				//create Employeee object to store the data 
				Employeee st2 = new Employeee(id2,name2,phone2,city2);

				boolean ans2 = EmployeeeDao.updateEmployeee(st2,userId2);

				if(ans2)
				{
					System.out.println("Employeee is updated successfully");
				}
				else
				{
					System.out.println("Something went wrong");
				}
				System.out.println(st2);
				break;
			case 5:
				System.out.println("enter Employeee id which you want to search");
				int id3 = Integer.parseInt(br.readLine());

				EmployeeeDao.searchEmployeee(id3);



				break;

			case 6:
				break;

			case 7:
				break;
			case 8:
				break;
			case 9: // exit
				go=false;
				break;


			default:
				System.out.println("wrong choice try again");
			}



			}
		System.out.println("thankyou for using my application!!");


		}

	}

	


