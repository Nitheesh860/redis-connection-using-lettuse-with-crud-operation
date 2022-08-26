package com.samco.lettuserediscrud.control;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.samco.lettuserediscrud.dao.EmployeeDaoImpl;
import com.samco.lettuserediscrud.model.Employee;

public class Controller 
{
    @Autowired
    EmployeeDaoImpl empImpl;
    @RequestMapping("/Employee")
    @ResponseBody
    public ResponseEntity<Map<Integer,Employee>>getAllEmployees(){
    	Map<Integer,Employee> emp = empImpl.getAllEmployees();
    	return new ResponseEntity<Map<Integer,Employee>>(emp,HttpStatus.OK);
    }
}
