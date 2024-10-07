package com.Controller;

import com.Service.ServiceEmp;

public class ControllerEmp {
	
	ServiceEmp service ;

	public void getAllEmployee() throws Exception{
		service = new ServiceEmp();
		service.allemployee();
	}

	public void insertEmployee() throws Exception {
		service = new ServiceEmp();
		service.insertemployee();
	}

	public void updateEmployee() throws Exception {
		service = new ServiceEmp();
		service.updateEmployee();		
	}

	public void deleteEmployee() throws Exception {
		service = new ServiceEmp();
		service.deleteEmployee();
	}
}
