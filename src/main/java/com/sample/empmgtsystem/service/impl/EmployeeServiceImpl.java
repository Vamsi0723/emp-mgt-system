package com.sample.empmgtsystem.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.empmgtsystem.entity.EmployeeEntity;
import com.sample.empmgtsystem.repo.IEmployeeRepository;
import com.sample.empmgtsystem.service.IEmployeeService;
import com.sample.empmgtsystem.vo.EmployeeVO;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	private final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);
	@Autowired
	IEmployeeRepository oIEmployeeRepository;

	@Override
	public EmployeeVO findEmpById(int id) {
		EmployeeVO oEmployeeVO = new EmployeeVO();
		try {
			BeanUtils.copyProperties(oEmployeeVO, oIEmployeeRepository.findById(id).get());
		} catch (IllegalAccessException | InvocationTargetException e) {
			logger.error("findEmpById--> " + e);
		}
		return oEmployeeVO;
	}

	@Override
	public List<EmployeeVO> getAllEmployees() {
		List<EmployeeVO> lAllEmp = new ArrayList<EmployeeVO>();
		List<EmployeeEntity> allEmployeeEntities = oIEmployeeRepository.findAll();
		for (EmployeeEntity obj : allEmployeeEntities) {
			try {
				EmployeeVO oEmployeeVO = new EmployeeVO();
				BeanUtils.copyProperties(oEmployeeVO, obj);
				lAllEmp.add(oEmployeeVO);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error("getAllEmployees--> " + e);
			}
			
		}
		return lAllEmp;
	}
	
	public void saveOrUpdate(EmployeeVO oEmployeeVO) {
		EmployeeEntity saveEnt = new EmployeeEntity();
		try {
			BeanUtils.copyProperties(saveEnt, oEmployeeVO);
		} catch (IllegalAccessException | InvocationTargetException e) {
			logger.error("saveOrUpdate--> " + e);
		}
		oIEmployeeRepository.save(saveEnt);
    }

    public void delete(int id) {
    	oIEmployeeRepository.deleteById(id);
    }

}
