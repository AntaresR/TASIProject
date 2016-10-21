/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasiproject.controller;

import java.util.List;
import tasiproject.models.ErrorMessage;
import tasiproject.models.InconsistenceJustification;

/**
 *
 * @author paolo
 */
public class JustificationController {

    public static ErrorMessage registerJustification(InconsistenceJustification inconsistenceJustification) {
        ErrorMessage errorMessage = new ErrorMessage();
        errorMessage.setValid(false);

        //motive
        if (inconsistenceJustification.getMotive().equals("Por compensación de horas extras")
                && inconsistenceJustification.getType() == 1) {
            errorMessage.setMessage("El tipo de justificacion por horas extras no puede tener por motivo la compensacion de horas extras.");
            return errorMessage;
        }

        //explanation
        if (inconsistenceJustification.getExplanation() == null) {
            errorMessage.setMessage("La explicacion no puede ser nula");
            return errorMessage;
        }

        if (inconsistenceJustification.getExplanation().isEmpty()) {
            errorMessage.setMessage("La explicacion no puede estar vacia");
            return errorMessage;
        }

        //status
        if (inconsistenceJustification.getStatus() != 0) {
            errorMessage.setMessage("El estado de la justificacion es imposible. Consultar con el administrador del programa.");
            return errorMessage;
        }

        errorMessage.setValid(true);
        return errorMessage;
    }

    public static ErrorMessage acceptOrDenyJustification(List<InconsistenceJustification> data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static List<InconsistenceJustification> getTodayJustifications() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
