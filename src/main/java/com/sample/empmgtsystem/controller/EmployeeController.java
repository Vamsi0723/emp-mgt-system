package com.sample.empmgtsystem.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.empmgtsystem.service.IEmployeeService;
import com.sample.empmgtsystem.vo.EmployeeVO;


@RestController
@RequestMapping("/employee-api")
public class EmployeeController {

	
	@Autowired
	IEmployeeService oIEmployeeService;
	
	@GetMapping(value = "/findEmpById/{id}", produces = "application/json")
	public @ResponseBody EmployeeVO findEmpById(@PathVariable int id) {
		return oIEmployeeService.findEmpById(id);
	}
	
	@PostMapping(value = "/saveOrUpdate")
	public void saveOrUpdateEmp(@RequestBody EmployeeVO oEmployeeVO) {
		 oIEmployeeService.saveOrUpdate(oEmployeeVO);
	}
	
	@DeleteMapping(value = "/deleteEmpById/{id}")
	public void deleteEmpById(@PathVariable int id) {
		 oIEmployeeService.delete(id);
	}
	
	@GetMapping(value = "/findAllEmp", produces = "application/json")
	public @ResponseBody List<EmployeeVO> findAllEmp() {
		return oIEmployeeService.getAllEmployees();
	}
}
