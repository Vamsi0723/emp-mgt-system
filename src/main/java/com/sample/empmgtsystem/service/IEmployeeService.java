package com.sample.empmgtsystem.service;

import java.util.List;


import com.sample.empmgtsystem.vo.EmployeeVO;

public interface IEmployeeService {
	
	EmployeeVO findEmpById(int id);

	List<EmployeeVO> getAllEmployees();

	void saveOrUpdate(EmployeeVO oEmployeeVO);

	void delete(int id);

}
