package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DaoEmp {

	Scanner sc = new Scanner(System.in);

	String path = "com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3307/employee-task";
	String uname="root";
	String pwd="root";



	public void getinsertEmployee() throws Exception {

		System.out.println("please enter id of employee");
		int id = sc.nextInt();

		System.out.println("please enter name of employee");
		String name = sc.next();
		sc.nextLine();

		System.out.println("please enter department of employee");
		String department = sc.next();
		sc.nextLine();

		System.out.println("please enter salary of employee");
		int salary = sc.nextInt();

		System.out.println("please enter hiringdate of employee");
		int hiringdate = sc.nextInt();

		System.out.println("please enter address of employee");
		String address = sc.next();
		sc.nextLine();

		Class.forName(path);
		Connection conn = DriverManager.getConnection(url,uname,pwd);
		String query = "INSERT INTO employee (id,name,department,salary,hiringdate,address) VALUES(?,?,?,?,?,?)";
		PreparedStatement st= conn.prepareStatement(query);
		st.setInt(1, id);
		st.setString(2, name);
		st.setString(3, department);
		st.setInt(4, salary);
		st.setInt(5, hiringdate);
		st.setString(6, address);

		int eu = st.executeUpdate();

		if(eu>0){
			System.out.println("successfully added employee data");
		}else
			System.out.println("failed to add employee");

	}


	public void viewAllEmployee() throws Exception {

		//System.out.println("enter employee id");
		//int id= sc.nextInt();
		
		Class.forName(path);
		Connection conn = DriverManager.getConnection(url,uname,pwd);
		String query = "SELECT * FROM employee ";
		PreparedStatement st= conn.prepareStatement(query);
		//st.setInt(1, id);
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("department")+" "+rs.getInt("salary")+" "+rs.getInt("hiringdate")+" "+rs.getString("address"));
		}
		
	}
	
	
	public void updateEmployee() throws Exception {

		System.out.println("enter employee id");
		int id= sc.nextInt();
		
		System.out.println("please enter name of employee");
		String name = sc.next();
		sc.nextLine();

		System.out.println("please enter department of employee");
		String department = sc.next();
		sc.nextLine();

		System.out.println("please enter salary of employee");
		int salary = sc.nextInt();

		System.out.println("please enter hiringdate of employee");
		int hiringdate = sc.nextInt();

		System.out.println("please enter address of employee");
		String address = sc.next();
		sc.nextLine();

		
		Class.forName(path);
		Connection conn = DriverManager.getConnection(url,uname,pwd);
		String query = "UPDATE employee SET  name =?, department=?, salary=?, hiringdate=?, address=? WHERE id =? ";
		PreparedStatement st= conn.prepareStatement(query);
		
		st.setString(1, name);
		st.setString(2, department);
		st.setInt(3, salary);
		st.setInt(4, hiringdate);
		st.setString(5, address);
		st.setInt(6, id);

		int up = st.executeUpdate();	
		
		if(up >0)
			System.out.println("data is updated");
		else
			System.out.println("data is failed to inserted");
	}
	
	
	public void DeleteEmployee() throws Exception {

		System.out.println("enter employee id");
		int id= sc.nextInt();

		
		Class.forName(path);
		Connection conn = DriverManager.getConnection(url,uname,pwd);
		String query = "DELETE FROM employee WHERE id = ?";
		PreparedStatement st= conn.prepareStatement(query);
		
	
		st.setInt(1, id);

		int up = st.executeUpdate();	
		
		if(up >0)
			System.out.println("data is deleted");
		else
			System.out.println("data is not deleted");
	}	
}
