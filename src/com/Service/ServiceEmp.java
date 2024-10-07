package com.Service;

import com.Dao.DaoEmp;

public class ServiceEmp {

	DaoEmp dao ;

	public void allemployee() throws Exception {
		dao = new DaoEmp();
		dao.viewAllEmployee();
	}

	public void insertemployee() throws Exception{
		dao = new DaoEmp();
		dao.getinsertEmployee();
	}

	public void updateEmployee() throws Exception {
		dao = new DaoEmp();
		dao.updateEmployee();	
	}

	public void deleteEmployee() throws Exception {
		dao = new DaoEmp();
		dao.DeleteEmployee();	
	}
}
