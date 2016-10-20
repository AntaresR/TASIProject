package tasiproject.controller;

import tasiproject.models.ErrorMessage;
import tasiproject.models.Schedule;

/**
 * @author paolo
 */
public class ScheduleController {

    public static ErrorMessage registerSchedule(Schedule schedule) {
        ErrorMessage correct = new ErrorMessage();
        correct.setValidity(false);
    
        if (schedule.getBeginTime() == null) {
            correct.setMessage("La hora de inicio no puede ser nula.");
            return correct;
        }
        if (schedule.getEndTime() == null) {
            correct.setMessage("La hora de salida no puede ser nula.");
            return correct;
        }

        int initialTime = schedule.getBeginTime().getHours() * 60 + schedule.getBeginTime().getMinutes();
        int endTime = schedule.getEndTime().getHours() * 60 + schedule.getEndTime().getMinutes();

        if ((initialTime + 8) != endTime) {
            correct.setMessage("El horario debe respetar el formato de 8h.");
            return correct;
        }

        correct.setValidity(true);
        correct.setMessage("Horario registrado.");
        return correct;
    }
}