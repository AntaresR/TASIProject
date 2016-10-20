package tasiproject.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Assert;
import org.junit.Test;
import tasiproject.controller.ScheduleController;
import tasiproject.models.Schedule;

/**
 * @author paolo rossi ramayoni 20105435
 */
public class Schedule_insert_test {

    //Prueba 1 (correcta). 1a1, 2b1, 3c1
    @Test
    public final void registerSchedule_correct_test() {
        Schedule schedule = new Schedule();
        try {
            //Variable initialization
            schedule.setBeginTime(new SimpleDateFormat("HH:mm:ss").parse("09:00:00"));
            schedule.setEndTime(new SimpleDateFormat("HH:mm:ss").parse("17:00:00"));
            schedule.setStatus(true);
            schedule.setId(0);
        } catch (ParseException ex) {
            Logger.getLogger(Schedule_insert_test.class.getName()).log(Level.SEVERE, null, ex);
        }
        //System.out.println(ScheduleController.registerSchedule(schedule).getMessage());
        Assert.assertEquals(true, ScheduleController.registerSchedule(schedule).isValid());
    }

    //Prueba  2 : 1a2, 2b1, 3c1
    @Test
    public final void registerSchedule_null_beginDate_test() {
        Schedule schedule = new Schedule();
        try {
            //Variable initialization
            schedule.setBeginTime(null);
            schedule.setEndTime(new SimpleDateFormat("HH:mm:ss").parse("17:00:00"));
            schedule.setStatus(true);
            schedule.setId(0);
        } catch (ParseException ex) {
            Logger.getLogger(Schedule_insert_test.class.getName()).log(Level.SEVERE, null, ex);
        }
        Assert.assertEquals(false, ScheduleController.registerSchedule(schedule).isValid());
    }

    //Prueba  3 : 1a3, 2b1, 3c1
    @Test
    public final void registerSchedule_null_endDate_test() {
        Schedule schedule = new Schedule();
        try {
            //Variable initialization
            schedule.setBeginTime(new SimpleDateFormat("HH:mm:ss").parse("09:00:00"));
            schedule.setEndTime(null);
            schedule.setStatus(true);
            schedule.setId(0);
        } catch (ParseException ex) {
            Logger.getLogger(Schedule_insert_test.class.getName()).log(Level.SEVERE, null, ex);
        }
        Assert.assertEquals(false, ScheduleController.registerSchedule(schedule).isValid());
    }

    //Prueba  4 : 1a1, 2b2, 3c1
    @Test
    public final void registerSchedule_hour_difference_test() {
        Schedule schedule = new Schedule();
        try {
            //Variable initialization
            schedule.setBeginTime(new SimpleDateFormat("HH:mm:ss").parse("09:00:00"));
            schedule.setEndTime(new SimpleDateFormat("HH:mm:ss").parse("16:00:00"));
            schedule.setStatus(true);
            schedule.setId(0);
        } catch (ParseException ex) {
            Logger.getLogger(Schedule_insert_test.class.getName()).log(Level.SEVERE, null, ex);
        }
        Assert.assertEquals(false, ScheduleController.registerSchedule(schedule).isValid());
    }
}