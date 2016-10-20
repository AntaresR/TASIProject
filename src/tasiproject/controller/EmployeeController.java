/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasiproject.controller;

import tasiproject.models.Employee;

/**
 *
 * @author paolo
 */
public class EmployeeController {

    /**
     * Register the employee on the database
     *
     * @param employee
     * @return operationOk the database signaled that everything went well
     */
    public static boolean registerEmployee(Employee employee) {
        boolean correct = false;

        //Name
        if (employee.getName() == null) {
            return correct;
        }
        if (employee.getName().equals("")) {
            return correct;
        }
        if (employee.getName().matches(".*\\d+.*")) {
            return correct;
        }

        //Lastname
        if (employee.getLastname() == null) {
            return correct;
        }

        if (employee.getLastname().equals("")) {
            return correct;
        }
        if (employee.getLastname().matches(".*\\d+.*")) {
            return correct;
        }

        //Maternal Lastname
        if (employee.getMaternalLastName() == null) {
            return correct;
        }

        if (employee.getMaternalLastName().equals("")) {
            return correct;
        }
        if (employee.getMaternalLastName().matches(".*\\d+.*")) {//if it is just numbers
            return correct;
        }

        //DNI
        if (employee.getDni() == null) {
            return correct;
        }

        if (employee.getDni().equals("")) {
            return correct;
        }

        if (!employee.getDni().matches(".*\\d+.*")) { //if is not just numbers
            return correct;
        }

        //TODO Employ
        if (employee.getEmploy()== null) {return correct;}

        // Begin date
        if (employee.getEntryDate() == null) {
            return correct;
        }

        // Salary
        if (employee.getCost() > 1000000) {
            return correct;
        }

        if (employee.getCost() < 0) {
            return correct;
        }

        // Address
        if (employee.getAdress()== null) {
            return correct;
        }

        if (employee.getAdress().equals("")) {
            return correct;
        }
        
        // Birthday
        if (employee.getBirthday() == null) {
            return correct;
        }

        // Cellphone
        if (employee.getCellphone()== null) {
            return correct;
        }

        if (employee.getCellphone().equals("")) {
            return correct;
        }

        if (!employee.getCellphone().matches(".*\\d+.*")) { //if is not just numbers
            return correct;
        }
        
        correct = true;
        //The employee is saved in the database
        return correct;
    }
}
