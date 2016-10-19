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
 * @author paolo rossi ramayoni 20105435
 */
public class Employee_insert_test {

    //Prueba 1 : 1a1, 2b1, 3c1, 4d1, 5e1, 6f1, 7g1
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
        
        Assert.assertEquals(EmployeeController.registerEmployee(employee), false);
    }

    //Prueba 4 : 1a4, 2b1, 3c1, 4d1, 5e1, 6f1, 7g1
    @Test
    public final void registerEmployee_null_name_test() {
        //Variable initialization
        Employee employee = new Employee();
        employee.setName(null);
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

        Assert.assertEquals(EmployeeController.registerEmployee(employee), false);
    }

    //Prueba 5 : 1a1, 2b2, 3c1, 4d1, 5e1, 6f1, 7g1
    @Test
    public final void registerEmployee_empty_lastname_test() {
        //Variable initialization
        Employee employee = new Employee();
        employee.setName("Paolo");
        employee.setLastname("");
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

        Assert.assertEquals(EmployeeController.registerEmployee(employee), false);
    }

    //Prueba 6 : 1a1, 2b3, 3c1, 4d1, 5e1, 6f1, 7g1
    @Test
    public final void registerEmployee_alphanumeric_lastname_test() {
        //Variable initialization
        Employee employee = new Employee();
        employee.setName("Paolo");
        employee.setLastname("122345");
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

        Assert.assertEquals(EmployeeController.registerEmployee(employee), false);
    }

    //Prueba 7 : 1a1, 2b4, 3c1, 4d1, 5e1, 6f1, 7g1
    @Test
    public final void registerEmployee_null_lastname_test() {
        //Variable initialization
        Employee employee = new Employee();
        employee.setName("Paolo");
        employee.setLastname(null);
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

        Assert.assertEquals(EmployeeController.registerEmployee(employee), false);
    }

    //Prueba 8 : 1a1, 2b1, 3c2, 4d1, 5e1, 6f1, 7g1
    @Test
    public final void registerEmployee_empty_lastnameM_test() {
        //Variable initialization
        Employee employee = new Employee();
        employee.setName("Alvkarito");
        employee.setLastname("lastname");
        employee.setMaternalLastName("");
        employee.setCost(10121);
        employee.setEntryDate(new Date());
        employee.setDni("java");

        employee.setAdress("Calle El Caserio Mz. F1 Lote 4");
        employee.setBirthday(new Date());
        employee.setCellphone("950078142"); 
        //TODO for now is empty 
        Employ employ = new Employ();
        employee.setEmploy(employ);

        Assert.assertEquals(EmployeeController.registerEmployee(employee), false);
    }
    
    //Prueba 9 : 1a1, 2b1, 3c3, 4d1, 5e1, 6f1, 7g1
    @Test
    public final void registerEmployee_alphanumeric_lastnameM_test() {
        //Variable initialization
        Employee employee = new Employee();
        employee.setName(null);
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

        Assert.assertEquals(EmployeeController.registerEmployee(employee), false);
    }
     
    // Prueba 10 : 1a1, 2b1, 3c4, 4d1, 5e1, 6f1, 7g1
    @Test
    public final void registerEmployee_null_lastnameM_test() {
        //Variable initialization
        Employee employee = new Employee();
        employee.setName(null);
        employee.setLastname("lastname");
        employee.setMaternalLastName(null);
        employee.setCost(10121);
        employee.setEntryDate(new Date());
        employee.setDni("java");
        
        employee.setAdress("Calle El Caserio Mz. F1 Lote 4");
        employee.setBirthday(new Date());
        employee.setCellphone("950078142"); 
        //TODO for now is empty 
        Employ employ = new Employ();
        employee.setEmploy(employ);

        Assert.assertEquals(EmployeeController.registerEmployee(employee), false);
    }
    
     // Prueba 11 : 1a1, 2b1, 3c1, 4d2, 5e1, 6f1, 7g1
    @Test
    public final void registerEmployee_empty_identityDocument_test() {
        //Variable initialization
        Employee employee = new Employee();
        employee.setName("paolo");
        employee.setLastname("lastname");
        employee.setMaternalLastName("paolo");
        employee.setCost(10121);
        employee.setEntryDate(new Date());
        employee.setDni("");
        
        employee.setAdress("Calle El Caserio Mz. F1 Lote 4");
        employee.setBirthday(new Date());
        employee.setCellphone("950078142"); 
        //TODO for now is empty 
        Employ employ = new Employ();
        employee.setEmploy(employ);

        Assert.assertEquals(EmployeeController.registerEmployee(employee), false);
    }   
    
    // Prueba 12 : 1a1, 2b1, 3c1, 4d3, 5e1, 6f1, 7g1, h1, i1, j1
    @Test
    public final void registerEmployee_alphanumerics_identityDocument_test() {
        //Variable initialization
        Employee employee = new Employee();
        employee.setName("paolo");
        employee.setLastname("lastname");
        employee.setMaternalLastName("paolo");
        employee.setCost(10121);
        employee.setEntryDate(new Date());
        employee.setDni("no hay doc");
        
        employee.setAdress("Calle El Caserio Mz. F1 Lote 4");
        employee.setBirthday(new Date());
        employee.setCellphone("950078142"); 
        //TODO for now is empty 
        Employ employ = new Employ();
        employee.setEmploy(employ);

        Assert.assertEquals(EmployeeController.registerEmployee(employee), false);
    }
    
    // Prueba 13 : 1a1, 2b1, 3c1, 4d4, 5e1, 6f1, 7g1, h1, i1, j1
    
    
    // Prueba 14 : 1a1, 2b1, 3c1, 4d1, 5e2, 6f1, 7g1, h1, i1, j1
    
    
    // Prueba 15 : 1a1, 2b1, 3c1, 4d1, 5e3, 6f1, 7g1, h1, i1, j1
    
    
    // Prueba 16 : 1a1, 2b1, 3c1, 4d1, 5e4, 6f1, 7g1, h1, i1, j1
    
    
    // Prueba 17 : 1a1, 2b1, 3c1, 4d1, 5e1, 6f2, 7g1, h1, i1, j1
    
    
    // Prueba 18 : 1a1, 2b1, 3c1, 4d1, 5e1, 6f1, 7g2, h1, i1, j1
    
    
    // Prueba 19 : 1a1, 2b1, 3c1, 4d1, 5e1, 6f1, 7g3, h1, i1, j1
    
    
    // Prueba 20 : 1a1, 2b1, 3c1, 4d1, 5e1, 6f1, 7g3, h2, i1, j1
    
    
    // Prueba 21 : 1a1, 2b1, 3c1, 4d1, 5e1, 6f1, 7g3, h3, i1, j1
    
    
    // Prueba 22 : 1a1, 2b1, 3c1, 4d1, 5e1, 6f1, 7g3, h1, i2, j1
    
    
    // Prueba 23 : 1a1, 2b1, 3c1, 4d1, 5e1, 6f1, 7g3, h1, i1, j2
    
    
    // Prueba 24 : 1a1, 2b1, 3c1, 4d1, 5e1, 6f1, 7g3, h1, i1, j3
    
    
    
}