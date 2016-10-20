package tasiproject.controller;

import java.util.List;
import tasiproject.models.Assistance;
import tasiproject.models.ErrorMessage;

/**
 * @author paolo
 */
public class AssistanceController {

    public static ErrorMessage registerAssistance(List<Assistance> assistances) {
        ErrorMessage errorMessage = new ErrorMessage();
        errorMessage.setValid(false);
        if (assistances.isEmpty()) {
            errorMessage.setMessage("La lista esta vacia");
            return errorMessage;
        }

        for (int i = 0; i < assistances.size(); i++) {
            Assistance assistance = assistances.get(i);
            if (assistance.getEmployee() == null) {
                errorMessage.setMessage("El empleado" + (i + 1) + " tiene el nombre nulo");
                return errorMessage;
            }

            if (assistance.getSchedule() == null) {
                errorMessage.setMessage("El empleado" + (i + 1) + " no tiene horas registradas");
                return errorMessage;
            }

            if (assistance.getSchedule().getBeginTime() == null) {
                errorMessage.setMessage("El empleado" + (i + 1) + " no tiene hora de inicio registrada");
                return errorMessage;
            }

            if (assistance.getSchedule().getEndTime() == null) {
                errorMessage.setMessage("El empleado" + (i + 1) + " no tiene hora de salida registrada");
                return errorMessage;
            }

            if (assistance.getSchedule().getEndTime().before(assistance.getSchedule().getBeginTime())) {
                errorMessage.setMessage("El empleado" + (i + 1) + " tiene horas de entrada y salida inconsistentes");
                return errorMessage;
            }
            
            if (assistance.getBalance()<0){
                errorMessage.setMessage("El empleado" + (i+1) + " tiene un balance negativo.");
                return errorMessage;
            }
        }
        //register the list of all assistances;
        errorMessage.setMessage("Asistencias del dia guardadas");
        errorMessage.setValid(true);
        return errorMessage;
    }
}
