package tasiproject.view;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import tasiproject.controller.AssistanceController;
import tasiproject.models.Assistance;
import tasiproject.models.Employee;
import tasiproject.models.Schedule;

/**
 * @author paolo rossi ramayoni 20105435
 */
public class Assistance_insert_test {

    //Prueba 1 : 1a1, 2b1, 3c1
    @Test
    public final void registerAssistance_correct_test() {
        //Variable initialization
        List<Assistance> assistances = new ArrayList<>();
        Assistance assistance = new Assistance();

        Employee employee = new Employee();
        assistance.setEmployee(employee);

        Schedule schedule = new Schedule();
        schedule.setBeginTime(new Date());
        schedule.setEndTime(new Date());
        assistance.setSchedule(schedule);

        assistances.add(assistance);

        Assert.assertEquals(true, AssistanceController.registerAssistance(assistances).isValid());
    }

    //Prueba  2 : 1a2, 2b1, 3c1
    @Test
    public final void registerAssistance_employee_null_test() {
        //Variable initialization
        List<Assistance> assistances = new ArrayList<>();
        Assistance assistance = new Assistance();
        assistance.setEmployee(null);

        Schedule schedule = new Schedule();
        schedule.setBeginTime(new Date());
        schedule.setEndTime(new Date());
        assistance.setSchedule(schedule);

        assistances.add(assistance);

        Assert.assertEquals(false, AssistanceController.registerAssistance(assistances).isValid());
    }

    //Prueba  3 : 1a1, 2b2, 3c1
    @Test
    public final void registerAssistance_schedule_null_test() {
        //Variable initialization
        List<Assistance> assistances = new ArrayList<>();
        Assistance assistance = new Assistance();

        assistance.setSchedule(null);

        assistances.add(assistance);

        Assert.assertEquals(false, AssistanceController.registerAssistance(assistances).isValid());
    }

    //Prueba  4 : 1a1, 2b3, 3c1
    @Test
    public final void registerAssistance_schedule_inconsistence_test() {
        //Variable initialization
        List<Assistance> assistances = new ArrayList<>();
        Assistance assistance = new Assistance();

        Employee employee = new Employee();
        assistance.setEmployee(employee);

        Schedule schedule = new Schedule();
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, 1);
        schedule.setBeginTime(c.getTime());

        schedule.setEndTime(new Date());

        assistance.setSchedule(schedule);

        assistances.add(assistance);

        Assert.assertEquals(false, AssistanceController.registerAssistance(assistances).isValid());
    }

    //Prueba  5 : 1a1, 2b4, 3c1
    @Test
    public final void registerAssistance_beginTime_missing_test() {
        //Variable initialization
        List<Assistance> assistances = new ArrayList<>();
        Assistance assistance = new Assistance();

        Employee employee = new Employee();
        assistance.setEmployee(employee);

        Schedule schedule = new Schedule();
        schedule.setBeginTime(null);
        schedule.setEndTime(new Date());
        assistance.setSchedule(schedule);

        assistances.add(assistance);

        Assert.assertEquals(false, AssistanceController.registerAssistance(assistances).isValid());
    }

    //Prueba  6 : 1a1, 2b5, 3c1
    @Test
    public final void registerAssistance_endTime_missing_test() {
        //Variable initialization
        List<Assistance> assistances = new ArrayList<>();
        Assistance assistance = new Assistance();

        Employee employee = new Employee();
        assistance.setEmployee(employee);

        Schedule schedule = new Schedule();
        schedule.setBeginTime(new Date());
        schedule.setEndTime(null);
        assistance.setSchedule(schedule);

        assistances.add(assistance);

        Assert.assertEquals(false, AssistanceController.registerAssistance(assistances).isValid());
    }

    //Prueba  7 : 1a1, 2b1, 3c2
    @Test
    public final void registerAssistance_negative_balance_test() {
        //Variable initialization
        List<Assistance> assistances = new ArrayList<>();
        Assistance assistance = new Assistance();

        Employee employee = new Employee();
        assistance.setEmployee(employee);

        Schedule schedule = new Schedule();
        schedule.setBeginTime(new Date());
        schedule.setEndTime(new Date());
        assistance.setSchedule(schedule);

        assistance.setBalance(-1);

        assistances.add(assistance);

        Assert.assertEquals(false, AssistanceController.registerAssistance(assistances).isValid());
    }
}