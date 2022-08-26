package com.samco.lettuserediscrud.test;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.samco.lettuserediscrud.dao.IEmployeeDao;
import com.samco.lettuserediscrud.model.Employee;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    private IEmployeeDao empDao;

    @Override
    public void run(String... args) throws Exception {

           //saving one employee
       empDao.saveEmployee(new Employee());

          //saving multiple employees
       empDao.saveAllEmployees(
            Map.of( 501, new Employee(),
                    502, new Employee(),
                    503, new Employee()
                  )
       );

         //modifying employee with empId 503
       empDao.updateEmployee(new Employee());

         //deleting employee with empID 500
       empDao.deleteEmployee(500);

        //retrieving all employees
       empDao.getAllEmployees().forEach((k,v)-> System.out.println(k +" : "+v));

        //retrieving employee with empID 501
       System.out.println("Emp details for 501 : "+empDao.getOneEmployee(501));
    }
}