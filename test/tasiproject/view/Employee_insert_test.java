/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasiproject.view;

import java.util.Date;
import org.junit.Assert;
import org.junit.Test;
import tasiproject.controller.EmployeeController;
import tasiproject.models.Employ;
import tasiproject.models.Employee;

/**
 *
 * @author alulab14
 */
public class Employee_insert_test {

    //Prueba 1 : 1a2, 2b1, 3c1, 4d1, 5e1, 6f1, 7g1
    @Test
    public final void registerEmployee_correct_test() {
        //Variable initialization
        Employee employee = new Employee();
        employee.setName("Paolo");
        employee.setLastname("lastname");
        employee.setMaternalLastName("lastnameM");
        employee.setCost(10121);
        employee.setEntryDate(new Date());
        employee.setDni("java");
        //
        employee.setAdress("Calle El Caserio Mz. F1 Lote 4");
        employee.setBirthday(new Date());
        employee.setCellphone("950078142");
 
        //TODO for now is empty 
        Employ employ = new Employ();
        employee.setEmploy(employ);
        
        Assert.assertEquals(EmployeeController.registerEmployee(employee), true);
    }

    //Prueba 2 : 1a2, 2b1, 3c1, 4d1, 5e1, 6f1, 7g1
    @Test
    public final void registerEmployee_empty_name_test() {
        //Variable initialization
        Employee employee = new Employee();
        employee.setName("");
        employee.setLastname("lastname");
        employee.setMaternalLastName("lastnameM");
        employee.setCost(10121);
        employee.setEntryDate(new Date());
        employee.setDni("java");
        
        employee.setAdress("Calle El Caserio Mz. F1 Lote 4");
        employee.setBirthday(new Date());
        employee.setCellphone("950078142");
        
        //TODO for now is empty 
        Employ employ = new Employ();
        employee.setEmploy(employ);
        
        Assert.assertEquals(EmployeeController.registerEmployee(employee), true);
    }

    //Prueba 3 : 1a3, 2b1, 3c1, 4d1, 5e1, 6f1, 7g1
    @Test
    public final void registerEmployee_numeric_name_test() {
        //Variable initialization
        Employee employee = new Employee();
        employee.setName("1233456");
        employee.setLastname("lastname");
        employee.setLastnameM("lastnameM");
        employee.setSalary(10121);
        employee.setBegindate(new Date());
        employee.setEmploy("Javero");
        employee.setIdentityDocument("java");

        Assert.assertEquals(EmployeeManager.registerEmployee(employee), false);
    }

    //Prueba 4 : 1a4, 2b1, 3c1, 4d1, 5e1, 6f1, 7g1
    @Test
    public final void registerEmployee_null_name_test() {
        //Variable initialization
        Employee employee = new Employee();
        employee.setName(null);
        employee.setLastname("lastname");
        employee.setLastnameM("lastnameM");
        employee.setSalary(10121);
        employee.setBegindate(new Date());
        employee.setEmploy("Javero");
        employee.setIdentityDocument("java");

        Assert.assertEquals(EmployeeManager.registerEmployee(employee), false);
    }

    //Prueba 5 : 1a1, 2b2, 3c1, 4d1, 5e1, 6f1, 7g1
    @Test
    public final void registerEmployee_empty_lastname_test() {
        //Variable initialization
        Employee employee = new Employee();
        employee.setName("Paolo");
        employee.setLastname("");
        employee.setLastnameM("lastnameM");
        employee.setSalary(10121);
        employee.setBegindate(new Date());
        employee.setEmploy("Javero");
        employee.setIdentityDocument("java");

        Assert.assertEquals(EmployeeManager.registerEmployee(employee), false);
    }

    //Prueba 6 : 1a1, 2b3, 3c1, 4d1, 5e1, 6f1, 7g1
    @Test
    public final void registerEmployee_alphanumeric_lastname_test() {
        //Variable initialization
        Employee employee = new Employee();
        employee.setName("Paolo");
        employee.setLastname("122345");
        employee.setLastnameM("lastnameM");
        employee.setSalary(10121);
        employee.setBegindate(new Date());
        employee.setEmploy("Javero");
        employee.setIdentityDocument("java");

        Assert.assertEquals(EmployeeManager.registerEmployee(employee), false);
    }

    //Prueba 7 : 1a1, 2b4, 3c1, 4d1, 5e1, 6f1, 7g1
    @Test
    public final void registerEmployee_null_lastname_test() {
        //Variable initialization
        Employee employee = new Employee();
        employee.setName("Paolo");
        employee.setLastname(null);
        employee.setLastnameM("lastnameM");
        employee.setSalary(10121);
        employee.setBegindate(new Date());
        employee.setEmploy("Javero");
        employee.setIdentityDocument("java");

        Assert.assertEquals(EmployeeManager.registerEmployee(employee), false);
    }

    //Prueba 8 : 1a1, 2b1, 3c2, 4d1, 5e1, 6f1, 7g1
    @Test
    public final void registerEmployee_empty_lastnameM_test() {
        //Variable initialization
        Employee employee = new Employee();
        employee.setName("Alvkarito");
        employee.setLastname("lastname");
        employee.setLastnameM("");
        employee.setSalary(10121);
        employee.setBegindate(new Date());
        employee.setEmploy("Javero");
        employee.setIdentityDocument("java");

        Assert.assertEquals(EmployeeManager.registerEmployee(employee), false);
    }
    
    //Prueba 9 : 1a1, 2b1, 3c3, 4d1, 5e1, 6f1, 7g1
    @Test
    public final void registerEmployee_alphanumeric_lastnameM_test() {
        //Variable initialization
        Employee employee = new Employee();
        employee.setName(null);
        employee.setLastname("lastname");
        employee.setLastnameM("lastnameM");
        employee.setSalary(10121);
        employee.setBegindate(new Date());
        employee.setEmploy("Javero");
        employee.setIdentityDocument("java");

        Assert.assertEquals(EmployeeManager.registerEmployee(employee), false);
    }
     
    // Prueba 10 : 1a1, 2b1, 3c4, 4d1, 5e1, 6f1, 7g1
    @Test
    public final void registerEmployee_null_lastnameM_test() {
        //Variable initialization
        Employee employee = new Employee();
        employee.setName(null);
        employee.setLastname("lastname");
        employee.setLastnameM(null);
        employee.setSalary(10121);
        employee.setBegindate(new Date());
        employee.setEmploy("Javero");
        employee.setIdentityDocument("java");

        Assert.assertEquals(EmployeeManager.registerEmployee(employee), false);
    }
    
     // Prueba 11 : 1a1, 2b1, 3c1, 4d2, 5e1, 6f1, 7g1
    @Test
    public final void registerEmployee_empty_identityDocument_test() {
        //Variable initialization
        Employee employee = new Employee();
        employee.setName("paolo");
        employee.setLastname("lastname");
        employee.setLastnameM("paolo");
        employee.setSalary(10121);
        employee.setBegindate(new Date());
        employee.setEmploy("Javero");
        employee.setIdentityDocument("");

        Assert.assertEquals(EmployeeManager.registerEmployee(employee), false);
    }
    
    
}
