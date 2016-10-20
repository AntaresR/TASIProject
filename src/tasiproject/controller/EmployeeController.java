/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasiproject.controller;

import tasiproject.models.Employee;
import tasiproject.models.ErrorMessage;

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
    public static ErrorMessage registerEmployee(Employee employee) {
        ErrorMessage correct = new ErrorMessage();
        correct.setValid(false);
        //Name
        if (employee.getName() == null) {
            correct.setMessage("El nombre del empleado es nulo");
            return correct;
        }
        if (employee.getName().equals("")) {
            correct.setMessage("El nombre del empleado esta vacio");
            return correct;
        }
        if (employee.getName().matches(".*\\d+.*")) {
            correct.setMessage("El nombre del empleado es numerico");
            return correct;
        }

        //Lastname
        if (employee.getLastname() == null) {
            correct.setMessage("El apellido del empleado es nulo");
            return correct;
        }
        
        if (employee.getLastname().equals("")) {
            correct.setMessage("El apellido del empleado esta vacio");
            return correct;
        }
        if (employee.getLastname().matches(".*\\d+.*")) {
            correct.setMessage("El apellido del empleado es numerico");
            return correct;
        }

        //Maternal Lastname
        if (employee.getMaternalLastName() == null) {
            correct.setMessage("El apellido materno del empleado es nulo");
            return correct;
        }
        
        if (employee.getMaternalLastName().equals("")) {
            correct.setMessage("El apellido materno del empleado esta vacio");
            return correct;
        }
        if (employee.getMaternalLastName().matches(".*\\d+.*")) {//if it is just numbers
            correct.setMessage("El apellido materno del empleado es numerico");
            return correct;
        }

        //DNI
        if (employee.getDni() == null) {
            correct.setMessage("El doc. de identidad del empleado es nulo");
            return correct;
        }
        
        if (employee.getDni().equals("")) {
            correct.setMessage("El doc. de identidad del empleado esta vacio");
            return correct;
        }
        
        if (!employee.getDni().matches(".*\\d+.*")) { //if is not just numbers
            correct.setMessage("El doc. de identidad del empleado es numerico");
            return correct;
        }

        //TODO Employ
        if (employee.getEmploy() == null) {
            correct.setMessage("El empleo del empleado es nulo");
            return correct;
        }

        // Begin date
        if (employee.getEntryDate() == null) {
            correct.setMessage("la fecha de entrada del empleado es nulo");
            return correct;
        }

        // Salary
        if (employee.getCost() > 1000000) {
            correct.setMessage("El empleado gana que las ganancias trimestrales de la empresa");
            return correct;
        }
        
        if (employee.getCost() < 0) {
            correct.setMessage("El empleado no puede ganar valores negativos.");
            return correct;
        }

        // Address
        if (employee.getAdress() == null) {
            correct.setMessage("La direccion del empleado es nula");
            return correct;
        }
        
        if (employee.getAdress().equals("")) {
            correct.setMessage("La direccion del empleado esta vacia");
            return correct;
        }

        // Birthday
        if (employee.getBirthday() == null) {
            correct.setMessage("El cumpleanhos del empleado esta nulo");
            return correct;
        }

        // Cellphone
        if (employee.getCellphone() == null) {
            correct.setMessage("El telefono del empleado es nula");
            return correct;
        }
        
        if (employee.getCellphone().equals("")) {
            correct.setMessage("El telefono del empleado esta vacio");
            return correct;
        }
        
        if (!employee.getCellphone().matches(".*\\d+.*")) { //if is not just numbers
            correct.setMessage("El telefono del empleado contiene caracteres alfanumericos");
            return correct;
        }
        
        correct.setMessage("Empleado guardado.");
        correct.setValid(true);
        //The employee is saved in the database
        return correct;
    }
}