package com.Dao;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.connectionjdbc.Connectionjdbc;
import com.entity.Employeee;

public class EmployeeeDao {
	
	public static boolean insertEmployeee(Employeee st)
	{
		boolean f=false;
		try
		{
		//jdbccode 
		Connection con = Connectionjdbc.createC();
		String q="Insert into Employeee(sid,sname, sphone, scity) values(?,?,?,?)";
		PreparedStatement p = con.prepareStatement(q);

		p.setInt(1, st.getEmployeeeId());
		p.setString(2, st.getEmployeeeName());
		p.setString(3, st.getEmployeeePhone());
		p.setString(4, st.getEmployeeeCity());


		//execute

		p.executeUpdate();
		f=true;

		}

		catch(Exception e)
		{
			e.printStackTrace();
		}

		return f;
	}

	public static boolean deleteEmployeee(int userId) {

		boolean f=false;
		try
		{
		//jdbccode 
		Connection con = Connectionjdbc.createC();
		String q="delete from Employeee where sid=?";
		PreparedStatement p = con.prepareStatement(q);

		p.setInt(1, userId);


		//execute

		p.executeUpdate();
		f=true;

		}

		catch(Exception e)
		{
			e.printStackTrace();
		}

		return f;

	}

	public static void showAllEmployeee() {
		//boolean f=false;
		try
		{
		//jdbccode 
		Connection con = Connectionjdbc.createC();
		String q="select * from Employeee;";

       Statement s= con.createStatement();

       ResultSet set =s.executeQuery(q);

       while(set.next())
       {
    	   int id= set.getInt(1);
    	   String name =set.getString(2);
    	   String phone =set.getString(3);
    	   String city =set.getString(4);

    	   System.out.println("ID: "+id);
    	   System.out.println("Name: "+name);
    	   System.out.println("Phone no :"+phone);
    	   System.out.println("city: "+city);

    	   System.out.println("_______________________________________________________________");




       }

		}

		catch(Exception e)
		{
			e.printStackTrace();
		}



	}

	public static boolean updateEmployeee(Employeee st, int userId2) {
		boolean f=false;
		try
		{
		//jdbccode 
		Connection con = Connectionjdbc.createC();
		String q="update Employeee set sid=?, sname=?,sphone=? ,scity=? where sid=?";
		PreparedStatement p = con.prepareStatement(q);

		p.setInt(1, st.getEmployeeeId());
		p.setString(2, st.getEmployeeeName());


		p.setString(3, st.getEmployeeePhone());
		p.setString(4, st.getEmployeeeCity());
		p.setInt(5, userId2);


		//execute

		p.executeUpdate();
		f=true;

		}

		catch(Exception e)
		{
			e.printStackTrace();
		}

		return f;

	}

	public static void searchEmployeee(int id3) {
		boolean f =false;
		try
		{
		//jdbccode 
		Connection con = Connectionjdbc.createC();
		String q="select * from Employeee where sid=?;";

		PreparedStatement p = con.prepareStatement(q);
		p.setInt(1, id3);

       ResultSet set =p.executeQuery(q);


       while(set.next())
       {
    	   int id= set.getInt(1);
    	   String name =set.getString(2);
    	   String phone =set.getString(3);
    	   String city =set.getString(4);

    	   System.out.println("ID: "+id);
    	   System.out.println("Name: "+name);
    	   System.out.println("Phone no :"+phone);
    	   System.out.println("city: "+city);

    	   System.out.println("_______________________________________________________________");




       }

		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
     

	}
}
	
	


