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
        }

        for (int i = 0; i < assistances.size(); i++) {
            Assistance assistance = assistances.get(i);
            if (assistance.getEmployee() == null) {
                errorMessage.setMessage("El empleado" + (i + 1) + "tiene el nombre nulo");
            }

            if (assistance.getSchedule() == null) {
                errorMessage.setMessage("El empleado" + (i + 1) + "no tiene horas registradas");
            }

            if (assistance.getSchedule().getBeginTime() == null) {
                errorMessage.setMessage("El empleado" + (i + 1) + "no tiene hora de inicio registrada");
            }

            if (assistance.getSchedule().getEndTime() == null) {
                errorMessage.setMessage("El empleado" + (i + 1) + "no tiene hora de salida registrada");
            }

            if (assistance.getSchedule().getEndTime().before(assistance.getSchedule().getBeginTime())) {
                errorMessage.setMessage("El empleado" + (i + 1) + "tiene horas de entrada y salida inconsistentes");
            }
        }
        //register the list of all assistances;
        return errorMessage;
    }
}
